package com.company;

import java.io.*;

public class FileTypes {

    public static void main(String[] args) throws IOException {


        FileOutputStream sortida = new FileOutputStream("/home/dam2a/Documents/accesadades/fichero.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(sortida);

        dataOutputStream.writeByte(22);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeChar('z');
        dataOutputStream.writeDouble(1.5);
        dataOutputStream.writeFloat(3.6f);
        dataOutputStream.writeLong(5);
        dataOutputStream.writeBytes("hola");

        dataOutputStream.close();

        FileReader fr = new FileReader("/home/dam2a/Documents/accesadades/fichero.txt");
        BufferedReader br = new BufferedReader(fr);

        String line=br.readLine();

        while (line!=null){
            System.out.println(line);
            line=br.readLine();
        }
        fr.close();
        br.close();

        FileInputStream fileInputStream = new FileInputStream("/home/dam2a/Documents/accesadades/fichero.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);


        while (dataInputStream.available() > 0) {
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readLine());
        }
        fileInputStream.close();
        dataInputStream.close();
    }
}


