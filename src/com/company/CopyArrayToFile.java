package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyArrayToFile {

    private static Object BufferedWriter;

    public static void main(String[] args) throws IOException {

        String[] palabras={"hola","buenas","tardes"};
        FileWriter fichero_destination = new FileWriter("/home/dam2a/Escriptori");
        BufferedWriter = new BufferedWriter(fichero_destination);


        for(String dato : palabras){

        }


    }
}


