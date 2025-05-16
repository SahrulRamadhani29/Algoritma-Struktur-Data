public class QueueKRS {
    Mahasiswa24[] data;
    int front;
    int rear;
    int size;
    int max;
    int processedCount;
    final int MAX_PROCESSED = 30;

    public QueueKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa24[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.processedCount = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        processedCount = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void tambahAntrian(Mahasiswa24 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambahkan mahasiswa baru");
        } else if (processedCount >= MAX_PROCESSED) {
            System.out.println("Maksimal 30 mahasiswa telah diproses. Tidak dapat menambah antrian.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            processedCount++; // Mahasiswa yang masuk antrian langsung dihitung sebagai "diproses"
            System.out.println(mhs.nama + " telah ditambahkan ke antrian");
        }
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak dapat memproses KRS");
        } else {
            System.out.println("Mahasiswa yang diproses KRS:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa24 mhs = data[front];
                System.out.print((i + 1) + ". ");
                mhs.tampilkanData();
                front = (front + 1) % max;
                size--;
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size >= 2) {
            System.out.println("Dua mahasiswa terdepan:");
            for (int i = 0; i < 2; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        } else {
            System.out.println("Antrian kurang dari 2.");
        }
    }

    public void tampilkanAkhir() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling akhir:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void jumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah diproses KRS (termasuk yang sedang antri): " + processedCount);
    }

    public void jumlahBelumDiproses() {
        int belumDiproses = MAX_PROCESSED - processedCount;
        System.out.println("Jumlah mahasiswa yang belum diproses KRS: " + Math.max(belumDiproses, 0));
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam antrian:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }
}
