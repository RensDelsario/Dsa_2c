/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duyag_program;

import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class NewClass1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter (1)rock, (2)paper, (3)Scicor ");

        System.out.println("Enter player1: ");
        int p1 = scan.nextInt();
        System.out.println("Enter player2: ");
        int p2 = scan.nextInt();

        if (p1 == 1 && p2 == 1) {
            System.out.println("draw");
        } else if (p1 == 1 && p2 == 2) {
            System.out.println("p2 win");
        } else if (p1 == 1 && p2 == 3) {
            System.out.println("p2 win");
        } else if (p1 == 2 && p2 == 1) {
            System.out.println("p1 win");
        } else if (p1 == 2 && p2 == 2) {
            System.out.println("draw");
        } else if (p1 == 2 && p2 == 3) {
            System.out.println("p2 win");
        } else if (p1 == 3 && p2 == 1) {
            System.out.println("p1 win");
        } else if (p1 == 3 && p2 == 3) {
            System.out.println("p2 win");
        } else if (p1 == 3 && p2 == 3) {
            System.out.println("draw");
        }

    }
}
