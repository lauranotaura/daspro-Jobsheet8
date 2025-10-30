import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

       
        int totalPelangganGlobal = 0;
        int totalItemGlobal = 0;
        int jumlahCabang;

        System.out.println("=========================================");
        System.out.println(" SISTEM PENCATATAN PENJUALAN KOPI SENJA ");
        System.out.println("=========================================");

       
        System.out.print("Jumlah cabang kafe: ");
        if (sc.hasNextInt()) {
            jumlahCabang = sc.nextInt();
        } else {
            System.out.println("Input tidak valid. Menggunakan default 2 cabang.");
            jumlahCabang = 2;
            sc.next(); 
        }
        
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        
       
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");

            int jumlahPelanggan;
            int totalItemCabang = 0;
            
          
            System.out.print("Jumlah pelanggan: ");
            if (sc.hasNextInt()) {
                jumlahPelanggan = sc.nextInt();
            } else {
                System.out.println("Input tidak valid. Menggunakan default 0 pelanggan.");
                jumlahPelanggan = 0;
                sc.next();
            }
            
   
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahItem;
                
                
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                if (sc.hasNextInt()) {
                    jumlahItem = sc.nextInt();
                } else {
                    System.out.println("Input tidak valid. Menggunakan 0 item.");
                    jumlahItem = 0;
                    sc.next();
                }
                
                // Akumulasi total item untuk Cabang
                totalItemCabang += jumlahItem;
            }

            // AKUMULASI GLOBAL (di dalam Outer Loop)
            totalPelangganGlobal += jumlahPelanggan;
            totalItemGlobal += totalItemCabang;

            // OUTPUT RINGKASAN CABANG
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);
        }

        sc.close();

        System.out.println("\n-----------------------------------------");
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganGlobal + " orang");
        System.out.println("Item terjual: " + totalItemGlobal + " item");
        System.out.println("=========================================");
    }
}
    
    

