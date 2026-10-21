package com.woong3e.section01.list.run;

import com.woong3e.section01.list.comparator.AscendingPrice;
import com.woong3e.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50_000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 32_000));
        bookList.add(new BookDTO(2, "삼국사기", "김부식", 46_000));

        System.out.println("정렬 전 bookList = " + bookList);
        Collections.sort(bookList);
        System.out.println("정렬 후 bookList = " + bookList);

        /* 기본값과 다른 기준으로 정렬하고 싶을 때(여기선 기본값 number로 정렬)
        * 별도의 Comparator 구현한 구현체인 AscendingPrice를 전달한다.
        * */
        bookList.sort(new AscendingPrice());
        for(BookDTO book : bookList){
            System.out.println("price 오름차순으로 정렬 book = " + book);
        }
    }
}
