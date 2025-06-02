import java.util.*;

public class DoubleLinkedListsMain {

    public static mahasiswa24 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new mahasiswa24(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedLists24 list = new DoubleLinkedLists24();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa:");
            System.out.println("1. Tambah dari awal");
            System.out.println("2. Tambah dari akhir");
            System.out.println("3. Tambah setelah index tertentu");
            System.out.println("4. Tambah setelah NIM tertentu");
            System.out.println("5. Hapus dari awal");
            System.out.println("6. Hapus dari akhir");
            System.out.println("7. Hapus setelah NIM tertentu");
            System.out.println("8. Hapus berdasarkan index tertentu");
            System.out.println("9. Tampilkan semua data");
            System.out.println("10. Tampilkan data pertama (head)");
            System.out.println("11. Tampilkan data terakhir (tail)");
            System.out.println("12. Tampilkan data berdasarkan index");
            System.out.println("13. Cari mahasiswa berdasarkan NIM");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("15. Keluar");
            System.out.print("Pilih menu (1-15): ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    mahasiswa24 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    mahasiswa24 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("Masukkan index: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    mahasiswa24 mhs = inputMahasiswa(scan);
                    list.add(idx, mhs);
                }
                case 4 -> {
                    System.out.print("Tambahkan setelah NIM: ");
                    String nimPatokan = scan.nextLine();
                    mahasiswa24 mhs = inputMahasiswa(scan);
                    list.insertAfter(nimPatokan, mhs);
                }
                case 5 -> list.removeFirst();
                case 6 -> list.removeLast();
                case 7 -> {
                    System.out.print("Masukkan NIM: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 8 -> {
                    System.out.print("Masukkan index: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.remove(idx);
                }
                case 9 -> list.print();
                case 10 -> {
                    mahasiswa24 mhs = list.getFirst();
                    if (mhs != null) {
                        System.out.println("Data Mahasiswa Pertama:");
                        mhs.tampil();
                    }
                }
                case 11 -> {
                    mahasiswa24 mhs = list.getLast();
                    if (mhs != null) {
                        System.out.println("Data Mahasiswa Terakhir:");
                        mhs.tampil();
                    }
                }
                case 12 -> {
                    System.out.print("Masukkan index: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    mahasiswa24 mhs = list.getIndex(idx);
                    if (mhs != null) {
                        System.out.println("Data pada index ke-" + idx + ":");
                        mhs.tampil();
                    }
                }
                case 13 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < list.getSize(); i++) {
                        mahasiswa24 mhs = list.getIndex(i);
                        if (mhs != null && mhs.nim.equalsIgnoreCase(nim)) {
                            System.out.println("Data ditemukan:");
                            mhs.tampil();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Data dengan NIM tersebut tidak ditemukan.");
                    }
                }
                case 14 -> System.out.println("Jumlah data dalam double linked list: " + list.getSize());
                case 15 -> System.out.println("Terima kasih, program selesai.");
                default -> System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

        } while (pilihan != 15);

        scan.close();
    }
}