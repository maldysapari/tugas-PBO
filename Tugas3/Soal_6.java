package Tugas3;

import java.util.Scanner;

public class Soal_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jam1;
        int menit1;
        int jam2;
        int menit2;
        int totaljam1;
        int totaljam2;
        int selisihmenit;
        int jam;
        int menit;
        int detik;
        
        System.out.print("masukan jam 1 : ");
        jam1 = input.nextInt();
        System.out.print("masukan menit dari jam 1 : ");
        menit1 = input.nextInt();
        System.out.print("masukan jam 2 : ");
        jam2 = input.nextInt();
        System.out.print("masukan menit dari jam 2 : ");
        menit2 = input.nextInt();
        
        totaljam1 = (jam1 * 60) + menit1;
        totaljam2 = (jam2 * 60) + menit2;
        selisihmenit = totaljam1 - totaljam2;
        
        jam = selisihmenit / 60;
        menit = selisihmenit % 60;
        detik = selisihmenit * 60;
        
        System.out.println("selisih dari jam 1 dan jam 2 : " + jam + " jam " + menit + " menit " + detik + " detik ");
    }
}
