package com.company;

import java.io.*;
import java.util.ArrayList;

class User implements Serializable{

    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public User(String username, String firstname, String lastname, String email, String password) {
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
}

public class CSVToObjectFile {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("/home/dam2a/Documents/accesadades/users.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));

        ArrayList<String> listUser = new ArrayList<>();

        loadUsers(br, listUser);
    }

    public static void loadUsers(BufferedReader br, ArrayList<String> listUser) throws IOException, ClassNotFoundException {
        String linea=br.readLine();
        String[] datos = linea.split(";");

        while (linea!=null){
            for (String dato : datos) {
                listUser.add(dato);
            }

            User user = new User(listUser.get(0),listUser.get(1),listUser.get(2),listUser.get(3), listUser.get(4));
            ArrayList<User> listusers = new ArrayList<User>();
            writeUsers(listusers);
            readDades();

            linea=br.readLine();
            listUser.clear();
        }
    }

    public static void writeUsers(ArrayList<User> listUser) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("/home/dam2a/Documents/accesadades/users.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(listUser);
    }

    public static void readDades(ArrayList<User> list) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/home/dam2a/Documents/accesadades/users.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ArrayList<User> users = (ArrayList<User>) objectInputStream.readObject();

        for (User u : users){
            System.out.println(u.getUsername());
        }

        fileInputStream.close();
        objectInputStream.close();
    }
}


