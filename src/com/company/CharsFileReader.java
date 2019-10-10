package com.company;

import java.io.*;
import java.util.Scanner;

public class CharsFileReader {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el directorio donde se encuentra el fichero 'alphabeta.txt': ");
        String direc = scanner.nextLine();

        FileInputStream f = new FileInputStream(direc+"/"+"alphabeta.txt");
        InputStreamReader isr = new InputStreamReader(f);

        char c;

        do {
            c= (char) isr.read();
            System.out.print(c);
        } while (c !='z');
        isr.close();
    }
}
