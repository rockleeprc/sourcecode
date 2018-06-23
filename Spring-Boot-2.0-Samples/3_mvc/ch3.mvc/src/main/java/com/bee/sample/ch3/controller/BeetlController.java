package com.bee.sample.ch3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.UserService;
/**
 * 测试使用模板引擎Beetl
 * @author xiandafu
 *
 */
@Controller
@RequestMapping("/beetl")
public class BeetlController {
	@Autowired UserService userService;
	
	@RequestMapping("/index.html")
	public  String say(Model model){
		model.addAttribute("name","hello,world");
		return "/index.btl";
	}
	
	@GetMapping("/showuser.html")
	public ModelAndView showUserInfo(Long id){
		ModelAndView view = new ModelAndView();
		User user = userService.getUserById(id);
		view.addObject("user",user);
		view.setViewName("/userInfo.btl");
		return view;
	}
	

}
