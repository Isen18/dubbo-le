package com.isen.le.dubbo.api.provider;

import com.isen.le.dubbo.api.dto.ValidationParameter;
import javax.validation.GroupSequence;

/**
 * 关联验证
 *
 * @author Isen
 * @date 2019/1/25 17:36
 * @since 1.0
 */
public interface ValidationService2 {

    @GroupSequence(Update.class)// 同时验证Update组规则
    @interface Save {

    }

    void save(ValidationParameter parameter);

    @interface Update {

    }

    void update(ValidationParameter parameter);
}
