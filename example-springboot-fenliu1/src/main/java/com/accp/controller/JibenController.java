package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Jiben;
import com.accp.service.JibenService;

@Controller
public class JibenController {

	@Autowired
	JibenService service;
	
	
	@RequestMapping("/tofind")
	public String tofind() {
		return "find";
	}
	
	@RequestMapping("/find")
	@ResponseBody
	public List<Jiben> find(){
		return service.find();
	}
}
