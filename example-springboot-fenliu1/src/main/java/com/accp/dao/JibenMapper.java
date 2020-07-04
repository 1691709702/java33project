package com.accp.dao;

import com.accp.domain.Jiben;
import com.accp.domain.JibenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JibenMapper {
    int countByExample(JibenExample example);

    int deleteByExample(JibenExample example);

    int insert(Jiben record);

    int insertSelective(Jiben record);

    List<Jiben> selectByExample(JibenExample example);

    int updateByExampleSelective(@Param("record") Jiben record, @Param("example") JibenExample example);

    int updateByExample(@Param("record") Jiben record, @Param("example") JibenExample example);
}