import java.util.Scanner;

public class ipk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Deklarasi array
        String[] namaMK = new String[jumlahMK];
        int[] sksMK = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalNilai = 0;
        int totalSKS = 0;

        // Input data mata kuliah
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("\nMasukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMK[i] = scanner.nextLine();

            System.out.print("Masukkan jumlah SKS untuk " + namaMK[i] + ": ");
            sksMK[i] = scanner.nextInt();

            System.out.print("Masukkan nilai angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Konversi nilai angka ke nilai huruf dan nilai setara
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65 && nilaiAngka[i] < 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50 && nilaiAngka[i] < 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 39 && nilaiAngka[i] < 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            // Menjumlahkan total nilai dan total SKS
            totalNilai += nilaiSetara[i] * sksMK[i];
            totalSKS += sksMK[i];
        }

        // Menampilkan hasil konversi nilai
        System.out.println("\nHasil Konversi Nilai:");
        System.out.printf("%-30s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot SKS");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-30s %-12.2f %-12s %-12d\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], sksMK[i]);
        }

        // Menghitung IP Semester
        double ipSemester = totalNilai / totalSKS;
        System.out.printf("\nIP Semester: %.2f\n", ipSemester);

        scanner.close();
    }
}
