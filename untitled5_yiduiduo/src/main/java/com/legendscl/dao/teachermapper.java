package com.legendscl.dao;

import com.legendscl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface teachermapper {

//    获取老师1.1
    List<Teacher> getteacher();

//    获取指定老师下的学生2.1
    Teacher getteacher2(@Param("tid") int id);

    Teacher getteacher3(@Param("tid") int id);

}
