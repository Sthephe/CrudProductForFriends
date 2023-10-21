package pe.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
	public HomeController() {		
	}
	
	@GetMapping("/welcome")
	public String welcome_GET() {
		return "welcome";
	}
}
