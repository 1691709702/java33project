package com.accp.controller;

import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Professional;
import com.accp.domain.Results;
import com.accp.domain.Student;
import com.accp.service.StudentService;
import com.fasterxml.jackson.annotation.JsonFormat;

@Controller
@RequestMapping("/stu")
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping("/toFind")
	public String toFind() {
		return "stuFind";
	}
	
	@RequestMapping("/find")
	@ResponseBody
	public List<Student> find(){
		return service.find();
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public Student findById(String sid) {
		return service.findById(sid);
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public int create(@RequestBody Professional pro) {
		return service.create(pro);
	}
}
