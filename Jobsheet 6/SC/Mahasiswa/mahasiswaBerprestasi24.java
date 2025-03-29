public class mahasiswaBerprestasi24 {
    mahasiswa24[] listMhs;
    int idx;

    public mahasiswaBerprestasi24(int jumlah) {
        listMhs = new mahasiswa24[jumlah];
        idx = 0;
    }

    void tambah(mahasiswa24 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil () {
        System.out.println("\nData Mahasiswa:");
        for (mahasiswa24 m : listMhs) {
            m.tampilkanInformasi();
            System.out.println("--------------------");
        }
    }
    void bubbleSort () {
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    mahasiswa24 temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }

    void selectionSort (){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            mahasiswa24 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) { 
            mahasiswa24 temp = listMhs[i];
            int j = i - 1;

            while (j >= 0 && listMhs[j].ipk < temp.ipk) { 
                listMhs[j + 1] = listMhs[j]; 
                j--;
            }
            listMhs[j + 1] = temp; 
        }
    }

}