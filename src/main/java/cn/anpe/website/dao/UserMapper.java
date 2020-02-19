package cn.anpe.website.dao;

import cn.anpe.website.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User>{
    User selectPasswordByUsername(@Param("user")String username);
}