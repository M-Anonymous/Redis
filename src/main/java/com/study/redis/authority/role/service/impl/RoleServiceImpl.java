package com.study.redis.authority.role.service.impl;

import com.study.redis.authority.role.entity.Role;
import com.study.redis.authority.role.mapper.RoleMapper;
import com.study.redis.authority.role.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
