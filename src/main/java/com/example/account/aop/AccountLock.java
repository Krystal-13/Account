package com.example.account.aop;
/*
 package com.example.account.aop
 : AOP 로 중복 거래 방지 락을 걸 때 사용될 어노테이션 등을 위치 시킨 패키지
*/
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AccountLock {
    long tryLockTime() default 5000L;
}
