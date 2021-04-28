package edu.neu.thedaycare;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
    @RequestMapping("")
    public String home() {
        return "home";
    }

    @RequestMapping("/dashboard")
    public String admin() {
        return "dashboard";
    }

}
