public class Tugas7 {
    public class UbahString {
    public static void main(String[] args) {
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";

        // Mengubah String a menjadi huruf kecil semua (toLowerCase())
        String a_kecil = a.toLowerCase();
        
        // Mengubah String b menjadi huruf besar semua (toUpperCase())
        String b_besar = b.toUpperCase();
        
        System.out.println("String a awal: \"" + a + "\"");
        System.out.println("String a setelah toLowerCase(): \"" + a_kecil + "\"");
        
        System.out.println("--------------------");
        
        System.out.println("String b awal: \"" + b + "\"");
        System.out.println("String b setelah toUpperCase(): \"" + b_besar + "\"");
    }
}
}
