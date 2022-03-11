package br.com.abcosta.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/helloworld")
	public String sayHello() {
		return "Hello world!";
	}
}
