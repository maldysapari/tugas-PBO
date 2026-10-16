public class Tugas5dan6 {
    public class Segitiga {
    public static void main(String[] args) {
        // Soal nomor 5 - Luas Segitiga
        double alas = 6;
        double tinggi = 8;
        double luas = 0.5 * alas * tinggi;
        
        System.out.println("=== LUAS SEGITIGA ===");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas Segitiga: " + luas);
        
        // Soal nomor 6 - Pythagoras dan Keliling
        double a = 6;  // sisi a
        double b = 8;  // sisi b
        double c = Math.sqrt((a * a) + (b * b));  // sisi miring
        
        double keliling = a + b + c;
        
        System.out.println("\n=== TEOREMA PYTHAGORAS ===");
        System.out.println("Sisi a: " + a);
        System.out.println("Sisi b: " + b);
        System.out.println("Sisi miring (c): " + c);
        System.out.println("Keliling Segitiga: " + keliling);
    }
}
}
