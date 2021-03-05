package com.grandview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grandview.model.EmailConfig;

@RestController
public class IndexController {
	@Autowired
	EmailConfig config;
	@GetMapping
	public  EmailConfig index() {
		return config;
	}
}
