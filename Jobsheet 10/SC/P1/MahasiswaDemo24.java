import java.util.Scanner;
public class MahasiswaDemo24 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa24 stack = new StackTugasMahasiswa24(5);


        do {
            System.out.println("Menu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama");
            System.out.println("6. Lihat Jumlah Tugas Terkumpul");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); // Clear the newline character

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s telah dikumpulkan.\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa24 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Masukkan nilai untuk " + dinilai.nama + ": ");
                        int nilai = input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Tugas %s telah dinilai dengan nilai %d.\n", dinilai.nama, dinilai.nilai);
                        String biner = stack.konversiDesimalkeBiner(dinilai.nilai);
                        System.out.println("Nilai dalam biner: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa24 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    stack.print();
                    break;
                case 5:
                     Mahasiswa24 terbawah = stack.bottom();
                    if (terbawah != null) {
                     System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                      }
                      break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.jumlahTugas());
                      break;
               default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
     }
}
