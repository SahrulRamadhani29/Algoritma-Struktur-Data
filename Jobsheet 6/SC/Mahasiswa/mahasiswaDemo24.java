import java.util.Scanner;

public class mahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = input24.nextInt();
        input24.nextLine(); 
        mahasiswaBerprestasi24 listMhs = new mahasiswaBerprestasi24(jml);

        for (int i = 0; i < jml; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = input24.nextLine();
            System.out.print("Nama  : ");
            String nama = input24.nextLine();
            System.out.print("Kelas : ");
            String kelas = input24.nextLine();
            System.out.print("IPK   : ");
            double ipk = input24.nextDouble();
            input24.nextLine(); 

            mahasiswa24 m = new mahasiswa24(nim, nama, kelas, ipk);
            listMhs.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        listMhs.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        listMhs.bubbleSort();
        listMhs.tampil();

        System.out.println("\nData yang sudah terurut menggunakan Selection Sort (ASC) :");
        listMhs.selectionSort();
        listMhs.tampil();

        System.out.println("\nData yang sudah terurut menggunakan Insertion Sort  ");
        listMhs.insertionSort();
        listMhs.tampil();
    }
}