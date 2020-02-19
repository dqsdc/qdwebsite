package cn.anpe.website.service.impl;

import cn.anpe.website.dao.UserMapper;
import cn.anpe.website.domain.User;
import cn.anpe.website.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-02 10:09
 * @Description:
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    UserMapper mapper;


    @Override
    public List<User> selectAll() {
        return mapper.selectAll();
    }
}
