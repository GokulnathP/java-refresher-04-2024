package com.gokulnathp.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    public void writeFile() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name", "gokul");
        properties.setProperty("age", "12");

        FileOutputStream fileOutputStream = new FileOutputStream("user.properties");

        properties.store(fileOutputStream, null);
        fileOutputStream.close();
    }

    public void readFile() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("user.properties");

        properties.load(fileInputStream);

        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("age"));
    }
}
