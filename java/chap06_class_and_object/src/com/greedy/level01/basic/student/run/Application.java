package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[10];

        String answer = "y";
        int count = 0;
        while(answer.equalsIgnoreCase("y")){
            StudentDTO studentDTO = new StudentDTO();
            System.out.print("학년: ");
            studentDTO.setGrade(sc.nextInt());
            System.out.print("반: ");
            studentDTO.setClassroom(sc.nextInt());
            System.out.print("이름: ");
            studentDTO.setName(sc.next());  // 공백 전까지 문자열 입력
            System.out.print("국어점수: ");
            studentDTO.setKor(sc.nextInt());
            System.out.print("영어점수: ");
            studentDTO.setEng(sc.nextInt());
            System.out.print("수학점수: ");
            studentDTO.setMath(sc.nextInt());

            students[count] = studentDTO;
            count++;

            System.out.print("계속 추가할 겁니까? (y/n): ");
            answer = sc.next();
        }
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getInfomation());
        }
    }
}
