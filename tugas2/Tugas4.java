public class Tugas4 {
    public class OperasiMatematika {
    public static void main(String[] args) {
        // Nilai yang diberikan
        int x = 22;
        int y = 33;
        
        // Operasi Penjumlahan
        int hasilTambah = x + y;
        
        // Operasi Pengurangan
        int hasilKurang = x - y;
        
        // Operasi Perkalian
        int hasilKali = x * y;
        
        // Operasi Pembagian (menggunakan double untuk hasil desimal)
        double hasilBagi = (double) x / y;
        
        System.out.println("--- Operasi Matematika untuk x=22 dan y=33 ---");
        System.out.println("Penjumlahan (x + y) = " + hasilTambah);
        System.out.println("Pengurangan (x - y) = " + hasilKurang);
        System.out.println("Perkalian (x * y) = " + hasilKali);
        System.out.println("Pembagian (x / y) = " + hasilBagi);
    }
}
}
