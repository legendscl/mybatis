package com.legendscl.test;

import com.legendscl.dao.teachermapper;
import com.legendscl.pojo.Teacher;
import com.legendscl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class teacher_test {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        teachermapper teacmapper = sqlSession.getMapper(teachermapper.class);
        Teacher getteacher = teacmapper.getteacher(1);
        System.out.println(getteacher);




        sqlSession.close();
    }
}

