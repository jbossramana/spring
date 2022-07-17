package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

	@GetMapping
	public String getPowerfulMessage()
	{
		return "Have faith in yourself";
	}
}
