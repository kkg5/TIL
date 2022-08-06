package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// 스프링 부트에서 알아서 해줌 (CoreApplication.java의 @SpringBootApplication)
@ComponentScan(
        // 탐색할 패키지의 시작 위치 지정, 여러 위치 가능 {"hello.core", "hello.service"}
//        basePackages = "hello.core",

        // 클래스의 경로를 시작 위치로 지정 (default)
//        basePackageClasses = AutoAppConfig.class,

        // AppConfig.java 제외, 기존 코드를 유지하기 위해서
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
