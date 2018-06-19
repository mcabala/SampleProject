package com.sample.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Messages {
	private static ResourceBundle RESOURCE_BUNDLE = null;

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException var2) {
			return '!' + key + '!';
		}
	}

	public static String toBundleName(String baseName, Locale locale) {
		if (locale == Locale.ENGLISH) {
			return baseName;
		} else {
			String language = locale.getLanguage();
			String country = locale.getCountry();
			String variant = locale.getVariant();
			if (language.equals("") && country.equals("") && variant.equals("")) {
				return baseName;
			} else {
				StringBuilder sb = new StringBuilder(baseName);
				sb.append('_');
				if (!variant.equals("")) {
					sb.append(language).append('_').append(country).append('_').append(variant);
				} else if (!country.equals("")) {
					sb.append(language).append('_').append(country);
				} else {
					sb.append(language);
				}

				return sb.toString();
			}
		}
	}

	static {
		String filePath = System.getProperty("conf_path");
		if (filePath == null) {
			filePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator;
		}

		File file = new File(filePath + toBundleName("messages", ConfigConstant.SELECTED_LOCAL) + ".properties");
		FileInputStream input = null;

		try {
			input = new FileInputStream(file);
		} catch (FileNotFoundException var7) {
			var7.printStackTrace();
			System.out.println();
			System.out.println("Trying to Load Default File ....");
			file = new File(filePath + "messages.properties");

			try {
				input = new FileInputStream(file);
			} catch (FileNotFoundException var6) {
				var6.printStackTrace();
			}
		}

		try {
			RESOURCE_BUNDLE = new PropertyResourceBundle(input);
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}
}
