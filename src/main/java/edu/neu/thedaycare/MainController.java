package edu.neu.thedaycare;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class MainController {
	
    @RequestMapping("")
    public String home() {
        return "home";
    }
	
	@RequestMapping(value="/enquiry", method=RequestMethod.GET)
	public String enquiry(Model model) {
		
		System.out.println("welcome->enquiry()");
		
		return "enquiry";
		
	}

    @RequestMapping("/dashboard")
    public String admin() {
        return "dashboard";
    }


	@RequestMapping(value="dashboard/students", method=RequestMethod.GET)
	public String student(Model model) {
		
		System.out.println("welcome->dashstudent()");
		
		return "student";
		
	}
	
	@RequestMapping(value="dashboard/teachers", method=RequestMethod.GET)
	public String teacher(Model model) {
		
		System.out.println("welcome->dashteacher()");
		
		return "teacher";
		
	}
	
	@RequestMapping(value="dashboard/classroom", method=RequestMethod.GET)
	public String classroom(Model model) {
		
		System.out.println("welcome->dashclassroom()");
		
		return "classroom";
		
	}
	
	@RequestMapping(value="dashboard/report", method=RequestMethod.GET)
	public String report(Model model) {
		
		System.out.println("welcome->dashreport()");
		
		return "report";
		
	}

	@RequestMapping(value="/AboutUs", method=RequestMethod.GET)
	public String AboutUs(Model model) {
		
		System.out.println("welcome->AboutUs()");
		
		return "AboutUs";
		
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
