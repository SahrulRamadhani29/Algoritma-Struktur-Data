public class dataDosen24 {
    dosen24[] dataDosen;
    int idx;

    public dataDosen24(int jumlah) {
        dataDosen = new dosen24[jumlah];
        idx = 0;
    }

    void tambah(dosen24 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        System.out.println("\nData Dosen:");
        for (dosen24 d : dataDosen) {
            d.tampil();
            System.out.println("--------------------");
        }
    }

    void sortBubble() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    dosen24 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    int pencarianDataSequential24(String cari) {
        int posisi = -1;
        boolean lebihDariSatu = false;

        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                if (posisi != -1) {
                    lebihDariSatu = true;
                }
                posisi = i;
            }
        }

        if (lebihDariSatu) {
            System.out.println("Peringatan: Lebih dari satu hasil ditemukan untuk nama \"" + cari + "\".");
        }

        return posisi;
    }

    int pencarianDataBinary24(int cari, int awal, int akhir) {
        if (awal > akhir) {
            return -1; 
        }

        int tengah = (awal + akhir) / 2;
        if (dataDosen[tengah].usia == cari) {
            return tengah;
        } else if (dataDosen[tengah].usia < cari) {
            return pencarianDataBinary24(cari, tengah + 1, akhir);
        } else {
            return pencarianDataBinary24(cari, awal, tengah - 1);
        }
    }

    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nama: " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Nama " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos) {
        if (pos != -1) {
            System.out.println("NIDN  : " + dataDosen[pos].nidn);
            System.out.println("Nama  : " + dataDosen[pos].nama);
            System.out.println("Usia  : " + dataDosen[pos].usia);
        } else {
            System.out.println("Data dosen dengan nama " + x + " tidak ditemukan");
        }
    }
}