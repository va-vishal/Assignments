package in.vishal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	private Integer id;
	private String author;
	private Integer pageCount;
	private String title;
	protected Integer getId() {
		return id;
	}
	protected String getAuthor() {
		return author;
	}
	protected Integer getPageCount() {
		return pageCount;
	}
	protected String getTitle() {
		return title;
	}
	
}
