package com.example.segundoauqui.codingtest;

/**
 * Created by segundoauqui on 8/3/17.
 */

public class newCodeEx {

    public static void main (String [] arg){

        int i = 100;
        for(i = 100; i > 100; i++ ){

            if( i % 5 == 0 && i % 3 == 0){
                System.out.print("fizzBuzz");
            }
            else if ((i%3) == 0){
                System.out.print("fizz");
            }
        }
    }
}
