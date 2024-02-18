/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_8;

import java.util.Scanner;

public class Latihan_7 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        System.out.print("Firstname: ");
        String firstname = s.nextLine();

        System.out.print("Middlename: ");
        String middlename = s.nextLine();

        System.out.print("Lastname: ");
        String lastname = s.nextLine();

        StringBuilder fullname = new StringBuilder();
        fullname.append(firstname);
        
        if (!middlename.isEmpty()) {
            fullname.append(" ").append(middlename);
        }
        
        if (!lastname.isEmpty()) {
            fullname.append(" ").append(lastname);
        }

        System.out.println("Fullname: " + fullname.toString());

        s.close();
        
    }
}
