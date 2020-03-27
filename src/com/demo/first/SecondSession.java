package com.demo.first;

import java.util.*;
public class SecondSession {
    public static void main(String[] args) {
        //dataTypes
        byte b = 12;//(-128 to 127)
        short s = 13; // 2 bytes
        int i =1234; // 4 bytes
        long l = 123L; //8 bytes
        s = (short)i;
        i=s;
        //floating point datatypes
        double df = 1.32;
        float f = 2.12f;

        boolean b1 = true; //false

        char c = 'a';
        System.out.println(c+i);
        String s2 = "a";
        System.out.println(s2+i);
        String s1 = "apple";

        //Arithmetic and Comparator and Logical operators
        int x = 12;
        int y = 20;
        System.out.println(y-x+"\n"+(y+x)+"\n"+(y*x)+"\n"+(y/x));
        int z=2;
//        z+=x; //=>z=z+x;
//        z-=x;
//        z*=x;
//        z/=x;

        //and && => both the conditions should be true
        //or || => one of the conditions should be true
        //not ! => reverse of the same boolean
        System.out.println(((x>y) && (z>y))+"\n"+(x==y)+"\n"+(x!=y)+"\n"+(x>=y));

        //bit wise operators , unary and turnary operators
//        increment and decrement
        System.out.println(x ^ y); //64 101010 32 010111 000010 //2
       x=z++; //x=z  z=z+1
        System.out.println(x);
        x=++z; //z=z+1 x=z
        System.out.println(x);
        z--;
        --z;

        //Scanner
        Scanner sc = new Scanner(System.in);
//        int i1 =sc.nextInt();
//        float i2 =sc.nextFloat();
//        String s4="ax";
//        s4 = sc.nextLine();
//        while(sc.hasNext()) {
//            s4 = sc.nextLine();
//            break;
//        }
//        System.out.println(i1+"\n"+i2+"\n"+s4);

        //control flow statements
        //if-else

        int age = sc.nextInt();
        if(age<18){
            System.out.println("teenager");
        }else if(age>54){
            System.out.println("old");
        }else{
            System.out.println("adult");
        }
        System.out.println("executed always");
    }
}
