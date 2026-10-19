package Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soal_3_2 { 
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        int npm;
        
        System.out.print("Masukkan NPM: ");
        npm = Integer.parseInt(buf.readLine());
        System.out.print("Masukkan Nama: ");
        nama = buf.readLine();
        
        System.out.println("NPM: " + npm);
        System.out.println("Nama: " + nama);
        
    }
}
