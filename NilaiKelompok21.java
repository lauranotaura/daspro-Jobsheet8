import java.util.Scanner;

public class NilaiKelompok21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int i = 1;         
        float nilai;        
        float totalNilai;   
        float rataNilai;    

     
        float maxRataRata = 0; 
        int kelompokTerbaik = 0; 

      
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

       
            if (rataNilai > maxRataRata) {
                maxRataRata = rataNilai;    
                kelompokTerbaik = i;         
            }
            
            i++; 
        }

        sc.close();
        
     
        System.out.println("\n==================================================");
        System.out.println("KELOMPOK DENGAN RATA-RATA NILAI TERTINGGI:");
        System.out.println("🏆 Kelompok Terbaik adalah: Kelompok " + kelompokTerbaik);
        System.out.println("   Dengan rata-rata nilai sebesar: " + String.format("%.1f", maxRataRata));
        System.out.println("==================================================");
    }
}