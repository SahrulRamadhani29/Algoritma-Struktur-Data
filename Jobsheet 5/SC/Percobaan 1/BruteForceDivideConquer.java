import java.util.*;

public class BruteForceDivideConquer {
    static class Faktorial {
        int faktorialBF(int n) {
            int fakto = 1;
            for (int i = 1; i <= n; i++) {
                fakto = fakto * i;
            }
            return fakto;
        }

        int faktorialDC(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * faktorialDC(n - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
