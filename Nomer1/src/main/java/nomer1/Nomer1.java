/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nomer1;

import java.util.Scanner;

public class Nomer1 {

    public static void main(String[] args) {
         //masukan nilainya
        Scanner inputObjek = new Scanner(System.in);
        System.out.println("Masukan nilai: ");
        
        int i, batas = inputObjek.nextInt();
        
        System.out.println("Bilangan dari 1 hingga " + batas + ":");
        for (i = 1; i <= batas; i++){
            System.out.print(i);
        }
        
        
    }
}
