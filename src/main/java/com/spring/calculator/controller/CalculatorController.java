package com.spring.calculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
	
	@PostMapping("/s")
	public int Sumar (@ModelAttribute("input1") Integer input1, Model model,@ModelAttribute("input2") Integer input2)
	{
}
	
	