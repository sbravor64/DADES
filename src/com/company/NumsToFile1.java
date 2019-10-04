package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumsToFile1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File f = new File("/home/dam2a/Escriptori/Num11001200.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
        f.createNewFile();

        for (int i = 1100; i <=1200; i++) {
            bw.write(i+"\n");
        }
        bw.close();
    }
}
