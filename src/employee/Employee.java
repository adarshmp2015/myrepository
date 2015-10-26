/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.io.*;
package employee;

/**
 *
 * @author ADARSH
 */
public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    
    
    public Employee (String name) {
        this.name = name;
        
    }
    public void empAge(int empAge) {
        age = empAge;
    }
    public void empDesignation (String empDesig) {
        designation = empDesig;
    }
    public void empSalary (double empSalary) {
        salary = empSalary;
    }        
    public void printEmployee(){
        System.out.println("Name is : " +name);
        System.out.println("age is : " +age);
        System.out.println("Designation is : " +designation);
        System.out.println("salary is : " +salary);
        
    }
    
    // * @param args the command line arguments
    // */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
}
