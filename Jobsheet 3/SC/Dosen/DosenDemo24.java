import java.util.*;
public class DosenDemo24 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        int jmlDsn;
        System.out.print("Masukan Jumlah Dosen : ");
        jmlDsn= input.nextInt();
        input.nextLine();

        Dosen24 [] arrayDosen = new Dosen24[jmlDsn];

        for (int i = 0 ; i < jmlDsn ; i++) {
            System.out.print("BIODATA DOSEN KE -" + (i+1) + "\n");
            arrayDosen[i] = new Dosen24();
            arrayDosen[i].tambahData();
    }
    
    System.out.println("Data Dosen yang di tambahkan : " + jmlDsn);
    System.out.println("=================================");

    DataDosen24 biodataDosen = new DataDosen24();
    biodataDosen.dataSemuaDosen(arrayDosen); // Menampilkan semua dosen
    biodataDosen.jumlahDosenPerJenisKelamin(arrayDosen); // Menampilkan jumlah dosen berdasarkan jenis kelamin
    biodataDosen.rerataUsiaDosenPerJenisKelamin(arrayDosen); // Menampilkan rata-rata usia
    biodataDosen.infoDosenPalingTua(arrayDosen); // Menampilkan dosen tertua
    biodataDosen.infoDosenPalingMuda(arrayDosen); // Menampilkan dosen termuda
    

}
}
