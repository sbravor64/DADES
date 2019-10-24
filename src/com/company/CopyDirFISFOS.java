package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirFISFOS {

    public static void main(String[] args) throws IOException {

        FileInputStream sortida = new FileInputStream("/home/dam2a/Documents/accesadades/img.png");
        FileOutputStream destino = new FileOutputStream("/home/dam2a/Documents/accesadades/nuevo.png");

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


