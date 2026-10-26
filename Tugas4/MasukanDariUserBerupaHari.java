package Tugas4;
import java.util.Scanner;

public class MasukanDariUserBerupaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Hari : (1-7) : ");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1 : {
                System.out.println("Kode " + pilihan + " adalah hari Senin");
                break;
            }
            case 2 : {
                System.out.println("Kode " + pilihan + " adalah hari Selasa");
                break;
            }
            case 3 : {
                System.out.println("Kode " + pilihan + " adalah hari Rabu");
                break;
            }
            case 4 : {
                System.out.println("Kode " + pilihan + " adalah hari Kamis");
                break;
            }
            case 5 : {
                System.out.println("Kode " + pilihan + " adalah hari Jum'at");
                break;
            }
            case 6 : {
                System.out.println("Kode " + pilihan + " adalah hari Sabtu");
                break;
            }
            case 7 : {
                System.out.println("Kode " + pilihan + " adalah hari Minggu");
                break;
            }
            default : {
                System.out.println("Input Tidak Valid");
                break;
            }
        }
    }
}