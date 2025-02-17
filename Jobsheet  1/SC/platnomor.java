import java.util.Scanner;

public class platnomor {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'M', 'T'};
        String[] kota = {
            "Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", 
            "Pekalongan", "Semarang", "Surabaya", "Madura", "Tegal"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.println("Kota: " + kota[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }

        scanner.close();
    }
}
