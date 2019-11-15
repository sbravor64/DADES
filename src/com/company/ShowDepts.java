package com.company;

import java.io.*;

public class ShowDepts {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/dam2a/Documents/accesadades/departaments.bin");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

        int id, dep;
        char nomDepart[] = new char[10], aux;

        for(;;){

            if(randomAccessFile.getFilePointer() == randomAccessFile.length()){
                break;
            }

            id = randomAccessFile.readInt();
            String nomDepartament = "";

            for (int i = 0; i < nomDepart.length ; i++) {
                aux = randomAccessFile.readChar();
                nomDepart[i] = aux;
                if (aux != 0) nomDepartament+= aux;
            }

            if(id > 0){
                System.out.println("id: " + id + " | Nombre: " + nomDepartament);
            }


        }

        randomAccessFile.close();
    }
}
