package Assignmentspring.client;
import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Assignmentspring.orm.Address;
import Assignmentspring.orm.Article;
import Assignmentspring.orm.Author;
import Assignmentspring.orm.Blog;
import Assignmentspring.orm.Book;
import Assignmentspring.orm.HandBook;
import Assignmentspring.orm.Publisher;

public class hibernateClient {
	
	public static void main(String[] args) {

		SessionFactory sf = new AnnotationConfiguration()
				.configure()
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Article.class)
				.addAnnotatedClass(HandBook.class)
				.addAnnotatedClass(Blog.class)
				.addAnnotatedClass(Publisher.class)
				.addAnnotatedClass(Author.class)
				.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		Book b1= new Book("java", new Date(1999, 05, 23));
		Publisher p1 = new Publisher(1, "abc", "bangalore", 87643645);
		
		Author a1= new Author("william", 56432786);
		Blog bl1= new Blog("http://www.google.com", 45);
		HandBook h1 = new HandBook(45, 56785, new Date(1999, 07, 13), 6);
		Article ar1 = new Article("http://www.google.com");
		Address ad1 = new Address("jp nagar","bangalore" , "karnataka", 570459);
		ses.save(p1);
		ses.save(ad1);
		ses.save(h1);
		ses.save(ar1);
		ses.save(bl1);
		ses.save(b1);
		a1.setAddress(ad1);
		ad1.setAuthors(a1);
		ses.save(a1);
		tx.commit();
		ses.close();
		sf.close();
	}
	

}
