package com.freimanvs.magicwheel.rest;

import com.freimanvs.magicwheel.services.HelloService;
import com.freimanvs.magicwheel.services.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private PrintService printService;

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/print/{s}")
	public ResponseEntity<String> print(@PathVariable("s") String s) {
		String res = printService.get(s);
		return ResponseEntity.ok().body(res);
	}

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		String res = helloService.print();
		return ResponseEntity.ok().body(res);
	}
	
}
