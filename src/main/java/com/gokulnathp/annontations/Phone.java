package com.gokulnathp.annontations;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SmartPhone {
    int version() default 1;
    String brand();
}

@SmartPhone(brand = "Apple")
class IPhone {
}

public class Phone {
    public static void main(String[] args) {
        SmartPhone annotation = IPhone.class.getAnnotation(SmartPhone.class);
        System.out.println(annotation.brand());
        System.out.println(annotation.version());
    }
}
