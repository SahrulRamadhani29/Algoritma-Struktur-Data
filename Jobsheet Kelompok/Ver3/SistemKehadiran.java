import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String namaMahasiswa;

    public Mahasiswa(String nim, String namaMahasiswa) {
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getNim() {
        return nim;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void tampilData() {
        System.out.println("NIM: " + nim + " | Nama: " + namaMahasiswa);
    }
}

class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void tampilData() {
        System.out.println("Kode MK: " + kodeMK + " | Nama: " + namaMK + " | SKS: " + sks);
    }
}

class Absensi {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int hadir;
    int sakit;
    int izin;
    int alpa;

    public Absensi(Mahasiswa mahasiswa, MataKuliah mataKuliah, int hadir, int sakit, int izin, int alpa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.hadir = hadir;
        this.sakit = sakit;
        this.izin = izin;
        this.alpa = alpa;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public int getHadir() {
        return hadir;
    }

    public int getSakit() {
        return sakit;
    }

    public int getIzin() {
        return izin;
    }

    public int getAlpa() {
        return alpa;
    }

    public double hitungPersentaseKehadiran() {
        return (double) hadir / (hadir + izin + alpa + sakit) * 100;
    }

    public void tampilData() {
        System.out.println("NIM: " + mahasiswa.getNim() + " | Nama: " + mahasiswa.getNamaMahasiswa());
        System.out.println("Mata Kuliah: " + mataKuliah.getNamaMK());
        System.out.println("Hadir: " + hadir + " | Sakit: " + sakit + " | Izin: " + izin + " | Alpa: " + alpa);
        System.out.printf("Persentase Kehadiran: %.2f%%\n", hitungPersentaseKehadiran());
    }
}

public class SistemKehadiran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
        ArrayList<Absensi> daftarAbsensi = new ArrayList<>();

        // Contoh Data
        Mahasiswa m1 = new Mahasiswa("22001", "Ali Rahman");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi Santoso");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra Dewi");
        Mahasiswa m4 = new Mahasiswa("22004", "Deni Saputra");
        Mahasiswa m5 = new Mahasiswa("22005", "Eka Wulandari");

        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Desain Web", 2);

        daftarMahasiswa.add(m1);
        daftarMahasiswa.add(m2);
        daftarMahasiswa.add(m3);
        daftarMahasiswa.add(m4);
        daftarMahasiswa.add(m5);

        daftarMataKuliah.add(mk1);
        daftarMataKuliah.add(mk2);
        daftarMataKuliah.add(mk3);

        daftarAbsensi.add(new Absensi(m1, mk1, 10, 1, 1, 0));
        daftarAbsensi.add(new Absensi(m1, mk2, 12, 0, 1, 1));
        daftarAbsensi.add(new Absensi(m2, mk1, 14, 0, 0, 0));
        daftarAbsensi.add(new Absensi(m3, mk2, 9, 2, 1, 2));
        daftarAbsensi.add(new Absensi(m3, mk3, 10, 0, 0, 2));
        daftarAbsensi.add(new Absensi(m4, mk3, 13, 0, 0, 0));
        daftarAbsensi.add(new Absensi(m5, mk1, 11, 1, 1, 1));

        int pilihan;
        do {
            System.out.println("\n=== Sistem Pengelolaan Kehadiran Mahasiswa ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Absensi");
            System.out.println("4. Urutkan Data Absensi Berdasarkan Persentase Kehadiran");
            System.out.println("5. Cari Data Absensi Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== DATA MAHASISWA ===");
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        mahasiswa.tampilData();
                    }
                    break;
                case 2:
                    System.out.println("\n=== DATA MATA KULIAH ===");
                    for (MataKuliah mataKuliah : daftarMataKuliah) {
                        mataKuliah.tampilData();
                    }
                    break;
                case 3:
                    System.out.println("\n=== DATA ABSENSI MAHASISWA ===");
                    for (Absensi absensi : daftarAbsensi) {
                        absensi.tampilData();
                        System.out.println();
                    }
                    break;
                case 4:
                    urutkanAbsensiBerdasarkanPersentase(daftarAbsensi);
                    System.out.println("\n=== DATA ABSENSI BERDASARKAN PERSENTASE KEHADIRAN ===");
                    for (Absensi absensi : daftarAbsensi) {
                        System.out.printf("%.2f%% - %s - %s\n",
                                absensi.hitungPersentaseKehadiran(),
                                absensi.getMahasiswa().getNamaMahasiswa(),
                                absensi.getMataKuliah().getNamaMK());
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimCari = scanner.nextLine();
                    System.out.println("\n=== HASIL PENCARIAN ABSENSI MAHASISWA ===");
                    boolean ditemukan = false;
                    for (Absensi absensi : daftarAbsensi) {
                        if (absensi.getMahasiswa().getNim().equals(nimCari)) {
                            absensi.tampilData();
                            System.out.println();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Data absensi untuk NIM \"" + nimCari + "\" tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    public static void urutkanAbsensiBerdasarkanPersentase(ArrayList<Absensi> daftarAbsensi) {
        int n = daftarAbsensi.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarAbsensi.get(j).hitungPersentaseKehadiran() < daftarAbsensi.get(j + 1).hitungPersentaseKehadiran()) {
                    // Swap
                    Absensi temp = daftarAbsensi.get(j);
                    daftarAbsensi.set(j, daftarAbsensi.get(j + 1));
                    daftarAbsensi.set(j + 1, temp);
                }
            }
        }
    }
}
