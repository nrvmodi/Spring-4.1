package com.nirav.modi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nirav.modi.repository.PersonRepository;


@RestController
@RequestMapping("home")
@Scope("request")
public class HomeController {
	
	@Autowired
	private PersonRepository personRepository;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String get(){
		return "Get Request called : Use of Condition annotation :"+personRepository.getDetail();
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public String put(){
		return "Put Request Called without mapping URL.";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String post(){
		return "Post Request Called without mapping URL.";
	}
}
