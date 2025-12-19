package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

		@GetMapping("/home")
		public String home() {
			
			return "<h1> Hi Home Page </h1>";
			
		}
		@GetMapping("/dashnoard")
	public String dashboard() {
			return "<h1> Hi Dashboard Page </h1>";
		}
		
	}


