package Tugas3;

import java.util.Scanner;

public class Soal_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int novel;
        int lembar;
        int cetak;
        int menit;
        int jam;
        int hari;
        int detik;
        
        System.out.println("masukan berapa novel yang akan di cetak : ");
        novel = input.nextInt();
        System.out.println("masukan lembar novel : ");
        lembar = input.nextInt();
        
        cetak = novel * lembar;
        
        hari = cetak / 86400;
        cetak = cetak % 86400;

        jam = cetak / 3600;
        cetak = cetak % 3600;

        menit = cetak / 60;
        detik = cetak % 60;
        
        System.out.println("lama mencetak novel adalah : " + hari +" hari "+ jam +" jam "+ menit + " menit ");
    }
}