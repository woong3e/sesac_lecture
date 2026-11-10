package com.woong3e.mapping.section01.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// 클래스를 JPA가 관리하는 엔티티로 지정한다.
// JPA는 이 클래스를 데이터베이스 테이블과 매핑해 객체를 저장하고 조회할 수 있다.
@Entity
@Table(name = "tbl_member") // 엔티티를 어떤 데이터베이스 테이블에 매핑할지 지정해준다.
public class Member {

    // @Id는 기본 키이며 IDENTITY 방식은 INSERT 시 DB가 번호를 생성한다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no")
    private int memberNo;
    @Column(name = "member_id", nullable = false, unique = true,length = 50)
    private String memberId;
    @Column(name = "member_pwd",nullable = false,length = 20)
    private String memberPwd;
    @Column(name = "member_name",nullable = false,length = 10)
    private String memberName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "enroll_date")
    private LocalDateTime enrollDate;
    @Enumerated(EnumType.STRING)    // enum 순서가 바뀌어도 DB 값의 의미가 유지되도록 이름으로 저장.
    @Column(name = "member_role")
    private MemberRole memberRole;
    @Column(name = "status")
    private String status;

    // JPA가 조회 결과로 엔티티를 만들 때 사용할 기본 생성자.
    protected Member() {}

    // 회원을 새로 만들 때 필요한 생성자
    public Member(
            String memberId, String memberPwd, String memberName,
            String phone, String address, LocalDateTime enrollDate,
            MemberRole memberRole, String status
    ) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.phone = phone;
        this.address = address;
        this.enrollDate = enrollDate;
        this.memberRole = memberRole;
        this.status = status;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public MemberRole getMemberRole() {
        return memberRole;
    }
}
