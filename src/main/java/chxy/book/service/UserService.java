package chxy.book.service;

import chxy.book.bean.User;
import chxy.book.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hs
 * @date 2019/6/14 - 10:40
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String username){
        User user = userMapper.getUser(username);
        return user;
    }

    public List<User> userList(){
        List<User> users = userMapper.usersList();
        return users;
    }
    public void addUser(User user){
        userMapper.addUser(user);
    }
}
