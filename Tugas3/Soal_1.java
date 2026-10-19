package Tugas3;

import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int id_karyawan;
        id_karyawan = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Nomor Induk Karyawan: ");
        
        String Nama_karyawan;
        System.out.print("Masukkan Nama Karyawan: ");
        Nama_karyawan = input.nextLine();       
        String alamat;
        System.out.print("Masukkan Alamat Karyawan: ");
        alamat = input.nextLine();
        String jabatan;
        System.out.print("Masukkan Jabatan: ");
        jabatan = input.nextLine();
        int p1;
        System.out.print("Masukkan Gaji Pokok: ");
        
        p1 = input.nextInt();
        int p2;
        System.out.print("Masukkan Tunjangan Jabatan: ");
        p2 = input.nextInt();
        int p3;
        System.out.print("Masukkan Tunjangan Istri: ");
        p3 = input.nextInt();
        int p4;
        System.out.print("Masukkan Tunjangan Anak: ");
        p4 = input.nextInt();
        int total_gaji = p1 + p2 + p3 + p4;
        double pajak = 0.1 * (p1 + p2 + p4);
        double gaji_bersih = total_gaji - pajak;
        
        
        
        

        System.out.println("Nomor Induk Karyawan :" + id_karyawan);
        System.out.println("Nama Karyawan : " + Nama_karyawan);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Pokok : " + p1);
        System.out.println("Tunjangan Jabatan : " + p2);
        System.out.println("Tunjangan Istri : " + p3);
        System.out.println("Tunjangan Anak : " + p4);
        System.out.println("Total Gaji : " + total_gaji);
        System.out.println("Pajak Penghasilan: " + pajak);
        System.out.println("Gaji Bersih : " + gaji_bersih);
        
    }
}
