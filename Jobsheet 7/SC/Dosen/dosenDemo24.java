import java.util.Scanner;

public class dosenDemo24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input24.nextInt();
        input24.nextLine(); 

        dataDosen24 data = new dataDosen24(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("NIDN      : ");
            String nidn = input24.nextLine();
            System.out.print("Nama      : ");
            String nama = input24.nextLine();
            System.out.print("Usia      : ");
            int usia = input24.nextInt();
            input24.nextLine();

            data.tambah(new dosen24(nidn, nama, usia));
        }

        data.tampil();
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data dengan Sequential Search");
        System.out.print("Masukkan Nama yang dicari: ");
        String cari = input24.nextLine();

        int posisi = data.pencarianDataSequential24(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilDataSearch(cari, posisi);

        System.out.println("---------------------------------");

        data.sortBubble(); 
        System.out.println("Pencarian Data dengan Binary Search");
        System.out.print("Masukkan Usia yang dicari: ");
        int cari2 = input24.nextInt();

        int posisi2 = data.pencarianDataBinary24(cari2, 0, jumlah - 1);
        data.tampilPosisi(String.valueOf(cari2), posisi2);
        data.tampilDataSearch(String.valueOf(cari2), posisi2);
    }
}