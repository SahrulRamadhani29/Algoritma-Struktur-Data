// Kelas Mahasiswa
public class Mahasiswa {
    public String nim;
    public String nama;
    public String programStudi;
    public float ipk;

    public Mahasiswa(String nim, String nama, String programStudi, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
        this.ipk = ipk;
    }

    public void cetakData() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + programStudi + ", IPK: " + ipk);
    }
}

