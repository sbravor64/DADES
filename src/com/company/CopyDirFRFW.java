package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyDirFRFW {

    public static void main(String[] args) throws IOException {

        File fichero_source = new File("/home/dam2a/Escriptori/");
        File fichero_destination = new File("/home/dam2a/prueba");


        if(fichero_source.isDirectory()){
            if(!fichero_destination.exists()){
                fichero_destination.mkdir();
                System.out.println("Hemos creado el fichero destino ya que no existia: " + fichero_destination);
            }

            FileReader fileReader = new FileReader(fichero_source);
            BufferedReader br= new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(fichero_destination);

            for(){

            }
        }




//        copyFolder(fichero_source,fichero_destination);
    }

//    private static void copyFolder(File fichero_source, File fichero_destination) throws IOException {
//
//        if(fichero_source.isDirectory()){
//            if(!fichero_destination.exists()){
//                fichero_destination.mkdir();
//                System.out.println("Hemos creado el fichero destino ya que no existia: " + fichero_destination);
//            }
//
//            String files[] = fichero_source.list();
//
//            for (String file : files){
//                    File srcFile = new File(fichero_source, file);
//                    File destFile = new File(fichero_destination, file);
//
//                    copyFolder(srcFile, destFile);
//            }
//        } else {
//            Files.copy(fichero_source.toPath(), fichero_destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("Fichero copiado: " + fichero_destination);
//        }
//
//    }
}


