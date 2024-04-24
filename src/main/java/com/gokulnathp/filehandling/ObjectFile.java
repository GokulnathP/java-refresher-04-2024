package com.gokulnathp.filehandling;

import java.io.*;

class User implements Serializable {
    String name;
}

public class ObjectFile {
    public void writeFile() throws IOException {
        User user = new User();
        user.name = "Gokul";

        FileOutputStream fileOutputStream = new FileOutputStream("user.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(user);
        objectOutputStream.close();
    }

    public void readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("user.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        User user = (User) objectInputStream.readObject();
        System.out.println(user.name);

        objectInputStream.close();
    }
}
