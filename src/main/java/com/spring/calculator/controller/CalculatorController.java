package com.spring.calculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
=======
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



>>>>>>> 3fe1014f1793592118d23a7b28fb3da8320512b8

@Controller
@RequestMapping(value="/calc")
public class CalculatorController {
<<<<<<< HEAD
	
	@PostMapping("/s")
	public int Sumar (@ModelAttribute("input1") Integer input1, Model model,@ModelAttribute("input2") Integer input2)
	{
}

	
=======


 
	
	@PostMapping(value="/M")
	public String multiplicacion(Model model, @ModelAttribute("input1")int input1,@ModelAttribute("input2")int input2) {
		Integer resultado= (input1 * input2);
		model.addAttribute("equal", resultado);
		
		
		return "calc";
		
		
	
}

}
	

>>>>>>> 3fe1014f1793592118d23a7b28fb3da8320512b8
