package chxy.book.mapper;

import chxy.book.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author hs
 * @date 2019/6/14 - 10:40
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    public User getUser(String username);

    @Select("select * from user")
    public List<User> usersList();

    @Insert("insert into user(username,password) values(#{username},#{password}")
    public void addUser(User user);
}
