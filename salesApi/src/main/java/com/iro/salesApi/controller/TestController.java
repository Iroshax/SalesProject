package com.iro.salesApi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
public class TestController {

	@RequestMapping("/")  
	@ResponseBody  
	public String index() {  
	    return "That's pretty basic!";  
	}
	
	@RequestMapping("/getSales")  
	@ResponseBody  
	public String getSales() {
		
		List<String> salesList = new ArrayList<>();
		salesList.add("Food 1");
		salesList.add("Drink 1");
		salesList.add("Snack 1");
		
	    return salesList.toString();  
	} 
}

