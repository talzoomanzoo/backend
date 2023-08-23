package com.talzoo.controller.copy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("/hahaha") // browser에서 hello로 request가 들어오면
	public String hello(Model model, @RequestParam(value = "whoru", required = false) String name) { // request value로 whoru이라는 attribute 들어오면 String name에 담음 (false라서 value가 필수 아님) 
		model.addAttribute("greeting", "안녕하세요, " + name); // model에 이렇게 attribute .addAttribute(attribute key, the value of the attribute)
		return "hi"; // dispatcher servlet한테 이걸 넘겨줌 -- web-inf 밑에서 리턴해주는 값에 해당하는 jsp 파일을 찾아서 만들어서 html로 바꿔서 view로 뿌려줌 (여기서는 hello.jsp)
	}
}
