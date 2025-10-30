import java.util.Scanner;

public class NilaiKelompok21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;        
        float nilai;      
        float totalNilai;  
        float rataNilai;   

       
        System.out.println("==================================================");
        System.out.println(" PROGRAM PENILAIAN PROYEK KELOMPOK (6 Kelompok) ");
        System.out.println("==================================================");
        System.out.println("Harap masukkan 5 nilai (skala 1-100) untuk setiap kelompok.");
        System.out.println("--------------------------------------------------");

       
        while (i <= 6) { 
            
            System.out.println("\nKelompok " + i);

            totalNilai = 0; 

            
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan Nilai dari Kelompok Penilai " + j + ": ");
                
                
                if (sc.hasNextFloat()) {
                    nilai = sc.nextFloat();
                    if (nilai >= 1 && nilai <= 100) {
                        totalNilai += nilai; 
                    } else {
                        System.out.println("⚠️ Nilai harus 1-100. Ulangi.");
                        j--; 
                    }
                } else {
                    System.out.println("⚠️ Input tidak valid. Masukkan angka. Ulangi.");
                    sc.next(); 
                    j--; 
                }
            }
            
            
            rataNilai = totalNilai / 5;

            System.out.println("Kelompok " + i + ": nilai rata-rata = " + String.format("%.1f", rataNilai));
            
            i++; 
        }

        System.out.println("\n==================================================");
        System.out.println("Perhitungan selesai.");
        sc.close();
    }
}