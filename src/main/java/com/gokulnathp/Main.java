package com.gokulnathp;

import com.gokulnathp.filehandling.ObjectFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectFile dataFile = new ObjectFile();
        dataFile.writeFile();
        dataFile.readFile();
    }
}