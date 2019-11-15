package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomWrite2 {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/dam2a/Documents/accesadades/departaments.bin");
        file.delete();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

        String[] nomsDepartaments = {"Admin", "Secretaria", "Informátic", "Gestión"};

        int i = 0;
        for (String nom:nomsDepartaments
        ) {
            randomAccessFile.writeInt((i+1)*10);
            StringBuffer stringBuffer = new StringBuffer(nom);
            stringBuffer.setLength(10);
            randomAccessFile.writeChars(stringBuffer.toString());
            i++;
        }
        randomAccessFile.close();
    }
}
