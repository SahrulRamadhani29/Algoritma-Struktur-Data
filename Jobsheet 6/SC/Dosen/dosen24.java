public class dosen24 {
    String nidn;
    String nama;
    int usia;

    public dosen24(String nidn, String nama, int usia) {
        this.nidn = nidn;
        this.nama = nama;
        this.usia = usia;
    }

    public void tampil() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}