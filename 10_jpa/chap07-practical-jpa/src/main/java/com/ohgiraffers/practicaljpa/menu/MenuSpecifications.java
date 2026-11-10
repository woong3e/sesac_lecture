package com.ohgiraffers.practicaljpa.menu;

import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;

public final class MenuSpecifications {

    private MenuSpecifications() {}

    public static Specification<Menu> search(String keyword, Integer minPrice,
                                              Integer maxPrice, Integer categoryCode) {
        // 이름 조건부터 한 단계씩 작성한다.
        /*
        * Root<Menu> : 조회할 Menu의 필드 지정
        * CriteriaQuery<?> : 쿼리 전체 설정
        * CriteriaBuilder : 비교 조건 생성
        * */
        return (root, query, cb) -> {
            ArrayList<Predicate> conditions = new ArrayList<>();
            if(keyword == null || keyword.isBlank()) {
                return cb.conjunction();
            }
            String pattern = "%" + escapeLike(keyword) + "%";
            return cb.like(root.get("menuName"), pattern, '!');
        };
    }

    // 문자열 처리 자체는 이전 학습 내용이므로 제공한다.
    // LIKE에서 %, _를 검색 패턴이 아닌 입력 문자로 취급하기 위한 처리다.
    static String escapeLike(String keyword) {
        return keyword.replace("!", "!!").replace("%", "!%").replace("_", "!_");
    }
}
