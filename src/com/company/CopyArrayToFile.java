package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyArrayToFile {

    private static Object BufferedWriter;

    public static void main(String[] args) throws IOException {

        String[] palabras={"hola","buenas","tardes"};

//        File fichero_destination = new File("/home/dam2a/Escriptori");
        File fichero_destination = new File("C:\\Users\\Usuario\\Documents\\Copy\\prueba\\arraylist.txt");
        FileWriter fw = new FileWriter(fichero_destination);

        for(String dato : palabras){
            fw.write(dato+"\n");
        }
        fw.close();

        FileReader f = new FileReader(fichero_destination);
        BufferedReader br = new BufferedReader(f);

        boolean eof = false;
        while (!eof){
            String line=br.readLine();
            if(line==null){
                eof=true;
            } else System.out.print(line+" ");
        }
        br.close();

    }
}


