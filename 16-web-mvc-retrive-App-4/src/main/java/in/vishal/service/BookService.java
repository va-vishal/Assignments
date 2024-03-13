package in.vishal.service;

import java.util.List;

import in.vishal.entity.Book;

public interface BookService {

	public List<Book> getAllBooks();
	
	public boolean saveBook(Book book);

}

