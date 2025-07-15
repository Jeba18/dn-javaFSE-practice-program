package com.cognizant.spring_learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClass {
	@GetMapping("/")
public String mess()
{
	return "Hello World!";
}
	@GetMapping("about")
	public String about()
	{
		return "About Page";
	}
}
