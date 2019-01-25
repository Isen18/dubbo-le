package com.isen.le.dubbo.api.provider;

import com.isen.le.dubbo.api.dto.ValidationParameter;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 参数验证
 *
 * @author Isen
 * @date 2019/1/25 17:37
 * @since 1.0
 */
public interface ValidationService3 {

    void save(@NotNull ValidationParameter parameter); // 验证参数不为空

    void delete(@Min(1) int id); // 直接对基本类型参数验证
}
