package in.vishal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.vishal.entity.Books;
import in.vishal.service.BooksService;

@Controller
public class BooksController {
	
	@Autowired
	private BooksService Service;
	
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Integer id)
	{
		ModelAndView mav=new ModelAndView();
		Service.deleteBooks(id);
		List<Books> allBooks = Service.getAllBooks();
		mav.addObject("book", allBooks);
		mav.setViewName("booksView");
		return mav;
	}
	@GetMapping("/edit")
	public ModelAndView editBooks(@RequestParam("id") Integer id)
	{
		Books bookobj = Service.getBookById(id);
		ModelAndView mav=new ModelAndView();
		mav.addObject("books",bookobj);
		mav.setViewName("index"); 
		return mav;
		
	}
	
	@GetMapping("/index")
	public ModelAndView index()
	{
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("books",new Books());
		mav.setViewName("index");
		return mav;
		
	}
	
	@PostMapping("/book")
	public ModelAndView saveBook(Books books)
	{
		ModelAndView mav=new ModelAndView();
		boolean status = Service.saveBook(books);
		if(status) {
			mav.addObject("msg1", "sucessfully saved");
		}
		else {
			mav.addObject("msg2", "Error Failed");
		}
		mav.setViewName("index");
		return mav;
	}
	
	
	@GetMapping("/books")
	public ModelAndView getBooks()
	{
		ModelAndView mav=new ModelAndView();
		List<Books> allBooks = Service.getAllBooks();
		mav.addObject("book", allBooks);
		mav.setViewName("booksView");
		return mav;
	}
	
	

}
