package learn.graphql.model;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

//@Entity
public class Author {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//@Column(name="firstname", nullable = false )
	private String firstName;
	
	//@Column(name="secondname", nullable = false )
	private String secondName;
	
	//@Column(name="age")
	private Integer age;
	
	public Author(String firstName, String secondName, Integer age) {
		this.age = age;
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public Long getId() {
		return id;
	}


	public String getFirstname() {
		return this.firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	
	public String getSecondname() {
		return this.secondName;
	}

	public void setSecondname(String secondName) {
		this.secondName = secondName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {		
		return "User [id="+id+", First Name="+firstName+", age="+age+"]";
	}

}
