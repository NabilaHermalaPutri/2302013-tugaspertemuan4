/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nomer2;


import java.util.Scanner;


public class Nomer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input batas awal dan akhir
        System.out.print("Masukkan nilai awal: ");
        int nilaiAwal = input.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        int nilaiAkhir = input.nextInt();

        int jumlahGanjil = 0;

        System.out.print("Bilangan ganjil antara " + nilaiAwal + " dan " + nilaiAkhir + ": ");
        
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            if (i % 2 != 0) { // Jika ganjil
                System.out.print(i + " ");
                jumlahGanjil++;
            }
        }

        System.out.println(", Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}
