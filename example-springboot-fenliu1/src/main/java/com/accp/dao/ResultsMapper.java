package com.accp.dao;

import com.accp.domain.Results;
import com.accp.domain.ResultsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultsMapper {
    int countByExample(ResultsExample example);

    int deleteByExample(ResultsExample example);

    int insert(Results record);

    int insertSelective(Results record);

    List<Results> selectByExample(ResultsExample example);

    int updateByExampleSelective(@Param("record") Results record, @Param("example") ResultsExample example);

    int updateByExample(@Param("record") Results record, @Param("example") ResultsExample example);
}