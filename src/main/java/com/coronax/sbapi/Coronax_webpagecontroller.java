package com.coronax.sbapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Coronax_webpagecontroller {

	@RequestMapping("coronax.com")
	public String coronax_homepage() {
		System.out.println("Coronax Home page loading.....");
		return "index.html";

	}
	@RequestMapping("coronax.net")
	public String coronax_homepage2() {
		System.out.println("Coronax Home page loading.....");
		return "index.html";

	}
	@RequestMapping("coronax.org")
	public String coronax_homepage3() {
		System.out.println("Coronax Home page loading.....");
		return "index.html";

	}
	@RequestMapping("coronax.app")
	public String coronax_homepage4() {
		System.out.println("Coronax Home page loading.....");
		return "index.html";

	}
}
