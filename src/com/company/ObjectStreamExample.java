package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ObjectStreamExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setName("Andres Bravo");

        Person person2 = new Person();
        person2.setName("Jesus Bravo");

        Person person3 = new Person();
        person3.setName("Kevin Bravo");

        ArrayList<Person> listaPersones = new ArrayList<Person>();
        listaPersones.add(person);
        listaPersones.add(person2);
        listaPersones.add(person3);

        introDades(listaPersones);
        readDades();
    }

    public static void introDades(ArrayList<Person> listaPersones) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/home/dam2a/Documents/accesadades/person.bin", false);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);


        objectOutputStream.writeObject(listaPersones.get(0));
        objectOutputStream.writeObject(listaPersones.get(1));
        objectOutputStream.writeObject(listaPersones.get(2));

        fileOutputStream.close();
        objectOutputStream.close();
    }

    public static void readDades() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/home/dam2a/Documents/accesadades/person.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ArrayList<Person> ps = new ArrayList<Person>();
       try {
           while (true){
               ps.add((Person) objectInputStream.readObject());
           }
       }catch (EOFException e){
           fileInputStream.close();
           objectInputStream.close();
       }

        for (Person p : ps){
            System.out.println(p.getName());
        }


    }
}


