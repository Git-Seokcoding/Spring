package com.itwillbs.test2.vo;

// 회원 상태(1 : 정상, 2 : 휴면, 3 : 탈퇴) 정보를 상수로 관리하는 MemberStatus 클래스 정의
// => 멤버변수 3개에 각 값을 저장하고, 값 변경이 불가능하도록 final 키워드를 사용
// => 또한, 클래스명만으로 상수 호출이 가능하도록 static 키워드 사용
public class MemberStatus {
	public static final int ACTIVE = 1; // 정상 회원
	public static final int INACTIVE = 2; // 휴면 회원
	public static final int WITHDRAW = 3; // 탈퇴 회원
}
