package com.company;

import java.io.*;
import java.util.Scanner;

public class CharsFileToScreen1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el directorio donde se encuentra el fichero 'alphabeta.txt': ");
        String direc = scanner.nextLine();
        File f = new File(direc+"/"+"alphabeta.txt");
        Scanner opnScanner = new Scanner(f);

        while (opnScanner.hasNext()){
            System.out.print(opnScanner.nextLine().toUpperCase()+" ");
        }

    }
}
