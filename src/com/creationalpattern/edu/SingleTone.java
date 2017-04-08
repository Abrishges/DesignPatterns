package com.creationalpattern.edu;

/**
 * Created by Abereham Wodajie on 3/19/17.
 * The singletone object is create as the class-loads. It is also Auto ThreadSafe Singleton Pattern
 */
public class SingleTone {

    private static final SingleTone singleTone = new SingleTone();

    private SingleTone(){}

    public static SingleTone getInstance(){
            return singleTone;
    }
}
