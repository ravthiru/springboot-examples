package com.example.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailServerController {
   
    @GetMapping({"/createmail"})
    public String sendmail(Mail mail, Model model) {
        return "sendmail";
    }
    
    
    @PostMapping("/sendmail")
    public String sendMail(@Valid Mail mail, BindingResult result, Model model) {
    		
    	System.out.println("To Email: " + mail.getTo());
    	System.out.println("From Email: " + mail.getFrom());
    	System.out.println("Subject : " + mail.getSubject());
    	System.out.println("Email Body: " + mail.getBody()); 
    	
        if (result.hasErrors()) {
            return "mailserver";
        }
        model.addAttribute("server", "localhost");
    	model.addAttribute("port", "3144");
        return "mailserver";
    }
    
    @GetMapping("/mailserver")
    public String showSignUpForm(Mail mail, Model model) {
    	model.addAttribute("server", "localhost");
    	model.addAttribute("port", "3144");
        return "mailserver";
    }
    
}
