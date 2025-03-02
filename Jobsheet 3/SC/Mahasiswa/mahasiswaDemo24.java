import java.util.Scanner;

class Mahasiswa24 {
    public String nim, nama, kelas;
    public float ipk;


  // Constructor 1: Tanpa parameter (Default Constructor)
  public Mahasiswa24() {
    this.nim = "000000";
    this.nama = "Unknown";
    this.kelas = "X";
    this.ipk = 0.0f;
}

// Constructor 2: Dengan parameter NIM dan Nama
public Mahasiswa24(String nim, String nama) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = "X"; // Default kelas
    this.ipk = 0.0f;  // Default IPK
}

// Constructor 3: Dengan parameter lengkap
public Mahasiswa24(String nim, String nama, String kelas, float ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
}


void cetakinfo () {
    System.out.println("\n===== Data Mahasiswa =====");
    System.out.println("NIM   = " + nim);
    System.out.println("Nama  = " + nama);
    System.out.println("Kelas = " + kelas);
    System.out.println("IPK   = " + ipk);
}
}


public class mahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa24[] arrayOfMahasiswa24 = new Mahasiswa24[3];

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa24[i] = new Mahasiswa24();

            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM   : ");
            arrayOfMahasiswa24[i].nim = input.nextLine();

            System.out.print("Masukkan Nama  : ");
            arrayOfMahasiswa24[i].nama = input.nextLine();

            System.out.print("Masukkan Kelas : ");
            arrayOfMahasiswa24[i].kelas = input.nextLine();

            System.out.print("Masukkan IPK   : ");
            arrayOfMahasiswa24[i].ipk = Float.parseFloat(input.nextLine());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            arrayOfMahasiswa24[i].cetakinfo();
        }

        input.close();
    }
}
