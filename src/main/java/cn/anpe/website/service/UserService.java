package cn.anpe.website.service;

import cn.anpe.website.domain.User;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-06 11:30
 * @Description:
 */
public interface UserService {
    /**
     * 验证用户登录
     * @return 返回对应的Uid 若不存在，返回null
     */
    User userLogin(String username, String password);
}
