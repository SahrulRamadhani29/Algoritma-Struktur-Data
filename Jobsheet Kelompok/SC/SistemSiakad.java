import java.util.Scanner;

public class SistemSiakad {
    static Dosen[] dataDosen = {
        new Dosen("D001", "Budi Hartono"),
        new Dosen("D002", "Rina Marlina"),
        new Dosen("D003", "Agus Wijaya"),
        new Dosen("D004", "Siti Aminah"),
        new Dosen("D005", "Andi Pratama"),
        new Dosen("D006", "Joko Setiawan"),
    };

    static MataKuliah[] dataMataKuliah = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Pemrograman Java", 3),
        new MataKuliah("MK003", "Basis Data", 3),
        new MataKuliah("MK004", "Algoritma dan Pemrograman", 2),
        new MataKuliah("MK005", "Matematika Diskrit", 2),
        new MataKuliah("MK006", "Jaringan Komputer", 3),
        new MataKuliah("MK007", "Pemrograman Web", 3),
        
        new MataKuliah("MK008", "Sistem Operasi", 3)
    };

    static Jadwal[] dataJadwal = {
        new Jadwal(dataDosen[0], dataMataKuliah[1], "Senin", "08:00"),
        new Jadwal(dataDosen[1], dataMataKuliah[1], "Selasa", "10:00"),
        new Jadwal(dataDosen[2], dataMataKuliah[2], "Rabu", "09:00"),
        new Jadwal(dataDosen[0], dataMataKuliah[3], "Kamis", "13:00"),
        new Jadwal(dataDosen[3], dataMataKuliah[4], "Jumat", "07:00"),
        new Jadwal(dataDosen[4], dataMataKuliah[5], "Senin", "11:00"),
        new Jadwal(dataDosen[1], dataMataKuliah[6], "Rabu", "14:00"),
        new Jadwal(dataDosen[5], dataMataKuliah[7], "Rabu", "14:00")
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Jadwal");
            System.out.println("4. Urutkan Jadwal Berdasarkan Hari & Jam");
            System.out.println("5. Cari Jadwal Berdasarkan Nama Dosen");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanDataDosen();
                    break;
                case 2:
                    tampilkanDataMataKuliah();
                    break;
                case 3:
                    tampilkanDataJadwal();
                    break;

                case 4:
                    urutkanJadwal();
                    break;
                case 5:
                    System.out.print("Masukkan nama dosen: ");
                    String namaDosen = sc.nextLine();
                    cariJadwal(namaDosen);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 0);
        
        sc.close();
    }

    static void tampilkanDataDosen() {
        System.out.println("=== DATA DOSEN ===");
        for (Dosen d : dataDosen) {
            d.tampilData();
        }
    }

    static void tampilkanDataMataKuliah() {
        System.out.println("=== DATA MATA KULIAH ===");
        for (MataKuliah mk : dataMataKuliah) {
            mk.tampilData();
        }
    }

    static void tampilkanDataJadwal() {
        System.out.println("=== DATA JADWAL KULIAH ===");
        for (Jadwal j : dataJadwal) {
            j.tampilData();
        }

        for (int i = 0; i < dataJadwal.length - 1; i++) {
            for (int j = 0; j < dataJadwal.length - 1 - i; j++) {
                if (compareJadwal(dataJadwal[j], dataJadwal[j + 1]) == 0) {
                    System.out.println("Jadwal kuliah bentrok: " + dataJadwal[j].dosen.namaDosen + " - " + dataJadwal[j].mataKuliah.namaMK + ", Pada Hari : " + dataJadwal[j].hari +", Pada Jam : " + dataJadwal[j].jam);
                    System.out.println("Jadwal kuliah bentrok: " + dataJadwal[j+1].dosen.namaDosen + " - " + dataJadwal[j+1].mataKuliah.namaMK + ", Pada Hari : " + dataJadwal[j].hari +", Pada Jam : " + dataJadwal[j+1].jam);
                    break;
            }
        }
        }

    }

    static void urutkanJadwal() {
        // Bubble Sort berdasarkan hari dan jam
        for (int i = 0; i < dataJadwal.length - 1; i++) {
            for (int j = 0; j < dataJadwal.length - 1 - i; j++) {
                if (compareJadwal(dataJadwal[j], dataJadwal[j + 1]) > 0) {
                    Jadwal temp = dataJadwal[j];
                    dataJadwal[j] = dataJadwal[j + 1];
                    dataJadwal[j + 1] = temp;
                }
            }
        }

        System.out.println("=== JADWAL KULIAH TERURUT (Hari & Jam) ===");
        for (Jadwal j : dataJadwal) {
            System.out.printf("%s - %s | %s - %s\n",
                j.hari, j.jam, j.dosen.namaDosen, j.mataKuliah.namaMK);
        }
    }

    static int compareJadwal(Jadwal j1, Jadwal j2) {
        int hariValue1 = getHariValue(j1.hari);
        int hariValue2 = getHariValue(j2.hari);
        
        if (hariValue1 != hariValue2) {
            return hariValue1 - hariValue2;
        }
        
        return convertJamToMinutes(j1.jam) - convertJamToMinutes(j2.jam);
    }

    static int getHariValue(String hari) {
        switch (hari.toLowerCase()) {
            case "senin": return 1;
            case "selasa": return 2;
            case "rabu": return 3;
            case "kamis": return 4;
            case "jumat": return 5;
            case "sabtu": return 6;
            case "minggu": return 7;
            default: return 8;
        }
    }

    static int convertJamToMinutes(String jam) {
        String[] parts = jam.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    static void cariJadwal(String namaDosen) {
        boolean found = false;
        System.out.println("=== HASIL PENCARIAN JADWAL ===");
        for (Jadwal j : dataJadwal) {
            if (j.dosen.namaDosen.equalsIgnoreCase(namaDosen)) {
                j.tampilData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data dosen dengan nama \"" + namaDosen + "\" tidak ditemukan.");
        }
    }
}
