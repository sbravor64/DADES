package com.company;

import java.io.*;
import java.util.Scanner;

public class CharsFileReader {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el directorio donde se encuentra el fichero 'alphabeta.txt': ");
        String direc = scanner.nextLine();

        FileReader f = new FileReader(direc+"/"+"alphabeta.txt");
        BufferedReader isr = new BufferedReader(f);

        char c;

        try{
            do {
                c= (char) isr.read();
                System.out.print(c);
            } while (c !='z');
        } finally {
            if(isr!=null){
                isr.close();
            }
        }

//        for (char i = 'a'; i <= 'z'; i++) {
//            i=(char) isr.read();
//            System.out.print(i);
//        }
//        isr.close();
    }
}
