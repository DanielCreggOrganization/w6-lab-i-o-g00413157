package com.example.iolab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputPath = "resources/input.txt";
        String outputPath = "resources/input.txt";

        try (FileInputStream fis = new FileInputStream(inputPath);
                FileOutputStream fos = new FileOutputStream(outputPath);) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File Copied Successfully.");

        } catch (IOException e) {
            System.out.println("Error Copying File." + e.getMessage());
        }

    }
}
