package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MostraInfoDir {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mostrar lista de Directorio");
        System.out.print("Escribe el path de un Directorio: ");
        String nomDirectori = scanner.nextLine();

        File d = new File(nomDirectori);
        String [] directorios = d.list();

        for (int i = 0; i <directorios.length ; i++) {
            System.out.println(directorios[i]);
        }

    }
}
