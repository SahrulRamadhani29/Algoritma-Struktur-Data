import java.util.Scanner;

public class tokobunga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] stock = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };

        int[] harga = {75000, 50000, 60000, 10000};

        int[] penguranganStock = {-1, -2, -0, -5};

       
        while (true) {
            System.out.println("\n===== MENU TOKO BUNGA =====");
            System.out.println("1. Tampilkan Pendapatan Cabang");
            System.out.println("2. Tampilkan Stok Setelah Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 3) {
                System.out.println("Terima kasih, program selesai!");
                break;
            }

            System.out.print("Pilih cabang (1-4): ");
            int cabang = scanner.nextInt();

            if (cabang < 1 || cabang > 4) {
                System.out.println("Cabang tidak valid! Silakan pilih antara 1 hingga 4.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    tampilkanPendapatanCabang(stock, harga, cabang);
                    break;
                case 2:
                    tampilkanStockSetelahPengurangan(stock, penguranganStock, cabang);
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    public static void tampilkanPendapatanCabang(int[][] stock, int[] harga, int cabang) {
        int index = cabang - 1;
        int totalPendapatan = 0;

        for (int j = 0; j < stock[index].length; j++) {
            totalPendapatan += stock[index][j] * harga[j];
        }

        System.out.println("\nPendapatan RoyalGarden " + cabang + " jika semua bunga terjual: Rp" + totalPendapatan);
    }

    public static void tampilkanStockSetelahPengurangan(int[][] stock, int[] pengurangan, int cabang) {
        int index = cabang - 1;
        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        System.out.println("\nStock RoyalGarden " + cabang + " setelah pengurangan bunga mati:");
        for (int j = 0; j < stock[index].length; j++) {
            stock[index][j] += pengurangan[j];
            System.out.println(bunga[j] + ": " + stock[index][j]);
        }
    }
}
