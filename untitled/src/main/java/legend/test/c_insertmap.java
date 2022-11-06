package legend.test;

import legend.dao.userdao;
import legend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class c_insertmap {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.GetSqlSession();
        userdao usd = sqlSession.getMapper(userdao.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username01","legend");
        map.put("password01","147258");
        map.put("email01","147258@qq.com");
        int i = usd.addUser2(map);
        System.out.println(i);

//        提交事务，否则数据库没有数据。增删改都需要
        sqlSession.commit();
        sqlSession.close();
    }
}
