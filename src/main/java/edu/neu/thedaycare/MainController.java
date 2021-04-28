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
    
    @RequestMapping("/testemail")
    public String testEmail() {

    	String to = "jinandra.m@northeastern.edu";
    	String from = "The Day Care <notifications@thedaycare.com>";
    	String subject = "welcome to The Day Care!";
    	String body = "welcome to The Day Care! \n Hello World";
    	EmailService es = new EmailService();
    	es.sendSimpleMessage(to, from, subject, body);
    	
    	return "dashboard";
    }

}
