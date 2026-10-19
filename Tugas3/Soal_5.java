package Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soal_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int mangga;
        int jambu;
        int tetangga;
        int hasil;
        
        System.out.print("jumlah mangga awal yang di beli bu sisca : " ) ;
        mangga = Integer.parseInt(buf.readLine());
        System.out.print("total jambu awal sebelum di bagikan : " );
        jambu = Integer.parseInt(buf.readLine());
        System.out.print("masukan jumlah tetangga untuk membagikan jambu : ");
        tetangga = Integer.parseInt(buf.readLine());
        hasil = jambu / tetangga;
        
        System.out.println("mangga yang di beli : " + mangga);
        System.out.println(tetangga + " tetangga yang mendapatkan jambu : " + hasil);
        
    }
}
