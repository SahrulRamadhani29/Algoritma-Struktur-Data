import java.util.Scanner;

// Class Surat24
class Surat24 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' atau 'I'
    int durasi; // durasi dalam hari

    public Surat24() {
    }

    public Surat24(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}

// Class StackSurat
class StackSurat {
    Surat24[] stack;
    int top;
    int size;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat24[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat24 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat dari " + surat.namaMahasiswa + " diterima.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat24 pop() {
        if (!isEmpty()) {
            Surat24 s = stack[top--];
            System.out.println("Memproses surat dari: " + s.namaMahasiswa);
            return s;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat24 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        System.out.println("===== Hasil Pencarian Surat =====");
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ditemukan = true;
                System.out.println("ID Surat     : " + stack[i].idSurat);
                System.out.println("Nama         : " + stack[i].namaMahasiswa);
                System.out.println("Kelas        : " + stack[i].kelas);
                System.out.println("Jenis Izin   : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi       : " + stack[i].durasi + " hari");
                System.out.println("-------------------------------");
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ditemukan surat atas nama: " + nama);
        }
    }
    
}

// Class utama
public class SuratDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat stack = new StackSurat(10);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.next().charAt(0); input.nextLine();
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = input.nextInt(); input.nextLine();
                    stack.push(new Surat24(id, nama, kelas, jenis, durasi));
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    Surat24 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("===== Surat Terakhir =====");
                        System.out.println("ID Surat     : " + terakhir.idSurat);
                        System.out.println("Nama         : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas        : " + terakhir.kelas);
                        System.out.println("Jenis Izin   : " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi       : " + terakhir.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = input.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
