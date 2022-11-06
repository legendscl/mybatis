package legend.test;

import legend.dao.userdao;
import legend.pojo.User;
import legend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class b_query {
//    3
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        userdao usd = sqlSession.getMapper(userdao.class);
        HashMap<String,Integer> map=new HashMap<>();
        map.put("startindex",0);
        map.put("pagesize",2);

        List<User> userlist = usd.GetuserBylimit(map);

        for (User user:userlist) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
