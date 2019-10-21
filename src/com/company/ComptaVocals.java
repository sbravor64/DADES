package com.company;

import java.io.*;
import java.util.Scanner;

public class ComptaVocals {

    private static Object BufferedWriter;

    public static void main(String[] args) throws IOException {

        String[] vocales={"a","e","i","o","u"};
        String split=",";
        int[] count = {0,0,0,0};

        File file_vocals = new File("/home/dam2a/Escriptori/vocals.csv");
//        File fichero_destination = new File("C:\\Users\\Usuario\\Documents\\Copy\\prueba\\vocals.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file_vocals, true));
        BufferedReader br = new BufferedReader(new FileReader("/home/dam2a/Escriptori/treballadors.txt"));

        for (String vocal : vocales) {
            if(vocal.equals("u")) bw.write(vocal);
            else bw.write(vocal + split);
        }

        boolean eof = false;
        while (!eof){
            String line=br.readLine();
            char[] arrayChar = line.toCharArray();

            for (int i = 0; i < arrayChar.length ; i++) {
                if(arrayChar[i]=='a' || arrayChar[i]=='A'){
                    count[0]++;
                } else if(arrayChar[i]=='e' || arrayChar[i]=='E'){
                    count[1]++;
                } else if(arrayChar[i]=='i' || arrayChar[i]=='I'){
                    count[2]++;
                } else if(arrayChar[i]=='o' || arrayChar[i]=='O'){
                    count[3]++;
                } else if(arrayChar[i]=='u' || arrayChar[i]=='U'){
                    count[4]++;
                }
            }

            bw.newLine();

            for(int c : count){
                bw.write(c+split);
            }
            bw.close();

            count = new int[]{0, 0, 0, 0};

            if(line==null){
                eof=true;
            }
        }
        br.close();
    }
}


