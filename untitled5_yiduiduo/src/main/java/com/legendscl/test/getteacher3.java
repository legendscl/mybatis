package com.legendscl.test;

import com.legendscl.dao.teachermapper;
import com.legendscl.pojo.Teacher;
import com.legendscl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class getteacher3 {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        teachermapper teacmapper = sqlSession.getMapper(teachermapper.class);
        Teacher teacher = teacmapper.getteacher3(6);
        System.out.println(teacher);



        sqlSession.close();
    }
}
