package com.bee.sample.ch3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.UserService;
/**
 * url映射到方法
 * @author xiandafu
 *
 */
@Controller
@RequestMapping("/user4")
public class Sample34Controller {
	
	@Autowired UserService userService;
	
	@GetMapping("/" )
    public  @ResponseBody String index() {
        return "hell";
    }
	

	
	/**
	 * 客户端请求必须包含application/json 才会处理
	 * @return
	 */
	@GetMapping(value="/all1.json",consumes = "application/json" )
	@ResponseBody
	public   User forJson() {
        return userService.getUserById(1l);
    }
	
	@GetMapping(path = "/user/{userId}.json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public User getUser(@PathVariable Long userId, Model model) {
		 return userService.getUserById(userId);
	}
	
	
	@GetMapping(path = "/update.json", params = "action=save")
	@ResponseBody
	public void saveUser() {
		 System.out.println("call save");
	}
	
	@GetMapping(path = "/update.json", params = "action=update")
	@ResponseBody
	public void updateUser() {
		 System.out.println("call update");
	}
	
	
	
}
