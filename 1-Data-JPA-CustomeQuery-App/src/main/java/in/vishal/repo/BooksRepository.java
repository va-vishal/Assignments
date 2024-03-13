package in.vishal.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import in.vishal.entity.Books;
import jakarta.transaction.Transactional;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

	@Modifying
	@Transactional
    @Query("INSERT INTO Books (id, name, author, price) VALUES ( :id, :name, :author, :price)")
    void InsertRecord( int id, String name,  String author, int price);
}
