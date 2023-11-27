package com.itwillbs.test2.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itwillbs.test2.vo.PersonVO;
import com.itwillbs.test2.vo.TestVo;

@Controller
public class Test4Controller_MAV {
	
	
//	@GetMapping("mav")
//	public ModelAndView mav() {
//		PersonVO person = new PersonVO();
//		person.setAge(20);
//		person.setName("홍길동");
////		Map<String, PersonVO> map = new HashMap<String, PersonVO>();
////		map.put("person", person);
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("person", person);
//		map.put("testvo", new TestVo("제목", "내용"));
//		
//		ModelAndView mav = new ModelAndView("test2/model_and_view","map",map);
//		return mav;
//	}
	
	//================================================================================
	
	@GetMapping("mav")
	public ModelAndView mav(Map<String, Object> map, PersonVO person) {
//		PersonVO person = new PersonVO();
		person.setName("홍길동");
		person.setAge(20);
//		Map<String, PersonVO> map = new HashMap<String, PersonVO>();
//		map.put("person", person);
//		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("person", person);
		map.put("testvo", new TestVo("제목", "내용"));
		
		ModelAndView mav = new ModelAndView("test2/model_and_view","map",map);
		return mav;
	}
}
