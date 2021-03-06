package com.boob.sw.service.userServiceImpl;

import com.boob.sw.dto.MessageDto;
import com.boob.sw.enums.TimeEnum;
import com.boob.sw.enums.UserEnum;
import com.boob.sw.enums.UserTypeEnum;
import com.boob.sw.exception.UserCustomizeException;
import com.boob.sw.mapper.SendUsMapper;
import com.boob.sw.mapper.UserMapper;
import com.boob.sw.model.SendUsExample;
import com.boob.sw.model.User;
import com.boob.sw.model.UserExample;
import com.boob.sw.service.UserServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;


@Service
public class UserServiceImpl implements UserServiceDao {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SendUsMapper sendUsMapper;

    @Override
    public User checkUser(User user) {

        //根据用户名密码查询用户
        UserExample example = new UserExample();
        example.createCriteria()
                .andAccountEqualTo(user.getAccount())
                .andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(example);


        if (users.size() == 0) {
            //如果用户不存在
            return null;

        } else if (users.size() > 1) {
            //用户数量大于一  服务端某个地方出错了
            throw new UserCustomizeException(UserEnum.USER_ACCOUNT_REPEAT);
        }
        return users.get(0);
    }

    @Override
    public MessageDto login(User user, HttpServletRequest request, HttpServletResponse response) {

        //将用户账号加入cookie
        Cookie cookie = new Cookie("account", user.getAccount().toString());
        cookie.setMaxAge(TimeEnum.COOKIE_LIFE.getTime());
        cookie.setPath("/");
        response.addCookie(cookie);

        //在session域中添加用户
        request.getSession().setAttribute("user", user);

        //放置消息
        MessageDto messageDto = putMessageCount(user.getId());
        return messageDto;
    }

    @Override
    public MessageDto putMessageCount(Long userId) {

        MessageDto messageDto = new MessageDto();

        SendUsExample example = new SendUsExample();
        example.createCriteria().andUIdEqualTo(userId);

        Long sendUsCount = sendUsMapper.countByExample(example);
        messageDto.setSendUsCount(sendUsCount);
        return messageDto;
    }

    @Override
    public User checkRegister(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andAccountEqualTo(user.getAccount());

        List<User> users = userMapper.selectByExample(example);
        if (users.size() == 1) {
            //如果用户已存在
            return null;
        } else if (users.size() > 1) {
            //用户数量大于一  服务端某个地方出错了
            throw new UserCustomizeException(UserEnum.USER_ACCOUNT_REPEAT);
        }

        //填入其他信息
        user.setGmtCreated(new Date());
        user.setGmtCreated(user.getGmtModified());
        //设置用户类为普通
        user.setCategory(UserTypeEnum.ORIGINAL.getCode());
        return user;
    }

    @Override
    public boolean register(User user) {
        //向数据库插入用户
        user.setGmtCreated(new Date());
        user.setGmtModified(user.getGmtCreated());

        int insert = userMapper.insert(user);

        return insert == 1;
    }


    @Override
    public boolean forgetPassword(User user) {
        return false;
    }


    @Override
    public boolean logon(HttpServletRequest request, HttpServletResponse response) {

        //清除session中的user
        request.getSession().removeAttribute("user");

        //清除cookies中的 account
        Cookie account = new Cookie("account", null);
        account.setMaxAge(0);
        response.addCookie(account);

        return true;
    }


    @Override
    public boolean checkLogin(HttpServletRequest request, HttpServletResponse response) {

        boolean checkSession = false;
        boolean checkCookie = false;

        //检查session
        User user = (User) request.getSession().getAttribute("user");
        checkSession = (user != null);

        //检查cookies
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if ("account".equals(name)) {
                checkCookie = true;
                break;
            }
        }
        return checkCookie && checkSession;

    }
}
