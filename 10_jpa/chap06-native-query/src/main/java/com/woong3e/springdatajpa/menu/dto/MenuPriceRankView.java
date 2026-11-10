package com.woong3e.springdatajpa.menu.dto;

public interface MenuPriceRankView {

    int getMenuCode();
    String getMenuName();
    int getMenuPrice();
    long getPriceRank();    // 얘는 계산한 값이 들어올거임.
}
