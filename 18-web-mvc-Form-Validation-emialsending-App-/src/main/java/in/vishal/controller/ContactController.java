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
import org.springframework.mail.javamail.JavaMailSender;
import in.vishal.entity.Contact;
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
    public String submitForm(@Valid @ModelAttribute Contact contact, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "contact";
        }

        // Send registration success email
        sendRegistrationEmail(contact);

        return "result";
    }

    private void sendRegistrationEmail(Contact contact) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(contact.getEmail());
        message.setSubject("Registration Success");
        message.setText("Dear " + contact.getName() + ",\n\nThank you for registering! Your contact details:\nEmail: "
                + contact.getEmail() + "\nPhone: " + contact.getPhone());
        emailSender.send(message);
    }
}