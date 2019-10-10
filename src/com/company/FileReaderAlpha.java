package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderAlpha {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el directorio donde se encuentra el fichero 'alphabeta.txt': ");
        String direc = scanner.nextLine();

        FileReader f = new FileReader(direc+"/"+"alphabeta.txt");
        BufferedReader br = new BufferedReader(f);

        boolean eof = false;
        while (!eof){
            String line=br.readLine();
            if(line==null){
                eof=true;
            } else System.out.print(line.toUpperCase()+" ");
        }
        br.close();

    }
}
