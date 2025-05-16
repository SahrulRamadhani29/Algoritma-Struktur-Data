import java.util.Scanner;

public class LayananAkademikSIAKAD24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan24 antrian = new AntrianLayanan24(5);
        int pilihan;
        do {
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Antrian Terakhir");
            System.out.println("0. Keluar");
            System.out.println("-------------------");
            pilihan = sc.nextInt();
            sc.nextLine(); // Buang newline
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa24 keluar = antrian.layaniMahasiswa24();
                    if (keluar != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        keluar.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.getJumlahAntrian());
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
        } while (pilihan != 0);
    }
}
