package org.example;

import java.util.List;


public interface AthleteDao {

    void create(Athlete athlete);
    Athlete getById(int id);
    void delete(Athlete athlete);
    List<Athlete> getByTeam(String team);
    List<Athlete> getByName(String name);
    List<Athlete> getAll();
    List<Athlete> getByBirthdate(String date);

}
