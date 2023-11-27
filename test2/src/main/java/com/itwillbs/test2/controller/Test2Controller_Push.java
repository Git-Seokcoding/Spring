package com.itwillbs.test2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itwillbs.test2.vo.TestVo;

@Controller
public class Test2Controller_Push {
	
//	1)
//	@GetMapping("/push")
//	public String push(HttpServletRequest request) {
//		request.setAttribute("msg", "Hello, World! - request");
//		TestVo testvo = new TestVo();
//		testvo.setContent("제목");
//		testvo.setSubject("내용"); 아래의 한줄로 정리 가능
//		request.setAttribute("test", new TestVo("제목","내용"));
//		return "test2/push";
//	}
	
	//2)
	@GetMapping("/push")
	public String push(Model model) {
		System.out.println("Hello, World! - model");
		model.addAttribute("test", new TestVo("제목-model","내용-model"));
		return "test2/push";
	}
	
}
