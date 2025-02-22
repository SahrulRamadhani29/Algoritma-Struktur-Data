package Mahasiswa;

public class Mahasiswa24 {
    String nama, nim, kelas;
    double ipk;
    
    public Mahasiswa24(){
    }
    public Mahasiswa24 (String nm, String nim, double ipk, String kls ){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    void tampilkaninformasi(){
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" +  nim);
        System.out.println("IPK :" + ipk);
        System.out.println("Kelas :" + kelas);
    }
    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk (double ipkBaru) {
        if (ipkBaru<0.0 || ipkBaru>4.0) {
            System.out.println( "IPK tidak Valid. Harus Masukan antara 0.0 dan 4.0");
        }else ipk = ipkBaru; {
        }
    }
    String nilaiKinerja (){
        if (ipk<0.0 || ipk>4.0) {
            return "IPK tidak Valid. Harus Masukan antara 0.0 dan 4.0";
        }else if (ipk>=3.0){
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk>=2.0) {
            return"Kinerja Cukup";
        }else {
            return"Kinerja Kurang";
        }
    }
}


