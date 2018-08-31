package cn.itcast.util.auth;

import cn.itcast.util.enums.AuthCodeEnum;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * Created by wxl on 2018/7/28.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
//最高优先级
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface AuthRoleValidate {
    AuthCodeEnum value() default AuthCodeEnum.AUTH_DEFAULT;
}
