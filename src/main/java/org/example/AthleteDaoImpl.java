package org.example;

import javax.persistence.*;
import java.util.List;

public class AthleteDaoImpl implements AthleteDao {


    EntityManagerFactory emf;
    EntityManager em;

    public AthleteDaoImpl() {
        emf = Persistence.createEntityManagerFactory("JPAlabb4");
        em = emf.createEntityManager();
    }

    @Override
    public void create(Athlete athlete) {
        em.getTransaction().begin();
        em.persist(athlete);
        em.getTransaction().commit();

    }

    @Override
    public Athlete getById(int id) {
        return em.find(Athlete.class, id);
    }

    @Override
    public void delete(Athlete athlete) {
        em.getTransaction().begin();
        em.remove(athlete);
        em.getTransaction().commit();
    }

    @Override
    public List<Athlete> getByTeam(String team) {
        TypedQuery<Athlete> query = em.createQuery("SELECT a FROM Athlete a WHERE a.team = :team", Athlete.class);
        query.setParameter("team", team);
        return query.getResultList();
    }

    @Override
    public List<Athlete> getByName(String name) {
        TypedQuery<Athlete> query = em.createQuery("SELECT s FROM Athlete s WHERE CONCAT(s.firstName, ' ', s.lastName) LIKE :name", Athlete.class);
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }

    @Override
    public List<Athlete> getAll() {
        return em.createQuery("SELECT s FROM Athlete s", Athlete.class).getResultList();
    }

    @Override
    public List<Athlete> getByBirthdate(String date) {
        TypedQuery<Athlete> query = em.createQuery("SELECT a FROM Athlete a WHERE a.date = :date", Athlete.class);
        query.setParameter("date", date);

        return query.getResultList();
    }

}
