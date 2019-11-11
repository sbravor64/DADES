package com.company;

import java.io.*;
import java.util.ArrayList;

public class ObjectFileToCSV {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<User> listUser = new ArrayList<>();
        readDades(listUser);
    }


    public static void readDades(ArrayList<User> listUsers) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/home/dam2a/Documents/accesadades/users.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        listUsers = (ArrayList<User>) objectInputStream.readObject();

//        System.out.println(listUsers);

        for (User u: listUsers) {
            System.out.println(u.getFirstname());
        }

        fileInputStream.close();
        objectInputStream.close();
    }
}


