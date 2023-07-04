package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Mendy
 * @create 2023-07-04 14:39
 */

@Mapper
public interface UserDao extends BaseMapper<User> {
}
