package com.company;

import java.io.*;
import java.util.Scanner;

public class CopyFilesFRFW {

    public static void main(String[] args) throws IOException {

        File fichero_existe = new File("/home/dam2a/Escriptori/alphabeta.txt");

        if (fichero_existe.exists()) {
            FileReader fileReader = new FileReader("/home/dam2a/Escriptori/alphabeta.txt");
            BufferedReader br= new BufferedReader(fileReader);

            File nuevo_fichero = new File("/home/dam2a/Escriptori/fichero_nuevo.txt");
            FileWriter fileWriter = new FileWriter(nuevo_fichero);

            boolean linea = false;
            while (!linea) {
                String datos = br.readLine();

                if (datos==null){
                    linea=true;
                } else {
                    fileWriter.write(datos+"\n");
                };
            }
            fileWriter.close();
            br.close();
            fileReader.close();
        }
    }
}

