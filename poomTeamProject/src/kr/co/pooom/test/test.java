package kr.co.pooom.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {

	@RequestMapping("/main")
	public ModelAndView test() {
		return new ModelAndView("main","msg","안녕하세요");
	}
	@RequestMapping("/board")
	public String board() {
		return "board";
	}
}
