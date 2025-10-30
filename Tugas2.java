import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        final int JML_ATLET_PER_CABOR = 5;
        final int JML_CABOR = cabor.length;

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jmlPoliteknik = sc.nextInt();
        sc.nextLine(); 

        String[][][] dataPorseni = new String[jmlPoliteknik][JML_CABOR][JML_ATLET_PER_CABOR];

        System.out.println("\n===== INPUT DATA ATLET PORSENI =====");

        for (int p = 0; p < jmlPoliteknik; p++) {
            System.out.println("\n--- Politeknik ke-" + (p + 1) + " ---");
            for (int c = 0; c < JML_CABOR; c++) {
                System.out.println("  Cabang: " + cabor[c]);
                for (int a = 0; a < JML_ATLET_PER_CABOR; a++) {
                    System.out.print("    Nama Atlet ke-" + (a + 1) + ": ");
                    dataPorseni[p][c][a] = sc.nextLine();
                }
            }
        }
        
    
        System.out.println("\n\n===== DAFTAR ATLET PORSENI 2024 =====");

        for (int p = 0; p < jmlPoliteknik; p++) {
            System.out.println("\n--- Data Politeknik ke-" + (p + 1) + " ---");
            for (int c = 0; c < JML_CABOR; c++) {
                System.out.println("  Cabang " + cabor[c] + ":");
                for (int a = 0; a < JML_ATLET_PER_CABOR; a++) {
                    System.out.println("    - Atlet ke-" + (a + 1) + ": " + dataPorseni[p][c][a]);
                }
            }
        }

        sc.close();
    }
    
}
