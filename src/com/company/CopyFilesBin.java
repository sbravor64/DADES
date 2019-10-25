package com.company;

import java.io.*;

public class CopyFilesBin {

    public static void main(String[] args) throws IOException {

        FileInputStream sortida = new FileInputStream("/home/dam2a/Documents/accesadades/img.png");
        DataInputStream dataInputStream = new DataInputStream(sortida);

        FileOutputStream destino = new FileOutputStream("/home/dam2a/Documents/accesadades/nuevo.png");
        DataOutputStream dataOutputStream = new DataOutputStream(destino);


        byte[] bytes = new byte[1024];
        int b=dataInputStream.read(bytes);

        while (b > 0){
            dataOutputStream.write(bytes, 0 , b);
            b=sortida.read(bytes);
        }
        sortida.close();
        destino.close();

    }
}


