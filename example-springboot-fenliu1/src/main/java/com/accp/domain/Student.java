package com.accp.domain;

import java.util.List;

public class Student {
    private String studentno;

    private String name;

    private String clazz;

    private Integer pid;
    
    private Professional pro;
    
    private List<Course> cou;
    
    public Professional getPro() {
		return pro;
	}

	public void setPro(Professional pro) {
		this.pro = pro;
	}

	public List<Course> getCou() {
		return cou;
	}

	public void setCou(List<Course> cou) {
		this.cou = cou;
	}

	public String getStudentno() {
        return studentno;
    }

    public void setStudentno(String studentno) {
        this.studentno = studentno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}