package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

class Usuario implements Serializable{
    String nombre;
    int idDepartament;

    public Usuario(String nombre, int idDepartament) {
        this.nombre = nombre;
        this.idDepartament = idDepartament;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDepartament() {
        return idDepartament;
    }

    public void setIdDepartament(int idDepartament) {
        this.idDepartament = idDepartament;
    }
}

public class ShowTreballadors {

    public static <HasMap> void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("/home/dam2a/Documents/accesadades/usersidDepartament.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Usuario usuario1 = new Usuario("andres", 10);
        Usuario usuario2 = new Usuario("jesus", 20);
        Usuario usuario3 = new Usuario("dani", 30);
        Usuario usuario = new Usuario("pratik", 40);
        Usuario usuario4 = new Usuario("kevin", 10);

        File file = new File("/home/dam2a/Documents/accesadades/departaments.bin");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

        HashMap<Integer, String> departaments = new HashMap<>();

        while (randomAccessFile.getFilePointer() != randomAccessFile.length()){
            int codigoDept = randomAccessFile.readInt();
            String nomDepart = "";
            for (int i = 0; i <10 ; i++) {
                char aux = randomAccessFile.readChar();
                if(aux != 0) nomDepart += aux;
            }
            departaments.put(codigoDept, nomDepart);
        }

        ArrayList<Usuario> listUser = new ArrayList<>();
        listUser.add(usuario);
        listUser.add(usuario1);
        listUser.add(usuario2);
        listUser.add(usuario3);
        listUser.add(usuario4);

        objectOutputStream.writeObject(usuario);
        objectOutputStream.writeObject(usuario1);
        objectOutputStream.writeObject(usuario2);
        objectOutputStream.writeObject(usuario3);
        objectOutputStream.writeObject(usuario4);

        for (Usuario u: listUser
             ) {
            System.out.println(u.getNombre() + ";" + departaments.get(u.idDepartament));
        }

    }
}
