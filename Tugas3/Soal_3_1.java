package Tugas3;

import java.util.Scanner;

public class Soal_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int npm;
        String nama;
        System.out.print("Masukkan NPM: ");
        npm = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Nama:  ");
        nama = sc.nextLine();
        
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama);
        
    }
}
