import java.util.Scanner;
    public class Square21 {
    
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
       for(int iOuter = 1; iOuter <= N; iOuter++) {
            
            // PERULANGAN DALAM (Mengurus BINTANG di setiap baris/KOLOM)
            for(int iInner = 1; iInner <= N; iInner++) {
                // Mencetak bintang tanpa baris baru
                System.out.print("*");
            }
            
            // Pindah ke baris baru setelah perulangan dalam selesai (setelah 1 baris bintang selesai)
            System.out.println(); 
        }
          sc.close() ; 
        }
    }