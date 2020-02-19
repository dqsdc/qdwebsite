package cn.anpe.website.service.impl;

import cn.anpe.website.dao.UserMapper;
import cn.anpe.website.domain.User;
import cn.anpe.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-06 11:30
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User userLogin(String username, String password) {
        User user = userMapper.selectPasswordByUsername(username);

        if (user == null || !user.getPassword().equals(password)) {
            return null;
        } else {
            return user;
        }
    }
}
