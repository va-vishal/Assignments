package in.vishal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import in.vishal.entity.Person;
import in.vishal.repo.PersonRepo;

@Controller
public class PersonController{
	
	@Autowired
	private PersonRepo personRepo;
	
	public PersonController() {
		System.out.println("user Controller :Constructor()");
	}

	 @GetMapping("/p")
	    public String listPerson(Model model) {
	        List<Person> per= personRepo.findAll();
	        model.addAttribute("pers", per);
	        return "person"; // This is the name of the Thymeleaf template
	    }
	        }


