package ex3;

import java.util.Date;
import java.util.Random;

public class Customer {
    // ATTRIBUTES
    private final int id;
    private String name;
    private String surname;
    private String email;
    private final Date memberFrom;
    private double wallet;

    // CONSTRUCTORS
    public Customer(String name, String surname, String email, int euros) {
        Random idGen = new Random();
        this.id = idGen.nextInt(0, 100);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.wallet = euros;
        this.memberFrom = new Date();
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    // METHODS
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", wallet=" + wallet +
                "€, memberFrom=" + memberFrom +
                "}";
    }
}
