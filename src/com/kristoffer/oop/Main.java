package com.kristoffer.oop;

import com.kristoffer.oop.model.Student;

public class Main {

    public static void main(String[] args) {

        // Instantiate Object
        Student benny = new Student("Benny", 15, true);
        Student frida = new Student("Frida", 22, false);

        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(benny.isTired);
        if (benny.isTired) {
            System.out.println("Dang, i'm tired bruh");
        }

        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.isTired);
        if (frida.isTired) {
            System.out.println("Dang, i'm tired bruh");
        } else {
            System.out.println("Dang, i'm not tired bruh");
        }

        /*
        int sum = 0;
        int sum2 = 0;

        sum = addition(15, 15);       // This returns
        sum += 1;
        System.out.println(sum);

        addition2(15, 15);

        /* How to create a method
        *   #1 Visibility Modifier: public, protected, no-mod, private
        *   #2 Static: exclude if not needed
        *   #3 DataType to return: Send data. If nothing == void
        *   #4 Name: camelCase (addTwoNumbers) followed by () {}
        * */

    }

    static int addition(int x, int y) {

        return x + y;
    }

    public static void addition2(int x, int y) {
        System.out.println(x + y);
    }

}
