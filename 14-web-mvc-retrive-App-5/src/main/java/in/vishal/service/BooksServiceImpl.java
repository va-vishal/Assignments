package in.vishal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vishal.entity.Books;
import in.vishal.repository.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	private BooksRepository booksRepository;
	@Override
	
	public List<Books> getAllBooks() {
		return booksRepository.findByActiveSW("Y");
	}
	@Override
	public boolean saveBook(Books books) {
		books.setActiveSW("Y");
		Books savedbook = booksRepository.save(books);
		if(savedbook.getId()!=null) {
			return true;
		}
		return false;
	}
	@Override
	public void deleteBooks(Integer id) {
		//HArd Delete
		 //booksRepository.deleteById(id);
		
		//Soft Delete
		Optional<Books> findById = booksRepository.findById(id);
		if(findById.isPresent())
		{
			Books books = findById.get();
			books.setActiveSW("N");
			booksRepository.save(books);
		}
	}
	@Override
	public Books getBookById(Integer id) {
		Optional<Books> byId = booksRepository.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

}
