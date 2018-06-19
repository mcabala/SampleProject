package com.sample.service;

import com.sample.birds.Bird;
import com.sample.fish.Fish;

@org.springframework.stereotype.Service
public class ServiceGateway implements IServiceGateway {
	@Override
	public String birdInfo() {
		Bird bird = new Bird();
		return bird.birdInfo();
	}

	@Override
	public String fishInfo() {
		Fish fish = new Fish();
		return fish.fishInfo();
	}
}
