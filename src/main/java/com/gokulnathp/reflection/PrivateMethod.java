package com.gokulnathp.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class User {
    private void show() {
        System.out.println("From user show");
    }
}

public class PrivateMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> user = Class.forName("com.gokulnathp.reflection.User");

        User userInstance = (User) user.getDeclaredConstructor().newInstance();
        Method showMethod = user.getDeclaredMethod("show");

        showMethod.setAccessible(true);
        showMethod.invoke(userInstance);

        System.out.println(user.getName());
    }
}
