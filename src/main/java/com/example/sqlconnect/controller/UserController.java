package com.example.sqlconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.sqlconnect.DAO.UserDAO;
import com.example.sqlconnect.model.Employee_tb;




@Controller
public class UserController {
	
	@Autowired
	UserDAO userdao;
	
	@RequestMapping("slt_login_page")
	public String logger()
	{
		return "slt_login.jsp";
	}
	
	@RequestMapping("tryUser")
	public ModelAndView getUser(@RequestParam int id,@RequestParam String name)
	{
		ModelAndView nav = new ModelAndView("slt_error.jsp");
		ModelAndView mav = new ModelAndView("slt_logged.jsp");
		if (!userdao.findById(id).isPresent()) {
			return nav;
        }
		else {
		Employee_tb detail = userdao.findById(id).orElse(new Employee_tb());
		
		String passx= detail.getPassword();
		 
		System.out.println(passx);
		System.out.println(name);
		System.out.println(id);
		if (passx.equals(name)) {
			if (detail.getPackname().equals("Webfamily")) {
			int extraData = 90 - detail.getRemaining();
			mav.addObject("extraData", extraData);
			 System.out.println(extraData);}
			else {int extraData = 60 - detail.getRemaining();
			mav.addObject("extraData", extraData);
			 System.out.println(extraData);}
		    mav.addObject("detail", detail);
		    System.out.println(detail);
		    return mav;
		} else {
		    return nav;
		}	
		
	}
	}	
	
	@RequestMapping("addUser")
	public String retry()
	{
		return "slt_login.jsp";
	}
	
	@RequestMapping("upUser")
	public String upUser()
	{
		return "signup.jsp";
	}
	
	@RequestMapping("saveUser")
	public String saveUser(Employee_tb detail)
	{
		System.out.println(detail);
		userdao.save(detail);
		return "slt_login.jsp";
	}
	
	
	
	
//	@RequestMapping("index")
//	public String user()
//	{
//		return "index.jsp";
//	}
//	
//	@RequestMapping("addUser")
//	public String addUser(Employee_tb detail)
//	{
//		userdao.save(detail);
//		return "index.jsp";
//	}
//	
//	@RequestMapping("getUser")
//	public ModelAndView getUser(@RequestParam int id)
//	{
//		ModelAndView mav = new ModelAndView("ShowUser.jsp");
//		Employee_tb detail = userdao.findById(id).orElse(new Employee_tb());
//		System.out.println(detail);
//		mav.addObject("detail",detail);
//		return mav;
//	}
//	
//	@RequestMapping("deleteUser")
//	public ModelAndView deleteUser(@RequestParam int id) {
//		ModelAndView mav = new ModelAndView("deleteUser.jsp");
//		Employee_tb detail = userdao.findById(id).orElse(new Employee_tb());
//	    System.out.println(detail);
//	    userdao.deleteById(id);
//	    mav.addObject("detail", detail);
//	    return mav;
//	}


}
