package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RecordsTextToCSV  {

    private static String[] nombres = new String[10];
    private static String[] apellidos = new String[10];
    private static String[] edades = new String[10];
    private static String split=",";
    private static int contadorDatos=0;

    public static void main(String[] args) throws IOException {

//      File fichero_destination = new File("C:\\Users\\Usuario\\Documents\\Copy\\prueba\\vocals.txt");

        File file_sortida = new File("/home/dam2a/Escriptori/sortida.csv");
        BufferedReader fr_sortida = new BufferedReader(new FileReader(file_sortida));

        BufferedReader br = new BufferedReader(new FileReader("/home/dam2a/Escriptori/leidoporCSV"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file_sortida));

        llegeixFitxer(br);
        escriuSortidaCSV(bw);
        mostraPerPantalla(fr_sortida);
    }

    public static void llegeixFitxer(BufferedReader br) throws IOException{

        String linea=br.readLine();
        int i=0, y=0, k=0;

        while(linea!=null){
            nombres[i]=linea;
            linea=br.readLine();
            i++;
            apellidos [y]=linea;
            linea=br.readLine();
            y++;
            edades[k]=linea;
            linea=br.readLine();
            k++;
            linea=br.readLine();
            contadorDatos++;
        }
    }

    public static void escriuSortidaCSV(BufferedWriter bw) throws IOException {

        bw.write("nombre" + "," + "apellidos" + "," + "edad");
        bw.newLine();

        for (int i = 0; i < contadorDatos ; i++) {
            bw.write(nombres[i] + split);
            bw.write(apellidos[i] + split);
            bw.write(edades[i]);
            bw.newLine();
        }
        bw.write("\n");
        bw.close();
    }

    public static void mostraPerPantalla(BufferedReader br) throws IOException {
        String linea = br.readLine();

        while(linea!=null){
            System.out.println(linea);
            linea=br.readLine();
        }
    }

}


