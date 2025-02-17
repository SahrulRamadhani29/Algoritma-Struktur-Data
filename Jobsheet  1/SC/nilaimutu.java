import java.util.Scanner;

public class nilaimutu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();
      
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("\nnilai tidak valid");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            
            String nilaiHuruf;
            if (nilaiAkhir >= 80) nilaiHuruf = "A";
            else if (nilaiAkhir >= 73) nilaiHuruf = "B+";
            else if (nilaiAkhir >= 65) nilaiHuruf = "B";
            else if (nilaiAkhir >= 60) nilaiHuruf = "C+";
            else if (nilaiAkhir >= 50) nilaiHuruf = "C";
            else if (nilaiAkhir >= 39) nilaiHuruf = "D";
            else nilaiHuruf = "E";
            
            boolean lulus = nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C");
            
            System.out.println("\n========================");
            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("========================");
            
            if (lulus) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }

    }
}
