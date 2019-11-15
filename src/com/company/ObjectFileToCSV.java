package com.company;

import java.io.*;
import java.util.ArrayList;

public class ObjectFileToCSV {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<User> listUser = new ArrayList<>();
        loadUsers(listUser);
        writeUsersToCSV(listUser);
    }

    public  static void loadUsers(ArrayList<User> listUsers) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("/home/dam2a/Documents/accesadades/users.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        User usuario = (User) objectInputStream.readObject();

        try {
            while (true){
                listUsers.add(usuario);
                usuario= (User) objectInputStream.readObject();
            }
        }catch (EOFException e){
            fileInputStream.close();
            objectInputStream.close();
        }

        System.out.println(listUsers);
    }

    private static void writeUsersToCSV(ArrayList<User> listUsers) throws IOException {
        File file = new File("/home/dam2a/Documents/accesadades/users2.csv");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        bw.write("username" + "," + "firstname" + "," + "lastname");
        bw.newLine();

        for (User u : listUsers
             ) {
            bw.write(u.getUsername() + "," + u.getFirstname() + "," + u.getLastname());
            bw.newLine();
        }
        bw.close();
    }
}


