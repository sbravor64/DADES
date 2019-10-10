package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TreballadorsToScreen1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String separador=";";

        System.out.println("Escribe el directorio donde se encuentra el fichero: ");
        String direc = scanner.nextLine();
        File f = new File(direc+"/"+"treballadors.txt");
        Scanner opnScanner = new Scanner(f);

//        BufferedReader inputStream = new BufferedReader(new FileReader(f));
//        int id=0;
//
//        String line;
//        while ((line=inputStream.readLine()) != null){
//            id++;
//            String[] datos = line.split(separador);
//            System.out.println("TREBALLADOR "+id);
//
//            for (int i = 0; i <3 ; i++) {
//                System.out.println(datos[i]);
//            }
//
//        }

        String line;
        int id=0;

        while (opnScanner.hasNext()){
            line = opnScanner.nextLine();
            String[] datos = line.split(";");
            id++;
            System.out.println("TREBALLADOR "+id);
            for (int i = 0; i <datos.length ; i++) {
                System.out.println(datos[i]);
            }
        }
    }
}
