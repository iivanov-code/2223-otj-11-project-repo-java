package com.example.stockstream.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    @Column(name = "First_name")
    private String FirstName;
    @Column(name = "Last_name")
    private String LastName;
    @Column(name = "Age")
    private int Age;
    @Column(name = "Gender")
    private String Gender;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Admin")
    private boolean Admin;

    public Long getUserId() {return UserId;}
    public void setUserId(Long userId) {UserId = userId;}
    public String getFirstName() {return FirstName;}
    public void setFirstName(String firstName) {FirstName = firstName;}
    public String getLastName() {return LastName;}
    public void setLastName(String lastName) {LastName = lastName;}
    public int getAge() {return Age;}
    public void setAge(int age) {Age = age;}
    public String getGender() {return Gender;}
    public void setGender(String gender) {Gender = gender;}
    public String getEmail() {return Email;}
    public void setEmail(String email) {Email = email;}
    public boolean isAdmin() {return Admin;}
    public void setAdmin(boolean admin) {Admin = admin;}

    public User() {
    }

    public User(String firstName, String lastName, int age, String gender, String email) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Gender = gender;
        Email = email;
        Admin = false;
    }
}
