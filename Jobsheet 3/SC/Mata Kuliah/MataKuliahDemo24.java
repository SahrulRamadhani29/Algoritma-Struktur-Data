import java.util.*;
public class MataKuliahDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jmlMatkul;
        System.out.print("Masukan Jumlah Mata Kuliah : ");
        jmlMatkul= input.nextInt();

        MataKuliah24 arrayOfMataKuliah24[] = new MataKuliah24[jmlMatkul];

        for (int i = 0; i < arrayOfMataKuliah24.length; i++){
            System.out.println("Masukan Data Mata Kuliah Ke-" + (i+1));
            arrayOfMataKuliah24[i] = new MataKuliah24();
            arrayOfMataKuliah24[i].tambahData(input);
        }

        for (int i = 0; i < arrayOfMataKuliah24.length; i++){
            System.out.println("Data Mata Kuliah Ke-" + (i+1));
            arrayOfMataKuliah24[i].cetakInfo();
        }
}
}