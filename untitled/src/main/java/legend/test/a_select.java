//6
package legend.test;

import legend.dao.userdao;
import legend.pojo.User;
import legend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class a_select {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        userdao usd = sqlSession.getMapper(userdao.class);
        List<User> userlist = usd.getUserlist();


        for (User user:userlist) {
            System.out.println(user.toString());

        }

        sqlSession.close();
    }

}
