//3
package legend.dao;

import legend.pojo.User;

import java.util.List;
import java.util.Map;

public interface userdao {
//    3.1
    List<User> getUserlist();



    User getUserbyID( int id);


    int  addUser(User user);
    int addUser2(Map<String,Object> map);

    int updateUser(User user);

    int deleteUserdao(int id);

    List<User>  GetUserLike(String value);
}
