package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RecordsTextToCSV  {

    public static void main(String[] args) throws IOException {
//      File fichero_destination = new File("C:\\Users\\Usuario\\Documents\\Copy\\prueba\\vocals.txt");

        File file_sortida = new File("/home/dam2a/Escriptori/sortida.csv");

        BufferedReader br = new BufferedReader(new FileReader("/home/dam2a/Escriptori/leidoporCSV"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file_sortida, true));

        llegeixFitxer(br);
        escriuSortidaCSV(bw);
    }

    public static void llegeixFitxer(BufferedReader br) throws IOException{

        String[] nombres = new String[10];
        String[] apellidos = new String[10];
        String[] edades = new String[10];

        String linea=br.readLine();
        while(linea!=null){
            String datos = linea;
        }
    }

    public static void escriuSortidaCSV(BufferedWriter bw) throws IOException {
        bw.write("Esto es una prueba usando Buffered");
        bw.newLine();
        bw.write("Seguimos usando Buffered");
    }

    public void mostraPerPantalla(){}

}


