package Assignmentspring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("abk")
@Table(name="Author1")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private long phone_num;
	@ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="author")
	@JoinColumn(name="book_id",referencedColumnName="id")
	private Set<Book> books;
	@OneToOne(targetEntity=Address.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="authors")
	@JoinColumn(name="address_id",referencedColumnName="id")
	private Address address;
	
	
	
	public Author() {
	}


	public Author(int id, String name, long phone_num) {
		super();
		this.id = id;
		this.name = name;
		this.phone_num = phone_num;
	}
	
	public Author(String name, long phone_num) {
		super();
		this.name = name;
		this.phone_num = phone_num;
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


	public long getPhone_num() {
		return phone_num;
	}


	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}


	public Set<Book> getBooks() {
		return books;
	}


	public void setBooks(Set<Book> books) {
		this.books = books;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", phone_num=" + phone_num + ", books=" + books + ", address="
				+ address + "]";
	}


	
	
	

}
