package com.spring.calculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/calc")
public class CalculatorController {
	
	@PostMapping("/S")
	public String suma (@ModelAttribute("input1") int input1, Model model,@ModelAttribute("input2") int input2)
	{
		Integer resultado= (input1 + input2);
		model.addAttribute("equal", resultado);
		
		
		return "calc";
}


 
	
	@PostMapping(value="/M")
	public String multiplicacion(Model model, @ModelAttribute("input1")int input1,@ModelAttribute("input2")int input2) {
		Integer resultado= (input1 * input2);
		model.addAttribute("equal", resultado);
		
		
		return "calc";
		
		
	
}

}
	


