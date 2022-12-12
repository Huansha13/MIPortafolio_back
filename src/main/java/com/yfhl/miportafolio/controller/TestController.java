package com.yfhl.miportafolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yfhl.miportafolio.model.service.TestService;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = { "*" })
public class TestController {
	
	@Autowired
	private TestService testService;
	
	
	@GetMapping("/data")
	ResponseEntity<?> data() throws Exception {
		return ResponseEntity.ok(testService.testApi());
	}
}