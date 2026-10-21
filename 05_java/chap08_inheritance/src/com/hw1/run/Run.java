package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (Student student: students){
            System.out.println(student.information());
        }

        Employee[] employees = new Employee[10];
        String answer = "Y";
        int count = 0;
        while(true){
            if(count >=employees.length){
                System.out.println("최대 10명까지만 등록가능합니다.");
                break;
            }

            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("나이: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("키: ");
            double height = Double.parseDouble(sc.nextLine());
            System.out.print("몸무게: ");
            double weight = Double.parseDouble(sc.nextLine());
            System.out.print("급여: ");
            int salary = Integer.parseInt(sc.nextLine());
            System.out.print("부서: ");
            String dept = sc.nextLine();

            employees[count] = new Employee(name,age,height,weight,salary,dept);

            count++;

            System.out.print("계속 추가하시겠습니까? (y/n): ");
            answer = sc.nextLine();

            if(!answer.equalsIgnoreCase(("Y"))){
                break;
            }
        }
        for(Employee employee: employees){
            if (employee == null) {
                break;
            }
            System.out.println(employee.information());
        }
    }
}
