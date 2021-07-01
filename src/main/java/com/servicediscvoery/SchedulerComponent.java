package com.servicediscvoery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SchedulerComponent {

	@Autowired
	RestTemplate restTemplate;

	String url = "http://test-server:8080/users";

	@Scheduled(fixedDelay = 3000)
	public void callServerEnpoint() {
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		System.out.println("Calling via service discovery -> " + response.getBody());
	}
}
