package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloWorld {

	@GetMapping("/")
//	@ResponseBody
	public String index() {
		return "index";
	}
	@GetMapping("/dasha.html")
	public String dasha() {
		return "dasha";
	}
	@GetMapping("/victoria.html")
	public String victoria() {
		return "victoria";
	}
	@GetMapping("/bohdana.html")
	public String bohdana() {
		return "bohdana";
	}
}
