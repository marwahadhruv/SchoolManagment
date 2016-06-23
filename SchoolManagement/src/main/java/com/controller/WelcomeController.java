package com.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Model.SchoolModel;
import com.Model.WelcomeModel;
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


	@RequestMapping(value = "",method = RequestMethod.GET)
    public String welcomeTeacher(@ModelAttribute("schoolAttribute") SchoolModel schoolModel, HttpServletRequest request) {
		request.getSession().setAttribute("schoolId", schoolModel.getSchoolId());
        return "welcome";
    }
	
	@RequestMapping(value = "/validateTeacher", method = RequestMethod.GET)
    public String validateTeacher(@ModelAttribute("welcomeAttribute") WelcomeModel welcomeModel, HttpServletRequest request) {
		welcomeModel.setSchoolId((Long) request.getSession().getAttribute("schoolId"));
		welcomeBO.validateTeacher(welcomeModel);
        return "welcome";
    }
 
	
}