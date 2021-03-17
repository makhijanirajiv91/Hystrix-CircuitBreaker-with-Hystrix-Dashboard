package com.example.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/serviceOneFallBack")
	public String serviceOneFallBackMethod(){
		return "Service1 is taking longer than expected, please try again later";
	}

	@GetMapping("/serviceTwoFallBack")
	public String serviceTwoFallBackMethod(){
		return "Service2 is longer than expected, please try again later";
	}
}
