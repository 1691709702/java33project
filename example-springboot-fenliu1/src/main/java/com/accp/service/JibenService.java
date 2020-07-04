package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.JibenMapper;
import com.accp.domain.Jiben;

@Service
@Transactional
public class JibenService {

	@Autowired
	JibenMapper mapper;
	
	
	public List<Jiben> find(){
		return mapper.selectByExample(null);
	}
}
