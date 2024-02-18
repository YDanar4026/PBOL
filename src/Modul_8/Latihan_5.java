/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;

public class Latihan_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input: ");
        String input = sc.next();
        String result = input.replaceAll("[aiueo]", "@");
        System.out.println("Output: "+result);
        
    }
}
