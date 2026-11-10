package com.ohgiraffers.practicaljpa.menu;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class MenuService {
    private final MenuRepository menus;
    public MenuService(MenuRepository menus) { this.menus = menus; }

    public record MenuResponse(Integer menuCode, String menuName, int menuPrice,
                               int categoryCode, String categoryName) {
        public static MenuResponse from(Menu menu) {
            return new MenuResponse(menu.getMenuCode(), menu.getMenuName(), menu.getMenuPrice(),
                    menu.getCategory().getCategoryCode(),
                    menu.getCategory().getCategoryName());
        }
    }

    public Page<MenuResponse> search(String keyword, Integer minPrice,
                                    Integer maxPrice, Integer categoryCode, Pageable pageable) {
        // TODO 04: 대본을 따라 구현한다.
        throw new UnsupportedOperationException("04 라이브 코딩 전입니다.");
    }

}
