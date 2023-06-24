package com.jbk.My.Spring.Boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
	@RequestMapping("mywebservice")
	public String myname() {
		return "Akshay Nandkumar Late";
		
	}

}
