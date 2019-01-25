package com.isen.le.dubbo.api.provider;

import com.isen.le.dubbo.api.dto.ValidationParameter;

/**
 * 分组验证
 *
 * @author Isen
 * @date 2019/1/25 17:36
 * @since 1.0
 */
public interface ValidationService { // 缺省可按服务接口区分验证场景，如：@NotNull(groups = ValidationService.class)

    // 与方法同名接口，首字母大写，用于区分验证场景，如：@NotNull(groups = ValidationService.Save.class)，可选
    @interface Save {}

    void save(ValidationParameter parameter);

    void update(ValidationParameter parameter);
}
