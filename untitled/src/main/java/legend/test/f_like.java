package legend.test;

import legend.dao.userdao;
import legend.pojo.User;
import legend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class f_like {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        userdao usd = sqlSession.getMapper(userdao.class);
        List<User> i = usd.GetUserLike("%w%");
        for (User user:i) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
