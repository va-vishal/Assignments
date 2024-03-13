package in.vishal.service;

import java.util.List;

import in.vishal.entity.Books;

public interface BooksService {

	public List<Books> getAllBooks();
	
	public boolean saveBook(Books books);
	
	public void deleteBooks(Integer id);

	public Books getBookById(Integer id);
}
