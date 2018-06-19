package com.sample.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.sample.service.IServiceGateway;

@RestController
@RequestMapping("/animal")
public class SampleController {

	@Autowired
	IServiceGateway service;

	/**
	 * This method will return bird info.
	 * 
	 * @return service
	 */
	@RequestMapping(value = "/birdInfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String birdInfo() {
		return service.birdInfo();
	}

	/**
	 * This method will return fish info.
	 * 
	 * @return service
	 */
	@RequestMapping(value = "/fishInfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String fishInfo() {
		return service.fishInfo();
	}
}