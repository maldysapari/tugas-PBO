package Tugas4;
import java.util.Scanner;

public class GajiPokok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalgaji;
        double tunjangan;
        
        System.out.println("GAJI POKOK KARYAWAN");
        System.out.print("Masukkan NIK : ");
        int nik = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Golongan : ");
        int golongan = input.nextInt();
        
        if(golongan == 1){
            System.out.println("Status = Menikah");
            double gaji = 1200000;
            System.out.println("Gaji = " + gaji);
            tunjangan = 0.10 * gaji;
            totalgaji = gaji + tunjangan;
            System.out.println("Total Gaji : " + totalgaji);
        }else if(golongan == 2){
            System.out.println("Status = Belum menikah");
            double gaji = 1500000;
            System.out.println("Total Gaji : " + gaji);
        }else if(golongan == 3){
            System.out.println("Status =  Cerai");
            double gaji = 1750000;
            System.out.println("Total Gaji : " + gaji);
        }else if(golongan == 4){
            System.out.println("Status = Menikah dan Punya anak");
            double gaji = 2000000;
            tunjangan = 0.10 * gaji;
            System.out.print("Jumlah anak : ");
            int anak = input.nextInt();
            if(anak != 0){
                double tunjangananak = 0.05 * gaji * anak;
                totalgaji = tunjangan + tunjangananak;
                System.out.println("Total Gaji : " + totalgaji);
            }
            else{
                System.out.println("Total Gaji : " + gaji);
            }
        }else{
            System.out.println("Input Tidak Valid");
        }
        
        
    }
}