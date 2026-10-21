package com.woong3e.section05.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 파라미터 전달 방식
         * 1. 값 복사(Pass by Value)
         * 2. 주소 복사(Pass by Reference)
         * */

        MethodParameter mp = new MethodParameter();

        int num = 20;
        System.out.println("호출 전 main num : " +  num);
        mp.primitiveType(num);
        System.out.println("호출 후 main의 num : " + num);

        // 배열은 참조값을 복사하므로 같은 배열의 요소를 변경한다.
        int[] numbers = {10, 20, 30};
        System.out.println("호출 전 main의 배열 : " + Arrays.toString(numbers));
        mp.ArrayParameter(numbers);
        System.out.println("호출 후 main의 배열 : " + Arrays.toString(numbers));

    }
}
