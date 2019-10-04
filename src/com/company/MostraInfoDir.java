package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MostraInfoDir {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String red="\033[31m";
        String green="\033[32m";
        String reset="\u001B[0m";

        System.out.println("Mostrar lista de Directorio");
        System.out.print("Escribe el path de un Directorio: ");
        String nomDirectori = scanner.nextLine();

        File d = new File(nomDirectori);

        for (File file : d.listFiles()) {
            if(!file.isHidden()){
                if(file.isFile()){
                    System.out.println(red+file.getName());
                } else if (file.isDirectory()){
                    System.out.println(green+file.getName()+reset);
                }
            }
        }

    }
}
