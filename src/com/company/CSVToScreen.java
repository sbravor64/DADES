package com.company;

import java.io.*;

public class CSVToScreen {

    public static void main(String[] args) throws IOException {

//      File fichero_destination = new File("C:\\Users\\Usuario\\Documents\\Copy\\prueba\\vocals.txt");

        BufferedReader br = new BufferedReader(new FileReader("/home/dam2a/Escriptori/leerCSVtoScreen.csv"));

        String linea=br.readLine();

        while (linea!=null){
            String[] datos = linea.split(",");

            int i=0;
            System.out.println("firtname: " + datos[i]); i++;
            System.out.println("lastname: " + datos[i]); i++;
            System.out.println("username " + datos[i]); i++;
            System.out.println("password: " + datos[i]); i++;
            System.out.println("email: " + datos[i]); i++;
            System.out.println("*****");

            linea=br.readLine();
        }
    }

}


