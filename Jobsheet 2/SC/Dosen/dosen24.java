package Dosen;

public class dosen24 {

    String idDosen ;
    String Nama ;
    Boolean statusAktif ;
    int tahunGabung;
    String bidangKeahlian;
    public dosen24 () {
        
    }
    void tampikanInformasi () {
        
        System.out.println("---------------------------------");
        System.out.println("Id Dosen        :" +idDosen);
        System.out.println("Nama            :" + Nama);
        if (statusAktif == true) {
            System.out.println("Status Aktif    : Aktif");
        } else {
            System.out.println("Status Aktif    : Tidak Aktif");
        }
        System.out.println("tahun bergabung : " +tahunGabung);
        System.out.println("bidang keahlian :" + bidangKeahlian);
    }
    void setStatusAktif (Boolean status) {
        this.statusAktif = status; 
        if (status == true) {
            System.out.println("status aktif diubah menjadi : aktif");
        } else {
            System.out.println("status aktif telah diubah menjadi : tidak aktif");
        }
    }
    int hitungMasaKerja (int tahunSekarang) {
        int lamaKerja = tahunSekarang - tahunGabung;
        System.out.println("Lama Kerja : " + lamaKerja + " tahun");
        return lamaKerja;
    }
    public void ubahKeahlian (String Bidang) {
        this.bidangKeahlian = Bidang;
        System.out.println("bidang keahlian telah diubah menjadi : " + bidangKeahlian);
        
    } 
    public dosen24 (String idDosen, String Nama, boolean  statusAktif,int tahunGabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.Nama = Nama;
        this.statusAktif =statusAktif;
        this.tahunGabung = tahunGabung;
        this.bidangKeahlian=bidangKeahlian;
    }
}