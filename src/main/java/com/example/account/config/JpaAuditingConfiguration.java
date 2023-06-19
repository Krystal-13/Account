package com.example.account.config;
/*
 package com.example.account.config
 : redis 관련 설정 및 클라이언트 빈 등록, JPA 관련 설정 등록하는 패키지
*/
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class JpaAuditingConfiguration {
    // 이 클래스가 있어야 JpaAuditing 을 사용할 수 있음
}
