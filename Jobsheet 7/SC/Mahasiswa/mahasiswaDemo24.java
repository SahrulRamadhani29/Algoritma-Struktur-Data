import java.util.Scanner;

public class mahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlMhs = input24.nextInt();
        input24.nextLine();  

        mahasiswaBerprestasi24 listMhs = new mahasiswaBerprestasi24(jumlMhs); 

        for (int i = 0; i < jumlMhs; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = input24.nextLine();
            System.out.print("Nama  : ");
            String nama = input24.nextLine();
            System.out.print("Kelas : ");
            String kelas = input24.nextLine();
            System.out.print("IPK   : ");
            double ip = input24.nextDouble();
            input24.nextLine(); 
            System.out.println("---------------------------------");
            listMhs.tambah(new mahasiswa24(nim, nama, kelas, ip));
        }

        listMhs.tampil();
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data dengan Sequential Search");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = input24.nextDouble();

        int posisi = listMhs.sequentialSearch(cari);
        listMhs.tampilPosisi(cari, posisi);
        listMhs.tampilDataSearch(cari, posisi);

        System.out.println("---------------------------------");
        System.out.println("Pencarian Data dengan Binary Search");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari2 = input24.nextDouble();

        int posisi2 = listMhs.findBinarySearch(cari2, 0, jumlMhs - 1);
        listMhs.tampilPosisi(cari2, posisi2);
        listMhs.tampilDataSearch(cari2, posisi2);

        input24.close();
    }
}