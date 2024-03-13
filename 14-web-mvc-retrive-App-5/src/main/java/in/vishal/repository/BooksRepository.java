package in.vishal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishal.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>{

	public List<Books> findByActiveSW(String status);
}
