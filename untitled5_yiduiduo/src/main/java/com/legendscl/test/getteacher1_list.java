package com.legendscl.test;

import com.legendscl.dao.teachermapper;
import com.legendscl.pojo.Teacher;
import com.legendscl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class getteacher1_list {
//    1.3
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        teachermapper teacmapper = sqlSession.getMapper(teachermapper.class);
        List<Teacher> teacher = teacmapper.getteacher();

        for (Teacher tea:teacher
        ) {
            System.out.println(tea);
        }


        sqlSession.close();
    }
}

