package Assignmentspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//import Assignmentspring.orm.Author;

@Entity
@DiscriminatorValue("adbk")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String street;
	private String city;
	private String state;
	private int zipcode;
	@OneToOne(targetEntity=Author.class)
	@JoinColumn(name="author_id",referencedColumnName="id")
	private Author authors;
	
	
	public Address() {
	}


	public Address(int id, String street, String city, String state, int zipcode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Address(String street, String city, String state, int zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public Author getAuthors() {
		return authors;
	}


	public void setAuthors(Author authors) {
		this.authors = authors;
	}


	

	
	

}
