package com.woong3e.practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

		/* 국어, 영어, 수학 점수를 입력받아
		 * 평균 점수가 60점 이상이면서 각 과목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
		 * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해주어야 합니다.
		 * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다." 라고 출력하고,
		 * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격 입니다." 출력하세요
		 *
		 * -- 입력 예시 --
		 * 국어 점수를 입력하세요 : 60
		 * 영어 점수를 입력하세요 : 30
		 * 수학 점수를 입력하세요 : 20
		 *
		 * -- 출력 예시 --
		 * 평균 점수 미달로 불합격입니다.
		 * 영어 점수 미달로 불합격입니다.
		 * 수학 점수 미달로 불합격입니다.
		 *
		 */
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 :");
        int a = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 :");
        int b = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 :");
        int c = sc.nextInt();

        int sum = a+b+c;
        double avg = sum / 3.0;
        if ((avg >= 60) && a >= 40 && b >= 40 && c >= 40) {
            System.out.println("합격입니다!");
        }
        else{
            if(avg<60){
                System.out.println("평균점수 미달로 불합격입니다.");
            }
            if(a<40){
                System.out.println("국어 과목의 점수 미달로 불합격입니다.");
            }
            if(b<40){
                System.out.println("영어 과목의 점수 미달로 불합격입니다.");
            }
            if(c<40){
                System.out.println("수학 과목의 점수 미달로 불합격입니다.");
            }
        }

		/* 영업사원의 월급을 계산하는 프로그램을 작성하려고 합니다.
		 * 월 급여액과 월 매출액을 입력 받아 급여를 산정합니다.
		 * 영업사원은 매출액 대비 보너스율에 명시된 보너스를 급여 외에 추가로 지급받습니다.
		 *
		 * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
		 * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산한다.
		 *
		 * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어보세요
		 *
		 * -- 총 급여 계산식 --
		 * 총 급여 = 월 급여  + (매출액 * 보너스율)
		 *
		 * -- 매출액 대비 보너스율 --
		 *   매출액       보너스율
		 * 5천만원 이상      5%
		 * 3천만원 이상      3%
		 * 1천만원 이상      1%
		 * 1천만원 미만      0%
		 *
		 * -- 입력 예시 --
		 * 월 급여 입력 : 3000000
		 * 매출액 입력 : 20000000
		 *
		 * -- 출력 예시 --
		 * ======================
		 * 매출액 : 20000000
		 * 보너스율 : 1%
		 * 월 급여 : 3000000
		 * 보너스 금액 : 200000
		 * ======================
		 * 총 급여 : 3200000
		 *
		 */
		System.out.print("월 급여 입력: ");
		int salary = sc.nextInt();
		System.out.print("매출액 입력: ");
		int revenue = sc.nextInt();

		double totalSalary;
		double bonusRate;

		if (revenue >= 50_000_000) {
			bonusRate = 0.05;
		} else if (revenue >= 30_000_000) {
			bonusRate = 0.03;
		} else if (revenue >= 10_000_000) {
			bonusRate = 0.01;
		} else {
			bonusRate = 0.0;
		}

		double bonusAmount = revenue * bonusRate;
		totalSalary = salary + bonusAmount;

		System.out.println("===================");
		System.out.println("매출액: " + revenue);
		System.out.println("보너스율: " + (int)(bonusRate * 100) + "%");
		System.out.println("월 급여: " + salary);
		System.out.println("===================");
		System.out.println("총 급여: " + (int)totalSalary);

        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         * */

		System.out.print("정수를 입력하세요: ");
		int numA = sc.nextInt();
		for (int i = 1; i <= numA; i++) {
			if(i % 2 !=0){
				System.out.print("수");
			}
			else {
				System.out.print("박");
			}
		}

        /* 1부터 100 사이의 난수를 발생시키고
         * 정수를 입력 받아서 입력받은 정수보다 발생한 난수가 큰 경우 "입력하신 정수보다 큽니다." 출력,
         * 입력받은 정수보다 난수가 작은 경우 "입력하신 정수보다 작습니다." 를 출력하며
         * 입력한 정수와 난수와 같은 경우까지 난수 맞추기를 반복하는 프로그램을 만드세요.
         *
         * 단, 입력한 정수와 난수가 같은 경우 "정답입니다. 4회 만에 정답을 맞추셨습니다." 하고
         * 정답을 입력한 횟수도 함께 출력되도록 해야 합니다.
         * 처음부터 바로 난수를 맞추는 경우는 1회만에 정답을 맞춘 것입니다.
         *
         * 정답을 맞추는 경우 위 내용을 출력하고 프로그램이 종료되도록 작성하면 됩니다.
         *
         * -- 프로그램 예시 --
         * 정수를 입력하세요 : 5
         * 입력하신 정수보다 작습니다.
         * 정수를 입력하세요 : 3
         * 입력하신 정수보다 큽니다.
         * 정수를 입력하세요 : 4
         * 정답입니다. 3회만에 정답을 맞추셨습니다.
         * */

		double random = (int)(Math.random() * 100 + 1);
		int count = 0;
		int number = 0;

		while(number != random) {
			System.out.println("");
			System.out.print("정수를 입력하세요: ");
			number = sc.nextInt();
			count++;

			if (number < random) {
				System.out.println("입력하신 정수보다 큽니다.");
			} else if (number > random) {
				System.out.println("입력하신 정수보다 작습니다.");
			} else {
				System.out.println("정답입니다. " + count + "회만에 정답을 맞추셨습니다.");
			}
		}}}
