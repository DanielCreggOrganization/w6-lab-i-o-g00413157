package com.example.iolab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputPath = "resources/input.txt";
        String outputPath = "resources/input.txt";

        try (FileReader reader = new FileReader(inputPath);
                FileWriter writer = new FileWriter(outputPath);) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(Character.toUpperCase((char) character));
            }
            System.out.println("File Copied and Converted to UpperCase.");

        } catch (IOException e) {
            System.out.println("Error Copying File." + e.getMessage());
        }

    }
}
