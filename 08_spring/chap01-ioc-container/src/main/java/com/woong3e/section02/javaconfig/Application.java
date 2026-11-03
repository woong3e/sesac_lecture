package com.woong3e.section02.javaconfig;

import com.woong3e.common.MemberDTO;
import com.woong3e.section03.annotationconfig.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean("member", MemberDTO.class);
        System.out.println("member = " + member);
    }
}
