package org.example;

import java.util.List;


public interface AthleteDao {

    public void create(Athlete athlete);
    public Athlete getById(int id);
    public void update(Athlete athlete);
    public void delete(Athlete athlete);
    public List<Athlete> getByTeam(String team);
    public List<Athlete> getByName(String name);
    public List<Athlete> getAll();
    public List<Athlete> getByBirthdate(String date);

}
