package com.blazblue.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blazblue.model.Char;
import com.blazblue.repository.CharRepo;

@Service
public class CharService {

	@Autowired
	private CharRepo charRepo;
	
	
	public Char getByName(String name) throws Exception
	{
		//Container for retrieved character
	Char enteredChar = new Char();
	
	//Array list to hold every character in the database
	ArrayList<Char> allChars = (ArrayList<Char>) charRepo.findAll();
	
	//Loop through each and stop on the one with a name matching the param
	for (int i = 0; i < allChars.size(); i++)
	{
		if(allChars.get(i).getName().equals(name))
				{
			enteredChar = allChars.get(i);
				}
	}
	
	//Return found character
	return enteredChar;
	}
}
