package org.jointheleague.mywebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DefaultController {
@RequestMapping("/")
String page1() {
	return "index";
}
}
