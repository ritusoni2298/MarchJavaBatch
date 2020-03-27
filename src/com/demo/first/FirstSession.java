package com.demo.first;
//java.lang
import java.util.ArrayList;
//access modifier:
//private
//public'
//protected
//default

//static

 public class FirstSession {
     static String a; //class variable
     //executable class
    public static void main(String[] arg) {
          Person ayushi = new Person();
          Person veena = new Person();
//
//          ayushi.sleep();
//          ayushi.work(0);
    }
}

//well encapsulated
//encapsulation::


class Person{
     //attributes //instance variables
    private String name; //ayushi type:person[ [name:[]:4bytes] [age:[]:4bytes], sleep(), work()]
    private int age;
    static String a; //class variab;le
    //behaviour
    public void sleep(){

        int a=10; //local variable
        name = "Ayushi";
        System.out.println("For 8 hours");
    }

    public void work(int a){ //method parameter
        System.out.println("For 9 hours");
    }
}

