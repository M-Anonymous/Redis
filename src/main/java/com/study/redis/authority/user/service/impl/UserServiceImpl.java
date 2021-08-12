package com.study.redis.authority.user.service.impl;

import com.study.redis.authority.user.entity.User;
import com.study.redis.authority.user.mapper.UserMapper;
import com.study.redis.authority.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Anonymous
 * @since 2021-08-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
