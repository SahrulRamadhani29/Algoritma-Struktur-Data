import java.util.*;
public class LaporanKeuangan {
    public String namaPerusahaan;
    public Double pendapatanBulanan, biayaOperasional;
    public Double Keuntungan;
    public LaporanKeuangan (){

    }

    public LaporanKeuangan (String namaPerusahaan, Double pendapatanBulanan, Double biayaOperasional) {
        this.namaPerusahaan = namaPerusahaan;
        this.pendapatanBulanan = pendapatanBulanan;
        this.biayaOperasional = biayaOperasional;
    }

    void printData (){
        System.out.println("Nama Perusahaan = " + namaPerusahaan);
        System.out.println("Pendapatan Bulanan = " + pendapatanBulanan);
        System.out.println("Biaya Operasional = " + biayaOperasional);
        System.out.println("Keuntungan Bulanan = " + Keuntungan);
        
    }

    void hitungKeuntunganBul(LaporanKeuangan arraylaporan[]){
        for (LaporanKeuangan laporan : arraylaporan){
            int jum=0;
            if (pendapatanBulanan>100000) {
                Keuntungan = pendapatanBulanan - biayaOperasional; 
                jum++;
            }
        }
    }
}