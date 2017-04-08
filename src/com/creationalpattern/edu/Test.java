package com.creationalpattern.edu;

/**
 * Created by aberehamwodajie on 3/19/17.
 */
public class Test {


    public static void main(String [] args){

        System.out.println(SingleTone3.INSTANCE);

        test("hello");

    }


    public  static void test(String str){

        System.out.println("Test method with string is executed! ");
    }

    public static void test(Object obj){

        System.out.print("Test method with Object is executed! ");
    }


}