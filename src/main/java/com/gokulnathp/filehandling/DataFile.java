package com.gokulnathp.filehandling;

import java.io.*;

public class DataFile {
    public void writeFile(String text) throws IOException {
        File file = new File("data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeUTF(text);
        dataOutputStream.close();
    }

    public void readFile() throws IOException {
        File file = new File("data.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        String text = dataInputStream.readUTF();
        System.out.println(text);

        dataInputStream.close();
    }
}
