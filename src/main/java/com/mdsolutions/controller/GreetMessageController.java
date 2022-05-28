package com.mdsolutions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMessageController {

	@GetMapping("/greet/simpleReqParam")
	public String simpleReqParamMessage(@RequestParam String message) {
		return "Greeting from ReqParam Controller :"+message;
	}
	
	@GetMapping("/greet/simplePathParam/{message}")
	public String simplePathParamMessage(@PathVariable String message) {
		return "Greeting from PathParam Controller :"+message;
	}
}
