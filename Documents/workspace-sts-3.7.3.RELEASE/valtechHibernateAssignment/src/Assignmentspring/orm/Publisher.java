package Assignmentspring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("pbk")
public class Publisher {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String address;
	private long phone_num;
	@OneToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="publisher")
	private Set<Book> book;

	public Publisher() {
	
	}

	public Publisher(int id, String name, String address, long phone_num) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone_num = phone_num;
	}
	public Publisher(String name, String address, long phone_num) {
		super();

		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", address=" + address + ", phone_num=" + phone_num
				+ ", book=" + book + "]";
	}
	
	
	
}
