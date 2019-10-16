package com.company;

import java.io.*;

public class ComptaVocals {

    private static Object BufferedWriter;

    public static void main(String[] args) throws IOException {

//        String[] vocals={"a","e","i","o","u"};
        String split=",";
        int count=0;
        int posAleatoria;

//        File fichero_destination = new File("/home/dam2a/Escriptori");
        File fichero_destination = new File("C:\\Users\\Usuario\\Documents\\Copy\\prueba\\vocals.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero_destination));
        bw.write("a" + split + "e" + split + "i" + split + "o" + split + "u");

        BufferedReader br = new BufferedReader(new FileReader(fichero_destination));

        boolean eof = false;
        while (!eof){
            String[] line=br.lines();
            if(line==null){
                eof=true;
            } else System.out.print(line.toUpperCase()+" ");
        }

//        for(String vocal : vocals){
//            count++;
//            if(count==vocals.length) fw.write(vocal);
//            else fw.write(vocal + split);
//        }
//        fw.close();

        
    }
}


