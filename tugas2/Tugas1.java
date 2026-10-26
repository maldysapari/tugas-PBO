public class Tugas1 {
    public class OperatorIncrement {
    
        public static void main(String[] args) {
        int a = 10;
        
        // Post-increment: nilai a digunakan dulu, baru ditambah
        int b = a++; 
        System.out.println("Nilai a awal: 10");
        System.out.println("Post-increment (b = a++):");
        System.out.println("Nilai b = " + b); // 10
        System.out.println("Nilai a sekarang = " + a); // 11

        System.out.println("--------------------");
        
        int x = 20;
        
        // Pre-increment: nilai x ditambah dulu, baru digunakan
        int y = ++x;
        System.out.println("Nilai x awal: 20");
        System.out.println("Pre-increment (y = ++x):");
        System.out.println("Nilai y = " + y); // 21
        System.out.println("Nilai x sekarang = " + x); // 21
    }
    }
}
