// Kelas MahasiswaMain
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswaList = new Mahasiswa[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Program Studi (SIB/TI/MI): ");
            String programStudi = scanner.nextLine();
            System.out.print("Masukkan IPK: ");
            float ipk = scanner.nextFloat();
            scanner.nextLine();

            mahasiswaList[i] = new Mahasiswa(nim, nama, programStudi, ipk);
        }

        System.out.println("\nData Semua Mahasiswa:");
        DataMahasiswa.dataSemuaMahasiswa(mahasiswaList);
        
        System.out.println("\nJumlah Mahasiswa per Program Studi:");
        DataMahasiswa.jumlahMahasiswaPerProdi(mahasiswaList);
        
        System.out.print("\nMasukkan Program Studi yang ingin dicari: ");
        String cariProdi = scanner.nextLine();
        DataMahasiswa.cariMahasiswaByProdi(mahasiswaList, cariProdi);
        
        System.out.println("\nMahasiswa dengan IPK tertinggi di setiap Prodi:");
        DataMahasiswa.ipkTertinggiPerProdi(mahasiswaList);
        
        scanner.close();
    }
}
