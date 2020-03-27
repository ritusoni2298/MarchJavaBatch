package com.demo.first;
import java.util.*;
public class ThirdSession {
    public static void main(String[] args) {
        //switch statement
//        if(condition==boolean)
        /*
         * switch(variable/expr){
         *   case value:
         *       //statements
         *          break;
         *   case value2:
         *       //statements
         *       break
         * ...
         * ..
         * ..
         * default:
         *   //statement
         *   break;
         * }
         * */
        //build one calculator which can do 4 operations
//        System.out.println("Enter one operator from +,-,* and /:");
//        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        System.out.println("eneter two numbers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        //switch
//        int result = 0;
//        switch (ch) { // int,string,char  //! floating, boolean
//            case '+': //values should compile time constant
//                result = a + b;
//                break;
//            case '-':
//                result = a - b;
//                System.out.println("result= " + result);
//                break;
//            case '*':
//                result = a * b;
//                System.out.println("result= " + result);
//                break;
//            case '/':
//                result = a / b;
//                System.out.println("result= " + result);
//                break;
//            default:
//                System.out.println("invalid input");
//        }
//        System.out.println("result= " + result);

        //loop
        //for
        //for(initializer;condition check;increment/decrement){
        //statements
//    }

        //sum of natural values till 1000;
        double sum = 0;
        for(int i=0;i<=1000;i++)
        {
            sum+=i;
        }
        System.out.println("sum = "+sum);

        int i=0;
        sum=0;
        while(i<=1000)
        {
            sum+=i;
            i++;
        }
        System.out.println("sum = "+sum);

        //sum from 100 to 200
        i=201;
        sum=0;
        do{
            sum+=i;
            i++;
        }while(i<=200);
        System.out.println("sum = "+sum);
        //break =>loop, switch
        //continue => loop

        for(int j =0;j<10;j+=2){
            if(j<=6){
                System.out.println("we reached, goal accomplished");
                continue;
            }
            System.out.println("need more steps");
        }
        System.out.println("great work");

        // a-> [1,2,3,4,5,6]
        // collection of object
        //one dimensional
        //multi dimensional
        int i1[];//defining
        String[] st[]; //creating reference
        i1 = new int[10];
        for(int j=0;j<i1.length;j++){
            i1[j]=j+1;
        }
        i1[7]=78;
        int[] i2 = new int[]{1,2,3,4,5,6};
        System.out.println("enter"+(sum+sum)+('a'+'b'));
    }
}
