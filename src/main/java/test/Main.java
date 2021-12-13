package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {



    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    EntityManager em = emf.createEntityManager();

    Author author = new Author("Fredrik", "Eriksson");
    Author author1 = new Author("Albin", "Dübech");

    Book book = new Book("Titel", "Svenska", 199, author);
    Book book1 = new Book("test", "Engelska", 299, author1);

    em.getTransaction().begin();
    em.persist(author);
    em.persist(author1);
    em.persist(book);
    em.persist(book1);

    em.remove(author1);

    em.getTransaction().commit();
    em.close();

    }
}
