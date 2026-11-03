package com.woong3e.section03.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
* ComponentScan:
* basePackages로 설정된 하위경로에 특정 어노테이션(@Component)을 가지고 있는 클래스를 bean으로 등록한다.
* 목적에 따라 세부 기능을 제공하는 @Controller, @Service, @Repository, @Configuration 등을 사용한다.
*
* */
@Configuration
@ComponentScan(basePackages = "com.woong3e.common") // MemberDAO에 @Component 등록되어있음.
public class ContextConfiguration {

}
