package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreaDir {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String rutaDirec="/home/dam2a/prueba";
        File directorio = new File(rutaDirec);

        if (!directorio.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Se ha creado el Directorio: " + directorio.getName());
            } else {
                System.out.println("No ha estado posible crear el Directorio");
            }
        } else {
            System.out.println("El directorio ya ha sido creado");
        }
    }
}
