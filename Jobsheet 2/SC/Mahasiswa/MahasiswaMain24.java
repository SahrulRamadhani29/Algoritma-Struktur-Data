package Mahasiswa;

public class MahasiswaMain24 {
    public static void main(String[] args) {
        Mahasiswa24 mhs1 = new Mahasiswa24();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.5;

        mhs1.tampilkaninformasi();
        mhs1.ubahKelas("SI 2J");
        mhs1.updateIpk(3.6);
        mhs1.tampilkaninformasi();


        Mahasiswa24 mhs2 = new Mahasiswa24("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkaninformasi();

        Mahasiswa24 mhs3 = new Mahasiswa24("Sahrul Ramadhani", "244107020058", 3.64, "TI 1H");
        mhs3.tampilkaninformasi();
    }
}
