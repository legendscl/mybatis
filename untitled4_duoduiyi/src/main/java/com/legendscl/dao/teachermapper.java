package com.legendscl.dao;

import com.legendscl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface teachermapper {
    @Select("select *from teacher where id=#{tid}")
    Teacher getteacher(@Param("tid") int id);
}
