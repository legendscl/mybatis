package com.legendscl.test;

import com.legendscl.dao.studentmapper;

import com.legendscl.pojo.Student;

import com.legendscl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class student {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        studentmapper mapper = sqlSession.getMapper(studentmapper.class);
        List<Student> list = mapper.getstudent();

        for (Student stu:list) {
            System.out.println(stu);
        }

        sqlSession.close();
    }
}
