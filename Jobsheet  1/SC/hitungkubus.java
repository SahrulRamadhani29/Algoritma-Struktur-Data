import java.util.Scanner;

public class hitungkubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Perhitungan Kubus:");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = scanner.nextInt();
            
            if (pilihan == 4) {
                System.out.println("Program selesai.");
                break;
            }

            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = scanner.nextDouble();

            if (pilihan == 1) {
                System.out.println("Volume Kubus: " + hitungVolume(sisi));
            } else if (pilihan == 2) {
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
            } else if (pilihan == 3) {
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}
