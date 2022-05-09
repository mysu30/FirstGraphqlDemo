package learn.graphql.model;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;*/

//@Entity
public class Book {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//@Column(name="title", nullable = false )
	private String title;
	
	//@Column(name="pagecount")
	private Integer pageCount;
	
	//@ManyToOne
	//@JoinColumn(name="author_id", nullable = false, updatable = false)
	private Author author;
	
	public Book() {
	
	}

	public Book(String title, Integer pageCount, Author author) {
		this.title = title;
		this.pageCount = pageCount;
		this.author = author;
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getpageCount() {
		return pageCount;
	}

	public void setDescription(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Tutorial [id="+id+", title="+title+", pageCount="+pageCount+", author="+author+"]";
	}

}
