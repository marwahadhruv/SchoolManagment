package com.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Model.SchoolModel;
import com.business.WelcomeBO;
 
@Controller
@RequestMapping("/Welcome")
public class WelcomeController {
	
	@Autowired 
	WelcomeBO welcomeBO;
	

    public WelcomeBO getWelcomeBO() {
		return welcomeBO;
	}

	public void setWelcomeBO(WelcomeBO welcomeBO) {
		this.welcomeBO = welcomeBO;
	}


	@RequestMapping(method = RequestMethod.GET)
    public String login(@ModelAttribute("schoolAttribute") SchoolModel schoolModel, HttpServletRequest request) {
    	//schoolModel.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "login";
    }
 
   /* @RequestMapping(value="/", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }*/
}
