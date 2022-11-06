package legend.test;

import legend.dao.userdao;
import legend.pojo.User;
import legend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class c_adduser {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        userdao usd = sqlSession.getMapper(userdao.class);
        int i = usd.addUser(new User(100, "scl887788", "887788", "887788@qq.com"));
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }
}
