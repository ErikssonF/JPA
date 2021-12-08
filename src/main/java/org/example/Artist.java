package org.example;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="money")
    private int money;

    @Column(name="date")
    private String date;



    public Artist(){
    }

    public Artist(String firstName, String lastName, int money, String date){
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
        this.date = date;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                ", date='" + date + '\'' +
                '}';
    }
}