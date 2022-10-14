package Assignmentspring.orm;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("hbk")
public class HandBook extends Book{
	
	private int isbn;
	private float price;
	@Temporal(TemporalType.DATE)
	private Date publishedYear;
	private int edition;
	
	public HandBook() {
		
	}

	public HandBook(int isbn, float price, Date publishedYear, int edition) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.publishedYear = publishedYear;
		this.edition = edition;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	public Date getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(Date publishedYear) {
		this.publishedYear = publishedYear;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "HandBook [isbn=" + isbn + ", price=" + price + ", publishedYear=" + publishedYear + ", edition="
				+ edition + "]";
	}
	
	

}
