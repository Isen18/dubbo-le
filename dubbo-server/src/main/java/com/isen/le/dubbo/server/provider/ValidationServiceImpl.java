package com.isen.le.dubbo.server.provider;

import com.isen.le.dubbo.api.dto.ValidationParameter;
import com.isen.le.dubbo.api.provider.ValidationService;

/**
 * @author Isen
 * @date 2019/1/25 17:44
 * @since 1.0
 */
public class ValidationServiceImpl implements ValidationService {
    private int count = 0;

    @Override
    public void save(ValidationParameter parameter) {
        if(count++ < 1){
            System.out.println(count);
//            throw new RuntimeException("错错错");
        }
        System.out.println(parameter);
    }

    @Override
    public void update(ValidationParameter parameter) {
        System.out.println(parameter);
    }
}
