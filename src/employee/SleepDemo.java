/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Date;

/**
 *
 * @author ADARSH
 */
public class SleepDemo {
     public static void main(String[] args) {
        try {
            long start  = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(10*60*10);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = start - end;
            System.out.println("the difference is " +diff);
        }
        catch (Exception e){
            System.out.println("Got an exception");
        }
        // TODO code application logic here
    }
    
    
}
