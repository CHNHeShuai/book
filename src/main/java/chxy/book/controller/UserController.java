package chxy.book.controller;

import chxy.book.bean.User;
import chxy.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hs
 * @date 2019/6/14 - 10:39
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String toIndex(){
        return "login";
    }

    @RequestMapping("/login")
    public String getUser(User user, HttpServletRequest request,Model model){
        User u = userService.getUser(user.getUsername());
        if(u!=null){
            if(user.getPassword().equals(u.getPassword())){
                request.getSession().setAttribute("user",u);
                return "index";
            }
            else {
                model.addAttribute("errPass","密码错误");
                return "login";
            }
        }else {
            model.addAttribute("errUser","用户名不存在");
            return "login";
        }
    }

    @RequestMapping("/userList")
    public String userList(Model model){
        List<User> userList = userService.userList();
        model.addAttribute("userList",userList);
        return "userList";
    }

    @RequestMapping("/register")
    public String registerUser(User user){
        userService.addUser(user);
        return "login";
    }

}
