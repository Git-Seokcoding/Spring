package com.itwillbs.test1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
//		return "index";
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "index"; //webapp/WEB-INF/views/index.jsp
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String x() {
		return "test/test1";
	}

	@RequestMapping(value = "/BoardWrite", method = RequestMethod.GET)
	public String BoardWrite() {
		
		return "redirect:/BoardList";
	}
	
}
