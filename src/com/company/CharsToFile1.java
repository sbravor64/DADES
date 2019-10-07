package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharsToFile1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el directorio donde quieres añadir el fichero: ");
        String direc = scanner.nextLine();

        File f = new File(direc+"/"+"alphabeta.txt");
        PrintWriter pw = new PrintWriter(f);

        for (char i = 'a'; i <='z'; i++) {
            pw.println(i);
        }
        pw.close();
    }
}
