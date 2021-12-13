package org.example;

import java.util.List;


public interface AthleteDao {

    Athlete getById(int id);
    void create(Athlete athlete);
    void delete(Athlete athlete);
    List<Athlete> getByTeam(String team);
    List<Athlete> getByName(String name);
    List<Athlete> getAll();
    List<Athlete> getByBirthdate(String date);

}
