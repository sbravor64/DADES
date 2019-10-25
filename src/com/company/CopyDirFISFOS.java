package com.company;

import java.io.*;

public class CopyDirFISFOS {

    public static void main(String[] args) throws IOException {

        File directory_source = new File("/home/dam2a/Imatges");
        File directory_destination = new File("/home/dam2a/Documents/imagesCopy");

        String files[] = directory_source.list();

        if(directory_source.isDirectory()){
            if(!directory_destination.exists()){
                directory_destination.mkdir();
                System.out.println("Hemos creado el fichero destino ya que no existia: " + directory_destination);
            }

            for (String file : files) {

                FileInputStream sortida = new FileInputStream(directory_source + "/" + file);
                FileOutputStream destino = new FileOutputStream(directory_destination + "/" + file);

                byte[] bytes = new byte[1024];
                int b=sortida.read(bytes);

                while (b > 0){
                    destino.write(bytes, 0 , b);
                    b=sortida.read(bytes);
                }
                sortida.close();
                destino.close();
            }
        }
    }
}


