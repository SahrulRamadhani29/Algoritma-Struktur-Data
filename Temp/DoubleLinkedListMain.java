import java.util.*;
import java.util.LinkedList;

public class DoubleLinkedListMain {

    public static Mahasiswa24 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        String ipk = scan.nextLine();
        
        return new Mahasiswa24(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        DoubleLinkedList24 list24 = new DoubleLinkedList24();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa di Awal");
            System.out.println("2. Tambah Data Mahasiswa di Akhir");
            System.out.println("3. Hapus Data Mahasiswa di awal");
            System.out.println("4. Hapus Data Mahasiswa di Akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Cari Data Mahasiswa Berdasarkan NIM");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    mahasiswa24 mhs = inputMahasiswa(scan);
                    list24.addFirst(mhs);
                }
                case 2 -> {
                    mahasiswa24 mhs = inputMahasiswa(scan);
                    list24.addLast(mhs);
                }
                /*case 3 -> {
                    list24.removeFirst();
                }
                case 4 -> {
                    list24.removeLast();
                }  */
                case 5 -> list24.print();;
                /*case 6 -> 
                Cari dengan NIM
              */
                case 0 -> System.out.println("Keluar dari Program.");
                default -> System.out.println("Pilihan Tidak Valid");
                }
                while ( Pilihan != 0); 
            }
}
}