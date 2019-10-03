package com.company;

import java.io.File;
import java.util.Scanner;

public class MostraFitxers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mostrar lista de ficheros");
        System.out.print("Escribe el path de un Directorio: ");
        String nomDirectori = scanner.nextLine();

        File f = new File(nomDirectori);

        for (File file : f.listFiles()) {
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
