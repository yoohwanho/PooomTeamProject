package kr.co.pooom.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {

	@RequestMapping("/test.do")
	public ModelAndView test() {
		return new ModelAndView("test","msg","안녕하세요");
	}
}
