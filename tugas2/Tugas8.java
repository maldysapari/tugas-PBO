public class Tugas8 {
    public class WaktuTempuhCahaya {
    public static void main(String[] args) {
        // Data
        double jarakBumiBulan_km = 384400.0;
        double jarakBumiMatahari_juta_km = 152.1;
        
        // Kecepatan Cahaya (konstanta)
        final double KECEPATAN_CAHAYA_KMS = 300000.0; // km/s
        
        // Konversi jarak Bumi-Matahari ke km
        double jarakBumiMatahari_km = jarakBumiMatahari_juta_km * 1000000.0; // 152.1 juta km
        
        // Rumus Waktu = Jarak / Kecepatan
        
        // Waktu tempuh ke Bulan
        double waktuBulan_detik = jarakBumiBulan_km / KECEPATAN_CAHAYA_KMS;
        
        // Waktu tempuh ke Matahari
        double waktuMatahari_detik = jarakBumiMatahari_km / KECEPATAN_CAHAYA_KMS;
        
        System.out.println("--- Waktu Tempuh Cahaya (Kecepatan = 300,000 km/s) ---");
        System.out.println("Jarak Bumi ke Bulan: " + jarakBumiBulan_km + " km");
        System.out.println("Waktu tempuh ke Bulan: " + waktuBulan_detik + " detik");

        System.out.println("---------------------------------------------------------");

        System.out.println("Jarak Bumi ke Matahari: " + jarakBumiMatahari_km + " km");
        System.out.println("Waktu tempuh ke Matahari: " + waktuMatahari_detik + " detik");
        
        // Bonus: konversi ke menit
        double waktuMatahari_menit = waktuMatahari_detik / 60.0;
        System.out.println("Waktu tempuh ke Matahari: " + waktuMatahari_menit + " menit");
    }
}
}
