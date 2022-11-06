package legend.test;

import legend.dao.userdao;
import legend.pojo.User;
import legend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class a_Getusers {
//    3
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        userdao usd = sqlSession.getMapper(userdao.class);
        List<User> userlist = usd.Getusers();

        for (User user : userlist
             ) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
