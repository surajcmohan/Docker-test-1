package com.docker1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class MyController {

	@GetMapping
	public String getUser() {
		return "docker 1 responding";
	}
}
