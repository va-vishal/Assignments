package in.vishal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.vishal.Contact;
import io.micrometer.observation.transport.SenderContext;
import jakarta.validation.Valid;

@Controller
public class ContactController {
	@Autowired
	private JavaMailSender emailSender;
	
    @GetMapping("/contact")
    public String showForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public String submitForm(@Valid @ModelAttribute Contact contact,BindingResult bindingResult) {
    	if(bindingResult.hasErrors()) {
    		return"contact";
    	} 
    	sendRegistrationEmail(contact);
    	
        return "result";
    }
    
    private void sendRegistrationEmail(Contact contact) {
    	SimpleMailMessage message=new SimpleMailMessage();
    	message.setFrom("vishalods225@gmail.com");
    	message.setTo(contact.getEmail());
    	message.setSubject("registration Success");
    	message.setText("Dear "+contact.getlname()+" "+contact.getName() +",\nThankYou for registering! Your contact details:"+","+"\nEmail :"+contact.getEmail()+","+"\nPhone: "+contact.getPhone()
    			+ "\nThis is an automated message from SpringBoots and microservices mini project"
    			+ "\nwhich was developed by va vishal"
    			+"\nplease ignore in case of receving multiple times");
    	emailSender.send(message);
    }
}

