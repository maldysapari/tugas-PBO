package Tugas4;
import java.util.Scanner;

public class Komisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double uangjasa;
        double komisi;
        double total;
        
        System.out.print("Masukkan Harga Barang Yang Telah Di Jual : ");
        double harga = input.nextDouble();
        
        if(harga < 2000000){
            uangjasa = 100000;
            System.out.println("Pendapatan Anda : " + uangjasa);
        }else if(harga == 2000000){
            uangjasa = 100000;
            komisi  = 0.10 * uangjasa;
            total = uangjasa + komisi;
            System.out.println("Pendapatan Anda adalah : " + total);
        }else if(harga > 2000000 && harga <= 5000000){
            uangjasa = 200000;
            komisi = 0.15 * uangjasa;
            total = uangjasa + komisi;
            System.out.println("Pendapatan Anda adalah : " + total);
        }else if(harga > 5000000){
            uangjasa = 500000;
            komisi = 0.20 * uangjasa;
            total = uangjasa + komisi;
            System.out.println("Pendapatan Anda : " + total);
        }
    }
}
