import java.util.Scanner;

public class RataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int i, j;
        float nilaiMhs, totalNilai = 0, rataNilai; 
        
        i = 1; 
        while (i <= 5) { 
            totalNilai = 0; 
        
            for (j = 1; j <= 5; j++) { 
                
                System.out.print("Nilai ke-" + j + "="); 
                nilaiMhs = sc.nextFloat(); 
                totalNilai += nilaiMhs;
            }
            
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata Mahasiswa ke-" + i + ": " + rataNilai);
            
            i++;
        }
        
        sc.close(); 
    }
}