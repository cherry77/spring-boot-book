package com.demo.springbootbook.service.impl;

import com.demo.springbootbook.entity.User;
import com.demo.springbootbook.mapper.UserMapper;
import com.demo.springbootbook.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author cherry
 * @since 2025-04-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
