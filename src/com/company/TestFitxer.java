package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestFitxer {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el directorio donde quieres añadir el fichero: ");
        String nomDirectori = scanner.nextLine();
        System.out.println();
        System.out.print("Escribe el nombre del fichero: ");
        String nomFixer = scanner.nextLine();

        File test = new File(nomDirectori+nomFixer);

        System.out.println("NOM: " + test.getName());
        System.out.println("Directori pare: " + test.getParent());
        System.out.println("Ruta absoluta: " + test.getAbsolutePath());

        test.createNewFile();

        if(test.exists()) {
            System.out.println("existe");
        } else {
            System.out.println("no existe");
        }
    }
}
