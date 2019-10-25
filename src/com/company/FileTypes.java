package com.company;

import java.io.*;

public class FileTypes {

    public static void main(String[] args) throws IOException {

        FileOutputStream sortida = new FileOutputStream("/home/dam2a/Documents/accesadades");
        DataOutputStream dataOutputStream = new DataOutputStream(sortida);

        dataOutputStream.writeByte(22);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeChar('z');
        dataOutputStream.writeDouble(1.5);
        dataOutputStream.write(10);
        dataOutputStream.writeFloat(3.6f);
        dataOutputStream.writeLong(5);
        dataOutputStream.writeBytes("hola");
    }

    static void writeByte (byte b){
        dataOutputStream.writeByte(22);
    }
}


