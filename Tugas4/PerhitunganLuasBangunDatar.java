package Tugas4;
import java.util.Scanner;

public class PerhitunganLuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil;
        
        System.out.println("Pilihan Menu Bangun Datar");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih apa yang ingin di cari luas nya : (1-5) : ");
        int pilihan  = input.nextInt();
        
        switch (pilihan){
            case 1 : {
                System.out.print("Masukkan Sisi Persegi : ");
                double sisi = input.nextDouble();
                hasil  = sisi * sisi;
                System.out.println("Luas Persegi adalah : " + hasil);
                break;
            }
            case 2: {
                System.out.print("Masukakn Alas : ");
                double alas = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tinggi = input.nextDouble();
                hasil = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga adalah : " + hasil);
                break;
            }
            case 3 : {
                System.out.print("Masukkan Jari : ");
                double jari = input.nextDouble();
                hasil = 3.14 * (jari * jari);
                System.out.println("Luas Lingkaran adalah : " + hasil);
                break;
            }
            case 4 : {
                System.out.print("Masukkan Sisi Atas : ");
                double sisiatas = input.nextDouble();
                System.out.print("Masukkan Sisi Bawah : ");
                double sisibawah = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tinggi = input.nextDouble();
                
                hasil = (sisiatas + sisibawah) * tinggi/2;
                System.out.println("Luas Trapesium adalah : " + hasil);
                break;
            }
            case 5 : {
                System.out.print("Masukkan Diagonal 1 : ");
                double diagonal1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2 : ");
                double diagonal2 = input.nextDouble();
                
                hasil = diagonal1 * diagonal2/2;
                System.out.println("Luas Layang-layang adalah : " + hasil);
                break;
            }
            default : {
                System.out.println("Input Tidak Valid!!!");
            }
        }
            
            
            
    }
}