package com.woong3e.section01.object;

import java.util.Objects;

public class Book {
    private int number;
    private String title;
    private String author;
    private int price;

    public Book(){
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }

    // equals와 hasCode를 오버라이딩하는 이유는 서로 다른 객체라도 내부 데이터가 같으면 같은 객체로 취급할 수 있또록 하기 위해서이다.
    // equals는 객체의 동등성을 판단하고, hashCode는 해시 기반 컬렉션에서 객체를 효율적으로 찾는 데 사용된다.
}
