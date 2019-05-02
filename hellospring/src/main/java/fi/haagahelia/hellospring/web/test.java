package fi.haagahelia.hellospring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class test {

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	String home() {
		return "hello";
	}
}
