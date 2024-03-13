package in.vishal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import in.vishal.entity.Book;
import in.vishal.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService service;

	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();


		mav.addObject("book",new Book());

		mav.setViewName("index");

		return mav;
	}

	@PostMapping("/book")
	public ModelAndView saveBook(Book book) {

		ModelAndView mav = new ModelAndView();

		boolean status = service.saveBook(book);
		if (status) {
			mav.addObject("succMsg", "Book Saved");
		} else {
			mav.addObject("errMsg", " Failed to save");
		}

		mav.setViewName("index");

		return mav;
	}

	@GetMapping("/books")
	public ModelAndView getBooks() {
		ModelAndView mav = new ModelAndView();
		List<Book> allBooks = service.getAllBooks();
		mav.addObject("books", allBooks);
		mav.setViewName("booksView");
		return mav;
	}
}

