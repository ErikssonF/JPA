package org.example;

import java.util.List;

public class Main {

    public static void main( String[] args ) {

        ArtistDao artistDao = new ArtistDaoImpl();

       // artistDao.create(new Artist("Frege", "Eriksson", 50000, "1997-02-01"));

        artistDao.getByBirthdate("1997-02-01").forEach(System.out::println);

//        artistDao.getAll().forEach(System.out::println);
    }
}
