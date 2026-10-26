package Tugas4;
import java.util.Scanner;

public class BilanganGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int hasil = input.nextInt();
        
        if(hasil%2 == 0){
            System.out.println(hasil + " adalah bilangan genap");
        }else{
            System.out.println(hasil + " adalah bilangan ganjil");
        }
    }
}
