
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

    int sequentialSearch (double cari) {
        int posisi =-1;
        for (int j = 0; j <listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi= j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch (double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid-1);
            } else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi (double x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch (double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " +listMhs[pos].nim);
            System.out.println("nama\t : " +listMhs[pos].nama);            System.out.println("kelas\t : " +listMhs[pos].kelas);
            System.out.println("ipk\t : " +x);
        }
        else {
            System.out.println("Data mahasiswa dengan ipk" + x + " tidak ditemukan");
        }
    }



}