package com.isen.le.dubbo.server2.consumer;

import com.alibaba.dubbo.rpc.RpcException;
import com.isen.le.dubbo.api.dto.ValidationParameter;
import com.isen.le.dubbo.api.provider.ValidationService;
import java.util.Date;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Isen
 * @date 2019/1/25 17:42
 * @since 1.0
 */
public class ValidationConsumer {
    public static void main(String[] args) throws Exception {
//        String config = ValidationConsumer.class.getPackage().getName().replace('.', '/') + "/validation-consumer.xml";
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/spring/*.xml", "config/dubbo/*.xml");
        context.start();
        ValidationService validationService = (ValidationService)context.getBean("validationService");
        try {
            ValidationParameter parameter = new ValidationParameter();
            parameter.setName("isen");
            parameter.setAge(18);
//            parameter.setEmail("com@isen.com");
            parameter.setLoginDate(new Date(System.currentTimeMillis() - 1000));
            parameter.setExpiryDate(new Date(System.currentTimeMillis() + 1000));
//            validationService.save(parameter);
            validationService.update(parameter);
            System.out.println("Validation OK");
        } catch (RpcException e) { // 抛出的是RpcException
            ConstraintViolationException ve = (ConstraintViolationException) e.getCause(); // 里面嵌了一个ConstraintViolationException
            Set<ConstraintViolation<?>> violations = ve.getConstraintViolations(); // 可以拿到一个验证错误详细信息的集合
            System.out.println(violations);
        }
    }
}
