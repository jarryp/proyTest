package com.palaciossystems.proy1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/first", produces = MediaType.APPLICATION_JSON_VALUE)
public class FirstController {
	
	public FirstController() {
		
	}

	@GetMapping
	@ResponseBody
	public String first() {
		String var = "aabbccdeeff";
		 List<String> list = new ArrayList<>();
		 String result = null;
		 
		 int i;
		 for(i=0;i<var.length();i++) {
			 list.add(var.substring(i, i+1));
		 }
		 
		 for(i=0;i<var.length();i++) {
			 int cont= 0;
			 for (String val : list) {
				if(val.equals(var.subSequence(i, i+1))) {
					cont++;
				}
			}
			
			if(cont==1) {
				result="Present Only Once: "+var.subSequence(i, i+1);
				System.out.println("Present Only Once: "+var.subSequence(i, i+1));
			}
			
		 }
		 return result;
		 }
	
}
