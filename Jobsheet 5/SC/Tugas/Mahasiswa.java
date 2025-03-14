class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Divide and Conquer untuk mencari nilai UTS tertinggi
    public static int cariMaxUTS(Mahasiswa[] data, int left, int right) {
        if (left == right) {
            return data[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int maxLeft = cariMaxUTS(data, left, mid);
        int maxRight = cariMaxUTS(data, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    // Divide and Conquer untuk mencari nilai UTS terendah
    public static int cariMinUTS(Mahasiswa[] data, int left, int right) {
        if (left == right) {
            return data[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int minLeft = cariMinUTS(data, left, mid);
        int minRight = cariMinUTS(data, mid + 1, right);
        return Math.min(minLeft, minRight);
    }

    // Brute Force untuk menghitung rata-rata nilai UAS
    public static double hitungRataRataUAS(Mahasiswa[] data) {
        int total = 0;
        for (Mahasiswa mhs : data) {
            total += mhs.nilaiUAS;
        }
        return (double) total / data.length;
    }
}
