package com.woong3e.section05.parameter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodParameter {

    // 기본 자료형 : '값' 복사 -> 원본 불변
    public void primitiveType(int num) {
        System.out.println("전달받은 num :" + num);
        num = 99;
        System.out.println("변경 후 num : " + num);
    }

    // 배열, 객체(참조 자료형) : '주소값'이 복사, 원본 배열에도 반영된다.
    public void ArrayParameter(int[] arr) {
        System.out.println("전달받은 arr = " + Arrays.toString(arr));
        arr[0] = 99;
        System.out.println("변경 후 arr = " + Arrays.toString(arr));
    }

}
// 정리하자면 기본자료형은 값을 복사하기 때문에 원본 변수는 안바뀌고
// 배열이나 객체같은 참조 자료형은 주소값을 복사하기 때문에 원본 배열에도 반영된다.(바뀜)