public class Tugas3 {
    public class PersamaanKuadrat {
    public static void main(String[] args) {
        // Nilai yang diberikan: a=2; b=10; c=5
        double a = 2;
        double b = 10;
        double c = 5;
        
        // Rumus: diskriminan (D) = b² - 4ac
        // Menggunakan tipe data double untuk hasil yang lebih akurat
        double diskriminan = (b * b) - (4 * a * c);
        
        System.out.println("--- Hitung Diskriminan Persamaan Kuadrat ---");
        System.out.println("Persamaan: " + a + "x² + " + b + "x + " + c + " = 0");
        System.out.println("Hasil b² - 4ac (Diskriminan) = " + diskriminan); 
        
    }
}
}
