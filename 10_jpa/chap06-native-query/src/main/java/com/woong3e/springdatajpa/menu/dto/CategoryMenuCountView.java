package com.woong3e.springdatajpa.menu.dto;

public interface CategoryMenuCountView {


    int getCategoryCode();

    String getCategoryName();

    long getMenuCount();

}

// Spring Data JPA 쿼리 결과를 CategoryMenuCountView의 getter 로 꺼낼 수있께 연결해준다.
// Jackson: Controller 가 반환한 객체의 getter를 읽어서 JSON으로 변환한다.

// 순서:  DB 결과 → Spring Data JPA → 객체 → Jackson → JSON 응답