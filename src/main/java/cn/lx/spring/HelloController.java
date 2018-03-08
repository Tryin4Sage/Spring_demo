package cn.lx.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	public HelloController() {
		System.out.println("HelloController.HelloController()");
	}
	
	@RequestMapping("/hello.do")
	public String toHello() {
		System.out.println("HelloController.toHello()");
		return "hello";
	}
}
