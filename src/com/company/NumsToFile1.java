package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class NumsToFile1 {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Escribe el directorio donde quieres añadir el fichero: ");
//        String direc = scanner.nextLine();
//
//        System.out.println("Escribe el nombre del fichero: ");
//        String ficher = scanner.nextLine();
//
//        File f = new File(direc+"+"+ficher);
//        BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
//        f.createNewFile();
//
//        for (int i = 1100; i <=1200; i++) {
//            bw.write(i+"\n");
//        }
//        bw.close();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el directorio donde quieres añadir el fichero: ");
        String direc = scanner.nextLine();

        File f = new File(direc+"/"+"Num11001200.txt");
        PrintWriter pw = new PrintWriter(f);

        for (int i = 1100; i <=1200; i++) {
            pw.println(i);
        }
        pw.close();
    }
}
