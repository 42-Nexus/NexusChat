package com.venture.nexuschat.user.service.impl;

import com.venture.nexuschat.user.dao.UserDao;
import com.venture.nexuschat.user.entity.UserEntity;
import com.venture.nexuschat.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zhp
 * @since 2025-02-16
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(UserEntity user) {
        userDao.save(user);
    }
}
