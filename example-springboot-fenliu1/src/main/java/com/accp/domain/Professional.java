package com.accp.domain;

import java.util.List;

public class Professional {
    private Integer id;

    private String pname;
    private List<Results> res;
    
    public List<Results> getRes() {
		return res;
	}

	public void setRes(List<Results> res) {
		this.res = res;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}