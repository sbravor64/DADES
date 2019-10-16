package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyDirFRFW {

    public static void main(String[] args) throws IOException {

//        File directory_source = new File("/home/dam2a/Escriptori/");
//        File directory_destination = new File("/home/dam2a/prueba");

        File directory_source = new File("C:\\Users\\Usuario\\Documents\\Copy\\prueba");
        File directory_destination = new File("C:\\Users\\Usuario\\Documents\\Copy\\enviados");

        String files[] = directory_source.list();

        if(directory_source.isDirectory()){
            if(!directory_destination.exists()){
                directory_destination.mkdir();
                System.out.println("Hemos creado el fichero destino ya que no existia: " + directory_destination);
            }

            for (String file : files) {
                FileReader fileReader = new FileReader(directory_source+ "\\" + file);
                BufferedReader br= new BufferedReader(fileReader);

                FileWriter fileWriter = new FileWriter(directory_destination + "\\" + file);

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

//        copyFolder(directory_source,directory_destination);
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


