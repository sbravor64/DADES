package com.company;

import java.io.*;
import java.util.ArrayList;

class Usuario implements Serializable{
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public Usuario(String username, String firstname, String lastname, String email, String password) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class ObjectFileToCSV {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Usuario> listUser = new ArrayList<>();
        readDades(listUser);
        loadUsers(listUser);
    }


    public static void readDades(ArrayList<Usuario> listUsers) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/home/dam2a/Documents/accesadades/users.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            while (true){
                listUsers.add((Usuario) objectInputStream.readObject());
            }
        }catch (EOFException e){
            fileInputStream.close();
            objectInputStream.close();
        }
    }

    public  static void loadUsers(ArrayList<Usuario> listUsers) {

    }
}


