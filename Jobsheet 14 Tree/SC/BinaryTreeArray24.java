public class BinaryTreeArray24 {
    Mahasiswa24[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray24() {
        this.dataMahasiswa = new Mahasiswa24[10];
    }

    void populateData(Mahasiswa24 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart < idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilkanInfromasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa24 data) {
        if (idxLast < dataMahasiswa.length) {
            dataMahasiswa[idxLast] = data;
            idxLast++;
        } else {
            System.out.println("Tree sudah penuh, tidak bisa menambah data.");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart < idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilkanInfromasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
