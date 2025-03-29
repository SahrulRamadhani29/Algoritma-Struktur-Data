public class mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa24 () {

    }

    mahasiswa24 (String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk= ip;
    }

    void tampilkanInformasi () {
        System.out.println("Nama        : " + nama);
        System.out.println("Nim         : " + nim);
        System.out.println("Kelas       : " + kelas);
        System.out.println("Ipk         : " + ipk);
    }
}