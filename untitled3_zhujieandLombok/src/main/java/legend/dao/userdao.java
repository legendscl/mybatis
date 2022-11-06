
package legend.dao;

import legend.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface userdao {


//zhujie2
    @Select("select * from user")
    List<User> Getusers();

    @Select("select * from user where id=#{id}")
    User getUserbyID(@Param("id") int id);
//    @param:基本数据类型和string需要加

    @Insert("insert into user(username,password,email) values(#{username},#{password},#{email})")
    int  addUser(User user);

    @Update("update user set username=#{username},password=#{password},email=#{email} where id =#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUserdao(int id);


}
