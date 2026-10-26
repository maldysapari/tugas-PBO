package Tugas3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Soal_2 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream (new FileOutputStream("pembelanjaan.bin"));
        
        String nama = "Minuman";
        int totalbelanja = 10000;
        double diskon = 10;
        
        double potongan = totalbelanja * (diskon/100);
        double total2 = totalbelanja - potongan;
        double bayar = 12000;
        double kembalian = bayar - total2;
        
        dos.writeUTF(nama);
        dos.writeInt(totalbelanja);
        dos.writeDouble(diskon);
        dos.writeDouble(total2);
        dos.writeDouble(bayar);
        dos.writeDouble(kembalian);
        
        System.out.println("Data Berhasil Di Simpan");
        
        DataInputStream dis = new DataInputStream (new FileInputStream("pembelanjaan.bin"));
        
        nama = dis.readUTF();
        totalbelanja = dis.readInt();
        diskon = dis.readDouble();
        total2 = dis.readDouble();
        bayar = dis.readDouble();
        kembalian = dis.readDouble();
        
        System.out.println("Nama : " + nama);
        System.out.println("Total Belanja : " + totalbelanja);
        System.out.println("Diskon (%) : " + diskon);
        System.out.println("Total : " + total2);
        System.out.println("Bayar : " + bayar);
        System.out.println("Kembalian : " + kembalian);
        
    }
}
