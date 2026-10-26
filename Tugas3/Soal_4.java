package Tugas3;

import java.util.Scanner;

public class Soal_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m;
        double v;
        double r;
        
        System.out.print("Masukkan Nilai Untuk m : ");
        m = input.nextDouble();
        System.out.print("Masukkan Nilai Untuk v : ");
        v = input.nextDouble();
        System.out.print("Masukkan Nilai Untuk r : ");
        r = input.nextDouble();
        double fc = m * (v * v) / r;
        
        System.out.println("Hasil dari menghitung gaya sentripetal adalah : " + fc);         
    }
}
