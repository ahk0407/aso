package com.test.Controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.Service.testService;

@Controller
public class testController {
	
	private static final Logger logger = LoggerFactory.getLogger(testController.class);

	
	@Autowired
	private testService TestService;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("welcome home! the client localeis {}.",locale);
		
		model.addAttribute("name", TestService.getName("0"));
		
		return "home";
	}

}
