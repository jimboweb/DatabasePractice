/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasething;

import java.util.Scanner;

/**
 *
 * @author jimstewart
 */
public class DatabaseThing {

    /**
     * @param args the command line arguments
    public static void main(String[] args) {
        DataWriter dw = new DataWriter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer Id number:");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter customer name:");
        String name = sc.nextLine();
        System.out.println("Enter customer address line 1:");
        String addressLine1 = sc.nextLine();
        System.out.println("Enter customer address line 2:");
        String addressLine2 = sc.nextLine();
        System.out.println("Enter customer city:");
        String city = sc.nextLine();
        System.out.println("Enter customer state:");
        String state = sc.nextLine();
        System.out.println("Enter customer Zip:");
        String zip = sc.nextLine();        
        System.out.println("Enter customer phone:");
        String phone = sc.nextLine();
        System.out.println("Enter customer fax:");
        String fax = sc.nextLine();
        System.out.println("Enter customer email:");
        String email = sc.nextLine();
        System.out.println("Enter customer credit limit:");
        Integer creditLimit = sc.nextInt();
        System.out.println("Enter customer Dixcount Code:");
        String discountCode = sc.nextLine();
        
        Customer c = dw.createCustomer(id, name, addressLine1, addressLine2, city, state, phone, fax, email, creditLimit);

        
    }
     */    
    
}
