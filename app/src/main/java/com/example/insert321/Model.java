package com.example.insert321;

public class Model {
    String id;
    String name;
    String email;
    String contact;
    String username;
    String password;

    public Model() {
    }

    public Model(String id, String name, String email, String contact, String username, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
