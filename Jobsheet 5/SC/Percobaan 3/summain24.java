import java.util.*;
public class summain24 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen :");
    int elemen = input.nextInt();

    sum24 sm = new sum24 (elemen);
    for (int i = 0; i < elemen; i++) {
        System.out.print("Masukkan keuntungan ke-" + (i+1) + " : ");
        sm.keuntungan[i] = input.nextDouble();
    }

    System.out.println("total keuntungan menggunakan bruteforce : " +sm.totalBF());
    System.out.println("total keuntungan menggunakan devide and conquer  : " + sm.totalDC(sm.keuntungan, 0,elemen-1));
    }
}