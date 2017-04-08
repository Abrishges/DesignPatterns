package com.creationalpattern.edu;

/**
 * Created by aberehamwodajie on 3/19/17.
 *
 * single tone using double-checked locking to reduce the use of synchronization.
 * With the double-checked locking, we first check to see if an instance is created,
 * and if not, then we synchronize.
 */
public class SingleTone2 {
    private static SingleTone2 instance = null;

    private SingleTone2(){}

    private static SingleTone2 getInstance(){
          if(instance == null) {
              synchronized(SingleTone2.class){
                 if (instance == null) {
                     instance = new SingleTone2();
                 }
              }
          }

          return instance;
    }
}
