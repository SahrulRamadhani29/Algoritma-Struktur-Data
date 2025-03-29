import java.util.Scanner;

import Dosen.dosen24;
public class dosenMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        input.nextLine();

        dataDosen24 data = new dataDosen24(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("NIDN      : ");
            String nidn = input.nextLine();
            System.out.print("Nama      : ");
            String nama = input.nextLine();
            System.out.print("Usia      : ");
            int usia = input.nextInt();
            input.nextLine();

            data.tambah(new dosen24(nidn, nama, usia));
        }
        System.out.println("\nData Dosen Sebelum Sorting:");
        data.tampil();

        data.sortBubble();
        System.out.println("\nData Dosen Setelah Sorting ASC (Termuda ke Tertua):");
        data.tampil();

        data.sortSelection();
        System.out.println("\nData Dosen Setelah Sorting DSC (Tertua ke Termuda):");
        data.tampil();
    }
}