import java.util.*;

class LaporanKeuanganMain {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        LaporanKeuangan arraylaporan [] = new LaporanKeuangan[5];
        double pendapatanlebih=0;
        int jum = 0;

        for (int i=0 ; i<5 ; i++) {
            arraylaporan[i] = new LaporanKeuangan();
            System.out.print("Nama Perusahaan = ");
            arraylaporan[i].namaPerusahaan = input.nextLine();
            System.out.print("Pendapatan Bulanan = ");
            arraylaporan[i].pendapatanBulanan = input.nextDouble();
            input.nextLine();
            System.out.println("Biaya Operasional = ");
            arraylaporan[i].biayaOperasional = input.nextDouble();
            input.nextLine(); 
        }

        for (int i=0 ; i<5 ; i++) {
        arraylaporan [i].hitungKeuntunganBul(arraylaporan);
        arraylaporan[i].printData();
        }
        
        double rataKeuntungan = 0;
        if (jum>0) {
            rataKeuntungan = pendapatanlebih/jum;
        System.out.println("Rata Keuntungan Dari Perusahaan Pendapatan Lebih dari 100000 =" + rataKeuntungan);
        }

    }

}