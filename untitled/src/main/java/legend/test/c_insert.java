package legend.test;

import legend.dao.userdao;
import legend.pojo.User;
import legend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class c_insert {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        userdao usd = sqlSession.getMapper(userdao.class);
        int i = usd.addUser(new User(null,"ggg000","00000","00000@qq.com"));
        System.out.println(i);

//        提交事务，否则数据库没有数据。增删改都需要
        sqlSession.commit();
        sqlSession.close();
    }

}

