package Tugas4;
import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double diskon = 0;
        double total;
        double bayar;
        
        System.out.print("Masukkan Jumlah Harga Belanja : ");
        double harga = input.nextDouble();
        input.nextLine(); 
        System.out.println("Total Belanja : " + harga);
        
        System.out.print("Apakah punya member (ya/tidak): ");
        String member = input.nextLine();
        
        boolean ya = member.equalsIgnoreCase("ya");
        
        if(ya && harga >= 500000){
            diskon = 50000;
            System.out.println("Anda Punya Member Dan Belanja Besar! Diskon: " + diskon);
        } 
        else if(ya && harga >= 100000){
            diskon = 15000;
            System.out.println("Anda Punya Member! Diskon: " + diskon);
        } 
        else if(!ya && harga >= 100000){
            diskon = 10000;
            System.out.println("Diskon Belanja Biasa: " + diskon);
        } 
        else {
            System.out.println("Tidak ada diskon.");
        }
        
        total = harga - diskon;
        System.out.println("Total Belanja Anda adalah : " + total);
        System.out.print("Bayar : ");
        bayar = input.nextDouble();
        double kembalian = bayar - total;
        System.out.println("kembalian anda : " + kembalian);
        
    }
}
