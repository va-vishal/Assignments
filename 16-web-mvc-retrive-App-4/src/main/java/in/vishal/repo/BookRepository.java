package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.vishal.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}

