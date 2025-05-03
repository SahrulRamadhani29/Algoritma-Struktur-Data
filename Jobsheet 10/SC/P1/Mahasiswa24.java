public class Mahasiswa24 {
    String nama;
    String nim;
    String kelas;
    int nilai;
    
    public Mahasiswa24(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
}
}
