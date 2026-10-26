public class Tugas9 {
    public class KonversiSuhu {
    public static void main(String[] args) {
        // Nilai yang diberikan
        double C = 10; // Celcius
        double F = 15; // Fahrenheit
        double R = 5;  // Reamur

        // --- a. Celcius ke Fahrenheit dan sebaliknya ---
        
        // C -> F: F = (9/5 * C) + 32
        double C_ke_F = (9.0 / 5.0 * C) + 32;
        System.out.println("a. Celcius ke Fahrenheit:");
        System.out.println(C + "°C = " + C_ke_F + "°F");
        
        // F -> C: C = 5/9 * (F - 32)
        double F_ke_C = 5.0 / 9.0 * (F - 32);
        System.out.println("Fahrenheit ke Celcius:");
        System.out.println(F + "°F = " + F_ke_C + "°C");
        
        System.out.println("---------------------------------");
        
        // --- b. Celcius ke Reamur dan sebaliknya ---
        
        // C -> R: R = 4/5 * C
        double C_ke_R = 4.0 / 5.0 * C;
        System.out.println("b. Celcius ke Reamur:");
        System.out.println(C + "°C = " + C_ke_R + "°R");
        
        // R -> C: C = 5/4 * R
        double R_ke_C = 5.0 / 4.0 * R;
        System.out.println("Reamur ke Celcius:");
        System.out.println(R + "°R = " + R_ke_C + "°C");
        
        System.out.println("---------------------------------");
        
        // --- c. Fahrenheit ke Reamur dan sebaliknya ---
        
        // F -> R: R = 4/9 * (F - 32)
        double F_ke_R = 4.0 / 9.0 * (F - 32);
        System.out.println("c. Fahrenheit ke Reamur:");
        System.out.println(F + "°F = " + F_ke_R + "°R");
        
        // R -> F: F = 9/4 * R + 32
        double R_ke_F = 9.0 / 4.0 * R + 32;
        System.out.println("Reamur ke Fahrenheit:");
        System.out.println(R + "°R = " + R_ke_F + "°F");
    }
}
}
