package com.gen.HelloWorld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloController {

	@GetMapping
	public String hello2 () {
		return "Meus objetivos: Estudar mais java, e revisar HTML. Aprender mais sobre Spring e DB";
	}
}
