package org.example;

import java.util.List;


public interface ArtistDao {

    public void create(Artist student);
    public Artist getById(int id);
    public void update(Artist student);
    public void delete(Artist student);
    public List<Artist> getByAgeInterval(int from, int to);
    public List<Artist> getByName(String name);
    public List<Artist> getAll();
    public List<Artist> getByBirthdate(String date);

}
