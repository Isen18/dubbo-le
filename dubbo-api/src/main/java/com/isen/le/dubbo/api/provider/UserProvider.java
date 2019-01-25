package com.isen.le.dubbo.api.provider;

import com.isen.le.dubbo.api.dto.User;

/**
 * @author Isen
 * @date 2019/1/24 15:10
 * @since 1.0
 */
public interface UserProvider {

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUser(Integer id);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUser(Long id);
}
