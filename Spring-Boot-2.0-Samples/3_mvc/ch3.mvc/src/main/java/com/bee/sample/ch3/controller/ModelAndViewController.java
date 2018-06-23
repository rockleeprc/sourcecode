package com.bee.sample.ch3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.UserService;

@Controller
@RequestMapping("/model")
public class ModelAndViewController {
	
	@Autowired UserService userService;
	/**
	 * 一个beetl模板测试。因为视图扩展名字是btl
	 * @param userId
	 * @param model
	 * @return
	 */
	@GetMapping(path = "/{userId}/get.html")
	public String getUser(@PathVariable Long userId,Model model) {
		 User userInfo =  userService.getUserById(userId);
		 //model.addAttribute(userInfo); 与下面一行作用一样，但这会有潜在问题
		 model.addAttribute("user", userInfo);
		 return "/userInfo.btl";
	}
	/**
	 * 使用freemaker模板测试，freemaker会寻找/userInfo.ftl 模板
	 * @param userId
	 * @param view
	 * @return
	 */
	@GetMapping(path = "/{userId}/get2.html")
	public ModelAndView getUser2(@PathVariable Long userId,ModelAndView view) {
		 User userInfo =  userService.getUserById(userId);
		 //model.addAttribute(userInfo);
		 view.addObject("user", userInfo);
		 view.setViewName("/userInfo");
		 return view;
	}
	
	
}
