package com.woong3e.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */
        Scanner sc = new Scanner(System.in);
        int oddNum = 0;
        while (oddNum <= 0 || oddNum % 2 == 0) {
            System.out.print("홀수인 양의 정수를 입력하세요: ");
            oddNum = sc.nextInt();

            if (oddNum <= 0 || oddNum % 2 == 0) {
                System.out.println("양수 혹은 홀수만 입력해야 합니다.");
            }
        }

        int[] oddArr = new int [oddNum];
        for (int i = 0; i < oddNum; i++) {
            int middleIndex = oddNum / 2;
            if(i <= middleIndex){
                oddArr[i] = i + 1;
            }else{
                oddArr[i] = oddNum - i;
            }
        }
        for (int number : oddArr) {
            System.out.print(number + " ");
        }

        System.out.println();

        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */

        int inputNumber = 0;
        int count = 0;
        int strikeCount = 0;
        int ballCount = 0;

// 1. 중복되지 않는 난수 4개 생성
        int[] randomArr = new int[4];

        for (int i = 0; i < randomArr.length; i++) {
            int random = (int) (Math.random() * 10);

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (randomArr[j] == random) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                i--;
                continue;
            }

            randomArr[i] = random;
        }

// 2. 숫자 야구 게임 시작
        while (count < 10) {
            System.out.println((10 - count) + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요: ");
            inputNumber = sc.nextInt();

            // 4자리 숫자가 아니면 다시 입력
            if (inputNumber < 1000 || inputNumber > 9999) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            // 입력한 숫자를 배열로 변환
            int[] inputArr = new int[4];

            for (int i = 3; i >= 0; i--) {
                inputArr[i] = inputNumber % 10;
                inputNumber /= 10;
            }

            strikeCount = 0;
            ballCount = 0;

            // 3. 스트라이크, 볼 판별
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (inputArr[i] == randomArr[j]) {
                        if (i == j) {
                            strikeCount++;
                        } else {
                            ballCount++;
                        }
                    }
                }
            }

            count++;

            // 4. 정답 판별
            if (strikeCount == 4) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("아쉽네요 " + strikeCount
                        + "S " + ballCount + "B 입니다.");
            }
        }

// 5. 기회 소진
        if (count == 10 && strikeCount != 4) {
            System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
        }

        sc.close();

    }
}
