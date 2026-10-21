package com.woong3e.section03.copy;

public class Application1 {
    public static void main(String[] args) {

        int[] originArr = {1, 2, 3, 4, 5};
        // 얕은 복사가 일어난다. 기존 배열의 참조값을 복사하는 것이기 때문에 가리키는 실제 객체는 같음.
        // 둘중 하나의 값을 바꾸면 나머지의 값도 바뀜.
        int[] copyArr = originArr;
        System.out.println("같은 배열인가? " + (originArr == copyArr));

        System.out.println(originArr[4]);
        copyArr[4] = 80;
        System.out.println(originArr[4]);
    }
}
