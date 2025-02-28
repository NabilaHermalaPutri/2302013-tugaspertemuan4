/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bilanganPrima;

import java.util.Scanner;


public class bilnganPrima {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan bilangan: ");
        int i,j, batas = input.nextInt();

        System.out.println("Bilangan prima dari 1 hingga " + batas + ":");

        // Perulangan untuk mengecek bilangan prima dari 2 hingga batas
        for (i = 2; i <= batas; i++) {
            boolean prima = true;

            // Perulangan untuk mengecek apakah bilangan i adalah prima
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            // Jika prima tetap true, cetak bilangan tersebut
            if (prima) {
                System.out.print(i + " ");
            }
        }

    }
}
