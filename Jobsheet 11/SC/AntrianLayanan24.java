    public class AntrianLayanan24 {
        Mahasiswa24[] data;
        int front;
        int rear;
        int size;
        int max;

        public AntrianLayanan24(int max) {
            this.max = max;
            this.data = new Mahasiswa24[max];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }

        public boolean isEmpty() {
            if (size == 0) {
                return true;
            }else {
                return false;
            }
        }

        public boolean isFull() {
            if(size == max) {
                return true;
            }else {
                return false;
            }
        }

        public void clear() {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }

        public void tambahAntrian(Mahasiswa24 mhs) {
            if (isFull()) {
                System.out.println("Antrian sudah penuh, tidak bisa menambah antrian baru");
                return;
            }
            rear = (rear + 1) % max;
                data[rear] = mhs;
                size++;
                System.out.println(mhs.nama + " telah ditambahkan ke antrian");
            }
        
        public Mahasiswa24 layaniMahasiswa24() {
            if (isEmpty()) {
                System.out.println("Antrian masih kosong");
            }
                Mahasiswa24 mhs = data[front];
                    front = (front + 1) % max;
                    size--;
                    return mhs;
        }
        
        public void lihatTerdepan() {
            if (!isEmpty()) {
                System.out.println("Antrian Kosonh:");
            } else {
                System.out.println("Mahasiswa terdepan:");
                System.out.println("NIM -  NAMA - PRODI - KELAS");
                data[front].tampilkanData();
            }
        }


        public void lihatAkhir() {
           if (isEmpty()) {
               System.out.println("Antrian Kosong");
            } else {
               System.out.println("Mahasiswa paling belakang:");
              data[rear].tampilkanData();
            }
        }
        
        public void tampilkanSemua() {
            if (isEmpty()) {
                System.out.println("Antrian masih kosong");
                return;
            } 
            System.out.println("Daftar Mahasiswa dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
            }
        

        public int getJumlahAntrian() {
            return size;
        }
    }


