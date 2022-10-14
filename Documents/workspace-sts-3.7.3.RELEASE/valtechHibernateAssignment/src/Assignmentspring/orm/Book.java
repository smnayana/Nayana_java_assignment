package Assignmentspring.orm;




import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

;



@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="allbooks")
@DiscriminatorColumn(name="disc")
@DiscriminatorValue("bk")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date whenpublish;
	@ManyToMany(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
	@JoinTable(name="book_author",joinColumns=@JoinColumn(name="book_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="author_id",referencedColumnName="id"))
	private Set<Author> author;
	@ManyToOne(targetEntity=Publisher.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
	@JoinColumn(name="publisher_id",referencedColumnName="id")
	private Publisher publisher;

	
	public Book() {
	}


	public Book(int id, String name, Date whenpublish) {
		super();
		this.id = id;
		this.name = name;
		this.whenpublish = whenpublish;
	}
	
	public Book(String name, Date whenpublish) {
		super();
		this.name = name;
		this.whenpublish = whenpublish;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Date getWhenpublish() {
		return whenpublish;
	}


	public void setWhenpublish(Date whenpublish) {
		this.whenpublish = whenpublish;
	}


	public Set<Author> getAuthor() {
		return author;
	}


	public void setAuthor(Set<Author> author) {
		this.author = author;
	}


	public Publisher getPublisher() {
		return publisher;
	}


	

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}



	
	
}
