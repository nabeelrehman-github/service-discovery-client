package com.servicediscvoery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SchedulerComponent {

	@Autowired
	RestTemplate restTemplate;

	String url = "";

	@Scheduled(fixedDelay = 3000)
	public void callServerEnpoint() {
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		System.out.println("Calling via service discovery -> " + response.getBody());
	}
}
