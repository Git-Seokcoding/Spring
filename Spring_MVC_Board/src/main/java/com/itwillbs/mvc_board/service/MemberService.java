package com.itwillbs.mvc_board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.mvc_board.mapper.MemberMapper;
import com.itwillbs.mvc_board.vo.MemberVO;

@Service
public class MemberService {
	// MemberMapper 객체 자동 주입
	@Autowired
	private MemberMapper mapper;

	// 회원가입 작업 요청
	public int registMember(MemberVO member) {
		// MemberMapper(인터페이스) - insertMember()
		// => 파라미터 : MemberVO 객체   리턴타입 : int
		return mapper.insertMember(member);
	}

	public MemberVO getMember(MemberVO member) {
		return mapper.selectMember(member);
	}

}












