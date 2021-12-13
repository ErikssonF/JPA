package org.example;

public class Main {

    public static void main( String[] args ) {

        AthleteDao athleteDao = new AthleteDaoImpl();

        athleteDao.create(new Athlete("Justin", "Herbert", "Los Angeles Chargers", "1997-02-01"));
        athleteDao.create(new Athlete("George", "Kittle", "San Fransisco 49ers", "1994-11-15"));
        athleteDao.create(new Athlete("Christian", "McCaffrey", "Carolina Panthers", "1992-11-15"));

        athleteDao.getByBirthdate("1997-02-01").forEach(System.out::println);

        athleteDao.getByName("George Kittle").forEach(System.out::println);

        athleteDao.getByTeam("Carolina Panthers").forEach(System.out::println);

        athleteDao.getAll().forEach(System.out::println);

        athleteDao.delete(athleteDao.getById(3));

        System.out.println(athleteDao.getById(3));


    }
}
