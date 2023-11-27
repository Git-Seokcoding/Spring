package com.itwillbs.test2.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwillbs.test2.vo.PersonVO;
import com.itwillbs.test2.vo.TestVo;

@Controller
public class Test3Controller_Redirect4 {
	
	@GetMapping("redirect")
	public String redirect(Model model) {
		String name ="hong(model)";
		int age = 20;
		
		// 디스패치 방식과 동일하게 Model 객체의 addAttribute() 메서드로 데이터 저장
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
		
		return "redirect:/redirectServlet"; // 다만 리다이렉트 방식일땐 모든 데이터가 문자열로 넘어가야함 객체는 안됨X
	}
	//==============================================================================
	// 2) 전달받은 파라미터 명과 동일한 이름의 파라미터를 매핑 메서드 선언부에 명시하면
	//    이름이 일치하는 파라미터 데이터를 자동으로 해당 변수에 저장
	
	
//	@GetMapping("redirectServlet")
//	public String redirectServlet(String name, int age) {
//		// name 파라미터 값이 String 타입 name 변수에 저장되고
//		// age 파라미터값이 int 타입 age 변수에 저장됨(자동으로 정수형 형변환까지 처리됨)
//		// => 주의! 메서드 파라미터 명과 전달되는 데이터의 파라미터 명이 일치하지 않으면
//		//	  매핑이 불가능하므로 선언된 파라미터 변수에 데이터 전달 불가!
//		//    따라서, String 타입의 변수일 경우  null값이 저장됨
//		//    또한, String 타입이 아닌 다른 타입일 경우 자동으로 형변환되는 과정에서
//		//    null값에 접근하게 되므로 예외(오류)가 발생한다!
//		//    (오류 코드)
//		
//		System.out.println("이름 : "+name +"나이 : "+ age);
//		
//		return "test2/redirect";
//	}	
	

	// 해결 1) String타입을 전부 적용
	
	
	@GetMapping("redirectServlet")
	public String redirectServlet(
			@RequestParam(defaultValue = "") String name, 
			@RequestParam(defaultValue = "0") int age) {
		// name 파라미터 값이 String 타입 name 변수에 저장되고
		// age 파라미터값이 int 타입 age 변수에 저장됨(자동으로 정수형 형변환까지 처리됨)
		// => 주의! 메서드 파라미터 명과 전달되는 데이터의 파라미터 명이 일치하지 않으면
		//	  매핑이 불가능하므로 선언된 파라미터 변수에 데이터 전달 불가!
		//    따라서, String 타입의 변수일 경우  null값이 저장됨
		//    또한, String 타입이 아닌 다른 타입일 경우 자동으로 형변환되는 과정에서
		//    null값에 접근하게 되므로 예외(오류)가 발생한다!
		//    (오류 코드)
		
		System.out.println("이름 : "+name +"나이 : "+ age);
		
		return "test2/redirect";
	}	
}
