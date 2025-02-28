/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nomer3;

import java.util.Scanner;


public class Nomer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        // Validasi input
        if (n < 0) {
            System.out.println("Nilai n tidak boleh negatif!");
        } else {
            long faktorial = 1;
            System.out.print(n + "!=");

            for (int i = n; i >= 1; i--) {
                faktorial *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print("*");
                }
            }

            System.out.println("=" + faktorial);
        }
    }
}
