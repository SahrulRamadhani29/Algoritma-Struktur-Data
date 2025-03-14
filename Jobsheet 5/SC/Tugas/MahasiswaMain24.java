import java.util.*;
class MahasiswaMain24{
public static void main(String[] args) {
    Mahasiswa[] data = {
        new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
        new Mahasiswa("Budi", "220101002", 2022, 85, 88),
        new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
        new Mahasiswa("Dian", "220101004", 2021, 76, 79),
        new Mahasiswa("Eko", "220101005", 2023, 92, 95),
        new Mahasiswa("Fajar", "220101006", 2022, 88, 89),
        new Mahasiswa("Gina", "220101007", 2023, 80, 83),
        new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
    };

    int maxUTS = Mahasiswa.cariMaxUTS(data, 0, data.length - 1);
    int minUTS = Mahasiswa.cariMinUTS(data, 0, data.length - 1);
    double rataUAS = Mahasiswa.hitungRataRataUAS(data);

    System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);
    System.out.println("Nilai UTS terendah (Divide and Conquer): " + minUTS);
    System.out.println("Rata-rata nilai UAS (Brute Force): " + rataUAS);
}
}
