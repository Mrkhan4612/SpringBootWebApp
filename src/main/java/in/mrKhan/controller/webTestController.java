package in.mrKhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webTestController {

	
	@RequestMapping("/test")
	public String helloTest(Model model){
		
		model.addAttribute("msg", "hello mrKhan");
		
		return"success";
	}
}
