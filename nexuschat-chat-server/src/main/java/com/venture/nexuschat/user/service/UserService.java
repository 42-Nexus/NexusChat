package com.venture.nexuschat.user.service;


import com.venture.nexuschat.user.entity.UserEntity;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zhp
 * @since 2025-02-16
 */
public interface UserService {

    void register(UserEntity user);
}
