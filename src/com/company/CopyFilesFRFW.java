package com.company;

import java.io.*;
import java.util.Scanner;

public class CopyFilesFRFW {

    public static void main(String[] args) throws IOException {

//        InputStream inputStream = null;
//        OutputStream outputStream = null;
//
//        String source = "/home/dam2a/Escriptori/alphabeta.txt";
//        String dest = "/home/dam2a/Escriptori/fichero_nuevo.txt";


        BufferedReader br = new BufferedReader(new FileReader("/home/dam2a/Escriptori/alphabeta.txt"));

        File file_new = new File("/home/dam2a/Escriptori/alphabeta.txt")
        FileOutputStream bw = new FileOutputStream(file_new);



        String datos;

        boolean eof = false;

        while (!eof){
            datos = br.readLine();
            bw.write(datos);
            bw.newLine();
            bw.close();
            if(datos==null){
                eof=true;
            }
        }
        br.close();


//        char c;
//        try{
//            do {
//                c= (char) br.read();
//                bw.write(c);
//            } while (c !='z');
//        } finally {
//            if(br!=null){
//                br.close();
//            }
//        }
//        br.close();
//        fw.close();

    }

}

