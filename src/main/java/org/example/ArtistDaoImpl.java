package org.example;

import javax.persistence.*;
import java.util.List;


public class ArtistDaoImpl implements ArtistDao {


    EntityManagerFactory emf;
    EntityManager em;

    public ArtistDaoImpl() {
        emf = Persistence.createEntityManagerFactory("jpa");
        em = emf.createEntityManager();
    }

    @Override
    public void create(Artist artist) {
        em.getTransaction().begin();
        em.persist(artist);
        em.getTransaction().commit();

    }

    @Override
    public Artist getById(int id) {
        return em.find(Artist.class, id);
    }

    @Override
    public void update(Artist artist) {
        em.getTransaction().begin();
        em.merge(artist);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Artist artist) {
        em.getTransaction().begin();
        em.remove(artist);
        em.getTransaction().commit();
    }

    @Override
    public List<Artist> getByAgeInterval(int from, int to) {
        TypedQuery<Artist> query = em.createQuery("SELECT s FROM Artist s WHERE s.money BETWEEN :from AND :to", Artist.class);
        query.setParameter("from", from);
        query.setParameter("to", to);
        return query.getResultList();
    }

    @Override
    public List<Artist> getByName(String name) {
        TypedQuery<Artist> query = em.createQuery("SELECT s FROM Artist s WHERE CONCAT(s.firstName, ' ', s.lastName) LIKE :name", Artist.class);
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }

    @Override
    public List<Artist> getAll() {
        return em.createQuery("SELECT s FROM Artist s", Artist.class).getResultList();
    }

    @Override
    public List<Artist> getByBirthdate(String date) {
        TypedQuery<Artist> query = em.createQuery("SELECT a FROM Artist a WHERE a.date = :date", Artist.class);
        query.setParameter("date", date);

        return query.getResultList();
    }

}
