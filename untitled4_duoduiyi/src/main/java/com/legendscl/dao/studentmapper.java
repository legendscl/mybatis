package com.legendscl.dao;

import com.legendscl.pojo.Student;
import com.legendscl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface studentmapper {


    List<Student> getstudent( );
    List<Student> getstudent2( );
}
