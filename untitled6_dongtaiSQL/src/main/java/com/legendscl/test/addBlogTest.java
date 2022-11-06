package com.legendscl.test;

import com.legendscl.dao.BlogMapper;
import com.legendscl.pojo.Blog;
import com.legendscl.utils.IDutils;
import com.legendscl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;

public class addBlogTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.GetSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getID());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreatetime(new Date());
        blog.setViews(9999);

        mapper.addblog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("Java");
        mapper.addblog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("Spring");
        mapper.addblog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("微服务");
        mapper.addblog(blog);

        sqlSession.close();
    }

}
