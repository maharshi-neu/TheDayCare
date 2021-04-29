package edu.neu.thedaycare;

import java.util.Collection;

import javax.annotation.Resource;
import javax.mail.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import edu.neu.thedaycare.entities.Classroom;
import edu.neu.thedaycare.entities.Student;
import edu.neu.thedaycare.repository.StudentRepository;

@Controller
public class MainController {
	
	@Autowired
	@Resource
	StudentRepository sturep;
	
    @RequestMapping("")
    public String home() {
        return "home";
    }

    @RequestMapping("/dashboard")
    public String admin(Model model) {
    	List<Student> ss = sturep.findAll();
    	model.addAttribute("students", ss);
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
