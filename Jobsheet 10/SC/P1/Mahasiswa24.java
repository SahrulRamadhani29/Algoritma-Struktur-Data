public class mahasiswa24 {
    String nama;
    String nim;
    String kelas;
    int nilai;
    
    public mahasiswa24(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
}
}
