public class Mahasiswa24 {
    String nim;
    String nama;
    String Kelas;
    double ipk;

    public Mahasiswa24(){
    }
    public Mahasiswa24(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.Kelas = kelas;
        this.ipk = ipk;
    }
    
    public void tampilkanInfromasi() {
        System.out.println("NIM: " + this.nim + " " +
        "Nama : "+ this.nama + " " + 
        "Kelas : " + this.Kelas + " " +
        "IPK : " + this.ipk);
    }
}