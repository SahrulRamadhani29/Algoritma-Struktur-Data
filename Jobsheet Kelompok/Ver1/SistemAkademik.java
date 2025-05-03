import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void tampilData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println();
    }
}

class MataKuliah {
    String kodeMK;
    String namaMK;

    public MataKuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void tampilData() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println();
    }
}

class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    // Method untuk menghitung nilai akhir
    public void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tampilData() {
        System.out.println("NIM          : " + mahasiswa.getNim());
        System.out.println("Nama         : " + mahasiswa.getNama());
        System.out.println("Mata Kuliah  : " + mataKuliah.getNamaMK());
        System.out.println("Tugas        : " + nilaiTugas);
        System.out.println("UTS          : " + nilaiUTS);
        System.out.println("UAS          : " + nilaiUAS);
        System.out.printf("Nilai Akhir  : %.1f\n", nilaiAkhir);
        System.out.println();
    }
}

public class SistemAkademik {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
        ArrayList<Penilaian> daftarPenilaian = new ArrayList<>();

        // Contoh data
        Mahasiswa m1 = new Mahasiswa("22001", "Ali Rahman");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi Santoso");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra Dewi");

        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data");
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data");
        MataKuliah mk3 = new MataKuliah("MK003", "Desain Web");

        daftarMahasiswa.add(m1);
        daftarMahasiswa.add(m2);
        daftarMahasiswa.add(m3);

        daftarMataKuliah.add(mk1);
        daftarMataKuliah.add(mk2);
        daftarMataKuliah.add(mk3);

        daftarPenilaian.add(new Penilaian(m1, mk1, 80, 85, 90));
        daftarPenilaian.add(new Penilaian(m1, mk2, 60, 75, 70));
        daftarPenilaian.add(new Penilaian(m2, mk1, 75, 70, 80));
        daftarPenilaian.add(new Penilaian(m3, mk2, 85, 90, 95));
        daftarPenilaian.add(new Penilaian(m3, mk3, 80, 90, 65));

        int pilihan;
        do {
            System.out.println("=== Sistem Pengelolaan Nilai Mahasiswa ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Data Penilaian Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

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
                    System.out.println("\n=== DATA PENILAIAN MAHASISWA ===");
                    for (Penilaian penilaian : daftarPenilaian) {
                        penilaian.tampilData();
                    }
                    break;
                case 4:
                    urutkanBerdasarkanNilaiAkhir(daftarPenilaian);
                    System.out.println("\n=== DATA MAHASISWA BERDASARKAN NILAI AKHIR (DESC) ===");
                    for (int i = 0; i < daftarPenilaian.size(); i++) {
                        Penilaian penilaian = daftarPenilaian.get(i);
                        System.out.printf("%d. %s - %s - Nilai Akhir: %.1f\n",
                                i + 1,
                                penilaian.getMahasiswa().getNama(),
                                penilaian.getMataKuliah().getNamaMK(),
                                penilaian.getNilaiAkhir());
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimCari = scanner.nextLine();
                    System.out.println("\n=== HASIL PENCARIAN PENILAIAN ===");
                    boolean ditemukan = false;
                    for (Penilaian penilaian : daftarPenilaian) {
                        if (penilaian.getMahasiswa().getNim().equals(nimCari)) {
                            penilaian.tampilData();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Data dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 0);

        scanner.close();
    }

    // Metode untuk mengurutkan daftar penilaian berdasarkan nilai akhir (Bubble Sort)
    public static void urutkanBerdasarkanNilaiAkhir(ArrayList<Penilaian> daftarPenilaian) {
        int n = daftarPenilaian.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarPenilaian.get(j).getNilaiAkhir() < daftarPenilaian.get(j + 1).getNilaiAkhir()) {
                    // Tukar posisi
                    Penilaian temp = daftarPenilaian.get(j);
                    daftarPenilaian.set(j, daftarPenilaian.get(j + 1));
                    daftarPenilaian.set(j + 1, temp);
                }
            }
        }
    }
}
