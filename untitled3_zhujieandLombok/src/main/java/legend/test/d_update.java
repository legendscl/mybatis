package legend.test;

import legend.dao.userdao;
import legend.pojo.User;
import legend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class d_update {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        userdao usd = sqlSession.getMapper(userdao.class);
        int i = usd.updateUser(new User(100, "scl8877100", "887788", "887788@qq.com"));
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }
}
