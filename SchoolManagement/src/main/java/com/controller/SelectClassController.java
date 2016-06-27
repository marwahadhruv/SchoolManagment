package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Model.SchoolModel;
import com.Model.SelectClassModel;
import com.Model.WelcomeModel;
import com.business.SelectClassBO;
import com.data.Teacher;

@Controller
@RequestMapping("/SelectClass")
public class SelectClassController {
	
	@Autowired
	SelectClassBO selectClassBO;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
    public String selectClass(@ModelAttribute("teacherAttribute") WelcomeModel welcomeModel, HttpServletRequest request) {
		request.getSession().setAttribute("teacherId", welcomeModel.getTeacherUserName());
        return "selectClass";
    }
	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
    public ModelAndView selectCl(@ModelAttribute("classAttribute") SelectClassModel selectClassModel, HttpServletRequest request) {
		welcomeModel.setSchoolId((Long) request.getSession().getAttribute("schoolId"));
		List<Teacher> listTeacher = welcomeBO.validateTeacher(welcomeModel);
		ModelAndView mav= new ModelAndView();
		if(listTeacher.size()>0){
			mav.addObject("teacherName",listTeacher.get(0).getTeacher_Fname()+listTeacher.get(0).getTeacher_Lname());
			mav.setViewName("selectClass");
		}
		else{
			mav.setViewName("welcome");
		}
        return mav;
    }

	public SelectClassBO getSelectClassBO() {
		return selectClassBO;
	}

	public void setSelectClassBO(SelectClassBO selectClassBO) {
		this.selectClassBO = selectClassBO;
	}

}
