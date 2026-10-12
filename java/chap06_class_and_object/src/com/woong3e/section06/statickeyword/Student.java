package com.woong3e.section06.statickeyword;

public class Student {

    // non-static 필드 : "개인 사물함"
    // new 로 객체를 만들 때마다 Heap에 새로 생성되며, 객체마다 독립적이다.
    private int personalLockerCount;

    // static 필드: "공용 사물함
    // 프로그램 시작 시 static 영역에 단 하나만 생성되며, 모든 객체가 공유한다.
    private static int sharedLockerCount;

    public int getPersonalLockerCount() {
        return this.personalLockerCount;
    }

    public int getSharedLockerCount() {
        return Student.sharedLockerCount;
    }

    public void increasePL() {
        this.personalLockerCount++;
    }
    public void increaseSL() {
        Student.sharedLockerCount++;
    }
}

// 일반 필드는 객체마다 따로 갖고, static 필드는 모든 객체가 하나의 값을 공유한다.