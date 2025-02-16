package com.venture.nexuschat.user.dao;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.venture.nexuschat.user.entity.UserEntity;
import com.venture.nexuschat.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author <a href="https://github.com/zongzibinbin">abin</a>
 * @since 2023-03-19
 */
@Service
public class UserDao extends ServiceImpl<UserMapper, UserEntity> {


    public UserEntity getByOpenId(String openId) {
        LambdaQueryWrapper<UserEntity> wrapper = new QueryWrapper<UserEntity>().lambda().eq(UserEntity::getOpenId, openId);
        return getOne(wrapper);
    }

    public void modifyName(Long uid, String name) {
        UserEntity update = new UserEntity();
        update.setId(uid);
        update.setName(name);
        updateById(update);
    }

    public void wearingBadge(Long uid, Long badgeId) {
        UserEntity update = new UserEntity();
        update.setId(uid);
        update.setItemId(badgeId);
        updateById(update);
    }

    public UserEntity getByName(String name) {
        return lambdaQuery().eq(UserEntity::getName, name).one();
    }

}
