package com.accp.dao;

import com.accp.domain.Professional;
import com.accp.domain.ProfessionalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionalMapper {
    int countByExample(ProfessionalExample example);

    int deleteByExample(ProfessionalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Professional record);

    int insertSelective(Professional record);

    List<Professional> selectByExample(ProfessionalExample example);

    Professional selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Professional record, @Param("example") ProfessionalExample example);

    int updateByExample(@Param("record") Professional record, @Param("example") ProfessionalExample example);

    int updateByPrimaryKeySelective(Professional record);

    int updateByPrimaryKey(Professional record);
}