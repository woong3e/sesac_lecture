package com.woong3e.section01.uses;

import java.util.Scanner;

public class MemberService {
    /*
     * Service 는 회원등록, 조회, 검색 등 프로그램의 기능을 처리한다.
     * */

    public void signUpMembers() {
        Member[] members = {
                new Member(1, "user01", "pwd01", "박지성", 10),
                new Member(2, "user02", "pwd02", "손흥민", 20),
                new Member(3, "user03", "pwd03", "이강인", 30)
        };

        if (MemberRepository.store(members)) {
            System.out.println("총 " + members.length + " 명의 회원 등록 성공");
        } else {
            System.out.println("정원 초과");
        }
    }

    /* 전체 회원 조회 - Repository로부터 회원 정보를 받아와서 출력한다.*/
    public void showAllMembers() {
        Member[] allMembers = MemberRepository.findAllMembers();

        for (Member member : allMembers) {
            if (member != null) {
                System.out.println(member.getInformation());
            }
        }
    }

    public void searchMemberById(Scanner sc){

        // 검색할 아이디 입력받기
        System.out.print("검색할 아이디를 입력하세요 ");
        String searchId = sc.nextLine();

        // Repository에서 모든 회원 정보를 가져온다. (객체 배열 return)
        Member[] foundMembers = MemberRepository.findAllMembers();

        // 검색 결과를 찾았는지 여부를 확인하기 위한 변수 선언
        boolean isFound = false;

        // 반복문을 이용해 전체 회원 배열 탐색
        for(Member member: foundMembers){
            if(member != null){
                if(searchId.equals(member.getId())){
                    System.out.println("-----검색결과-----");
                    System.out.println(member.getInformation());

                    isFound = true;
                    break;
                }
            }
        }
        if(!isFound){
            System.out.println("해당 아이디 회원을 찾을 수 없습니다.");
        }
    }

}
/*
* uses 예제는 spring에서 자주 사용하는 계층형 구조인 Controller > Service > Repository를 미리 연습하는 코드이다.
* 역할을 나누는 방식이 비슷하다.
*
* Application > Controller
* MemberService > Service
* MemberRepository > Repository
* Member > Entity or DTO
* */

