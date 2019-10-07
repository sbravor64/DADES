package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TreballadorsToFile1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el directorio donde quieres añadir el fichero: ");
        String direc = scanner.nextLine();

        File f = new File(direc+"/"+"treballadors.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(f,true));
        String continuar;

        do{
            System.out.print("Escribe el nombre: ");
            String nom = scanner.nextLine();
            System.out.print("Escribe los apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Escribe el salario: ");
            int salario = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Es casado: ");
            String casado = scanner.nextLine();

            pw.println(nom+";"+apellidos+";"+salario+";"+casado);

            System.out.print("¿Quieres continuar? (SI/NO): ");
            continuar = scanner.nextLine();

        } while (continuar.equals("si"));
        pw.close();
    }
}
