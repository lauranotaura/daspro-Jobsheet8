import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        final int BATAS_N = 5; 

        
        for (int n = 1; n <= BATAS_N; n++) {
            int jumlahKuadrat = 0;
            String deretKuadrat = "";

            for (int i = 1; i <= n; i++) {
                
                int kuadrat = i * i; 
                jumlahKuadrat += kuadrat;

                
                deretKuadrat += kuadrat;
                if (i < n) {
                    deretKuadrat += " + ";
                }
            }

      
            System.out.printf("n = %d -> jumlah kuadrat = %s = %d%n",  n, deretKuadrat, jumlahKuadrat);
        }
    }
}

    

