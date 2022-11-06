package com.legendscl.test;

import com.legendscl.dao.teachermapper;
import com.legendscl.pojo.Teacher;
import com.legendscl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class getteacher2_byid {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        teachermapper teacmapper = sqlSession.getMapper(teachermapper.class);
        Teacher teacher = teacmapper.getteacher2(6);
        System.out.println(teacher);



        sqlSession.close();
    }
}
