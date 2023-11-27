package com.itwillbs.test2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itwillbs.test2.vo.TestVo;

@Controller
public class Test3Controller_Redirect2 {
	
	
	//[ 리다이렉트 방식 포워딩 시 데이터 전송 ]
	// 1 
//	@GetMapping("redirect")
//	public String redirect(HttpServletRequest request) {
//		request.setAttribute("msg","Hello, World!");
//		return "redirect:/redirectServlet";
//	}
	
	
	// 2
//	@GetMapping("redirect")
//	public String redirect() {
//		String name ="hong";
//		int age = 20;
//		return "redirect:/redirectServlet?name=" + name + "&age=" + age;
//	}
	
	
//    // 3
//	@GetMapping("redirect")
//	public String redirect(Model model) {
//		String name ="hong(model)";
//		int age = 20;
//		
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		
//		return "redirect:/redirectServlet"; // 다만 리다이렉트 방식일땐 모든 데이터가 문자열로 넘어가야함 객체는 안됨X
//	}
//	
	
	
//	@GetMapping("redirectServlet")
//	public String redirectServlet(HttpServletRequest request) {
////		System.out.println(request.getAttribute("msg"));
//		String name = request.getParameter("name");
//		int age = Integer.parseInt(request.getParameter("age"));
//		System.out.println(name + age);
//		return "test2/redirect";
//	}
	
	
	
	
	
	
}
