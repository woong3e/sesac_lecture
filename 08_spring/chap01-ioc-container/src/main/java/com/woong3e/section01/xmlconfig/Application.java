package com.woong3e.section01.xmlconfig;

import com.woong3e.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        // 1. bean의 id, 기대하는 반환타입을 함께 전달해서 가져온다.
        MemberDTO member = context.getBean("member", MemberDTO.class);
        System.out.println("member = " + member);

    }
}

// 이런 방식은 현재는 많이 쓰지 않음.