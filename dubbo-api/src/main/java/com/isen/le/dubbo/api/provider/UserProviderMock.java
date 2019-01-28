package com.isen.le.dubbo.api.provider;

import com.isen.le.dubbo.api.dto.User;
import com.isen.le.dubbo.api.provider.UserProvider;

/**
 * @author Isen
 * @date 2019/1/24 15:13
 * @since 1.0
 */
public class UserProviderMock implements UserProvider {

    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setId(1);
        user.setName("isen");
        return user;
    }

    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        return user;
    }
}
