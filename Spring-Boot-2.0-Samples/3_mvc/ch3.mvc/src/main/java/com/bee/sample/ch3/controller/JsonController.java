package com.bee.sample.ch3.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 日期转化需要参考JacksonConfig类
 * @author xiandafu
 *
 */
@Controller
@RequestMapping("/json")
public class JsonController {
	@Autowired UserService userService;
	
	
	
	@GetMapping("/user/{id}.json")
	public @ResponseBody User showUserInfo( @PathVariable Long id){
		User user = userService.getUserById(id);
		return user;
	}
	
	@GetMapping("/now.json")
	public @ResponseBody Map datetime(){
		//JacksonConfig 配置了序列化日期
		Map map = new HashMap();
		map.put("time", new Date());
		return map;
	}
	/**
	 * 比如:json/date.json?date=2017-09-20 21:30:15
	 * @param date
	 * @return
	 */
	@GetMapping("/date.json")
	public @ResponseBody Map datetime(Date date){
		//MvcConfigurer 配置了处理查询参数到日期类型的映射
		Map map = new HashMap();
		map.put("time", date);
		return map;
	}
	
	
}
