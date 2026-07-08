/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.duyag_program;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class Duyag_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        String name = input.toString();
        
        System.out.println("Enter number: ");
        int x = input.nextInt();
        
        System.out.println("Enter number: ");
        int y = input.nextInt();
        
        if (name == "john"){
            System.out.println("Hey" + name);
        }
        else {
            System.out.println("wala ka sa list boit!!");
        }
        
        int sum, diff, prod, quot;
        sum = y + x;
        diff = y - x;
        prod = y * x;
        quot = y / x;
        System.out.println("sum in: " + sum);
        System.out.println("sum in: " + diff);
        System.out.println("sum in: " + prod);
        System.out.println("sum in: " + quot);
        
        
    }
}
