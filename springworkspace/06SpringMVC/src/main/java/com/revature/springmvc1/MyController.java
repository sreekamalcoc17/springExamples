package com.revature.springmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hi")
	public String sayHello() {
			return "hello"; //WEB-INF/myview/hello.jsp
	}
}
