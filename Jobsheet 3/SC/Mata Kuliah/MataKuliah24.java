import java.util.*;
public class MataKuliah24 {

    Scanner input = new Scanner (System.in);
    public String kode, dummy, nama;
    public int sks, jumlahJam;

    public MataKuliah24(){

    }
    
    public MataKuliah24 (String kode, String nama, int sks, int jumlahJam) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
    }

    void tambahData (Scanner input) {
        System.out.print("Kode        = ");
        kode = input.nextLine();
        input.nextLine();
        System.out.print("Nama        = ");
        nama = input.nextLine();
        System.out.print("SKS         = ");
        dummy = input.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam  = ");
        dummy = input.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.print("--------------------------\n");
    }

    void cetakInfo () {
        System.out.println("Kode        = " + kode);
            System.out.println("nama        = " + nama);
            System.out.println("SKS         = " + sks);
            System.out.println("Jumlah Jam  = " + jumlahJam);
            System.out.println("--------------------------\n");
    }
}

