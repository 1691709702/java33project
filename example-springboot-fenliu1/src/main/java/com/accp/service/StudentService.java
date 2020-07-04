package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CourseMapper;
import com.accp.dao.ProfessionalMapper;
import com.accp.dao.ResultsMapper;
import com.accp.dao.StudentMapper;
import com.accp.domain.CourseExample;
import com.accp.domain.Professional;
import com.accp.domain.Results;
import com.accp.domain.Student;

@Service
@Transactional
public class StudentService {

	@Autowired
	StudentMapper mapper;
	
	@Autowired
	ProfessionalMapper promapper;
	
	@Autowired
	CourseMapper coumapper;
	
	@Autowired
	ResultsMapper resmapper;
	
	public List<Student> find(){
		return mapper.selectByExample(null);
	}
	
	public Student findById(String studentNo) {
		Student stu=mapper.selectByPrimaryKey(studentNo);
		Professional pr=promapper.selectByPrimaryKey(stu.getPid());
		stu.setPro(pr);
		CourseExample example=new CourseExample();
		example.createCriteria().andPidEqualTo(pr.getId());
		stu.setCou(coumapper.selectByExample(example));
		return stu;
	}
	
	public int create(Professional pro) {
		for (Results results : pro.getRes()) {
			resmapper.insert(results);
		}
		return 0;
	}
}
