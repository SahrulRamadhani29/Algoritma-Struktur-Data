import java.util.Scanner;

public class matkul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 5) {
                System.out.println("Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    tampilkanJadwal(namaMK, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang dicari: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalByHari(namaMK, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang dicari: ");
                    int sem = scanner.nextInt();
                    tampilkanJadwalBySemester(namaMK, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String cariMK = scanner.nextLine();
                    cariMataKuliah(namaMK, sks, semester, hariKuliah, cariMK);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }

    public static void tampilkanJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalByHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
            }
        }
    }

    public static void tampilkanJadwalBySemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah untuk Semester " + sem + ":");
        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
            }
        }
    }

    public static void cariMataKuliah(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String cariMK) {
        System.out.println("\nHasil Pencarian Mata Kuliah " + cariMK + ":");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(cariMK)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
