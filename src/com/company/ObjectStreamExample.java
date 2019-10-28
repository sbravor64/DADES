package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExample {

    public static class Person implements Serializable{
        String name = null;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.name="Andres Bravo";

        Person person2 = new Person();
        person.name="Jesus Bravo";

        Person person3 = new Person();
        person.name="Kevin Bravo";

        introDades(person);
        introDades(person2);
        introDades(person3);

        readDades();
    }

    public static void introDades(Person person) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/home/dam2a/Documents/accesadades/person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
    }

    public static void readDades() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/home/dam2a/Documents/accesadades/person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Person> datos=(List<Person>)objectInputStream.readObject();

        for (Person person : datos){
            System.out.println(person);
        }
    }
}


