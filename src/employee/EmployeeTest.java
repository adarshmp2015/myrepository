/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
//import java.io.*;

/**
 *
 * @author ADARSH
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Marry Anna");
        
        empOne.empAge(21);
        empOne.empDesignation("software engineer");
        empOne.empSalary(20000);
        empOne.printEmployee();
        
        empTwo.empAge(22);
        empTwo.empDesignation("senior software engineer");
        empTwo.empSalary(25000);
        empTwo.printEmployee();
        
        
     
        // TODO code application logic here
    }
    
}
