package com.creationalpattern.edu;

/**
 * Created by aberehamwodajie on 3/19/17.
 */
public class Test {


    public static void main(String [] args){

        test("hello");

    }


    public  static void test(String str){

        System.out.println("test method with string is called! ");
    }

    public static void test(Object obj){

        System.out.print("test method with Object is called! ");
    }


}