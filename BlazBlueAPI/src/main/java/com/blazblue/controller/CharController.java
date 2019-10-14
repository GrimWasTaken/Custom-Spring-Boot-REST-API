package com.blazblue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blazblue.model.Char;
import com.blazblue.services.CharService;

@RestController
public class CharController {

	@Autowired
	private CharService CharService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/retrieve")
	public @ResponseBody Char getChar(@RequestBody String name) throws Exception
	{
		Char retrieved = CharService.getByName(name);
		
		return retrieved;
	}
}
