package in.vishal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vishal.entity.Book;
import in.vishal.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public boolean saveBook(Book book) {
		Book savedBook = bookRepo.save(book);
		if (savedBook.getBookId() != null) {
			return true;
		}
		return false;


}
}
