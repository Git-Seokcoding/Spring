package com.itwillbs.test2.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itwillbs.test2.svc.MemberJoinProService;
import com.itwillbs.test2.svc.MemberLoginProService;
import com.itwillbs.test2.vo.MemberBean;

@Controller
public class MemberController {
	@GetMapping("MemberJoinForm")
	public String memberjoinform() {
		return "member/member_join_form";
	}
	@GetMapping("MemberLoginForm")
	public String memeberloginform() {
		return "member/member_login_form";
	}
	@PostMapping("MemberJoinPro")
	public String MemberJoinPro(MemberBean member, 
			                    String jumin1, String jumin2, 
			                    String postCode, String address1, String address2,
			                    String email1, String email2) {
//		System.out.println("이름 : " + member.getName());
//		System.out.println("아이디 : " + member.getId());
//		System.out.println("패스워드 : " + member.getPasswd());
		member.setJumin(jumin1 + "-" + jumin2);
		member.setAddress(postCode + "/" + address1 + "/" + address2);
		member.setEmail(email1 + "@" + email2);
		
		MemberJoinProService service = new MemberJoinProService();
		boolean isJoinSucess = service.registMember(member);
		
		return "redirect:/main"; 
	}
	
//	@PostMapping("MemberJoinPro")
//	public String MemberJoinPro(@RequestParam Map<String, String> map) {
//		System.out.println("이름(map) : " + map.get("name"));
//		System.out.println("아이디(map) : " + map.get("id"));
//		System.out.println("패스워드(map) : " + map.get("passwd"));
//		return "redirect:/main"; 
//	}
	@PostMapping("MemberLoginPro")
	public String MemberLoginPro(MemberBean member, HttpSession session, Model model) {
//		System.out.println(member.getId());
//		System.out.println(member.getPasswd());
		
		MemberLoginProService service = new MemberLoginProService();
		boolean isCorrectUser = service.isCorrectUser(member);
		
		if(!isCorrectUser) {
			//실패시 fail_back,sjp 페이지로 포워딩
			model.addAttribute("msg", "로그인 실패!");
			return "fail_back"; 
		}
		// 성공 시 세션에 아이디 저장 후 메인페이로 리다이렉트
		session.setAttribute("sId", member.getId());
		System.out.println("로그인 성공!");		
		return "redirect:/main"; 
		
	}
	
}

