package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyArrayToFile {

    private static Object BufferedWriter;
    private static String[] palabras={"hola","buenas","tardes"};

    public static void main(String[] args) throws IOException {

        File fichero_destination = new File("/home/dam2a/Escriptori/arraylist.txt");
//        File fichero_destination = new File("C:\\Users\\Usuario\\Documents\\Copy\\prueba\\arraylist.txt");
        FileWriter fw = new FileWriter(fichero_destination);

        FileReader f = new FileReader(fichero_destination);
        BufferedReader br = new BufferedReader(f);

        guardarArchivo(fw);
        mostrarPantalla(br);
    }

    public static void guardarArchivo(FileWriter fw) throws IOException {
        for(String dato : palabras){
            fw.write(dato+"\n");
        }
        fw.close();
    }

    public static void mostrarPantalla(BufferedReader br) throws IOException {
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


