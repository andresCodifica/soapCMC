package com.cmcprueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmcprueba.soap.bean.User;
import com.cmcprueba.soap.service.UserDetailsService;

@RestController
@RequestMapping("/api/rest")
public class Controller {
	@Autowired
	UserDetailsService service;
	
	@RequestMapping(value="/getusers",method = RequestMethod.GET)
	public List<User> getUsers(){
		return service.findAll();
	}
}
