import Dosen.dosen24;

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

    void tampil () {
        System.out.println("\nData Dosen :");
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

    void sortSelection() { 
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            dosen24 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}