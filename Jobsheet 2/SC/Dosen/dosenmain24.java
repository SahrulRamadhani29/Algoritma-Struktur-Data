package Dosen;

public class dosenmain24 {
    public static void main(String[] args) {
        dosen24 dos1 = new dosen24(); 
        dos1.Nama = "Ramdhan";
        dos1.idDosen = "DT04";
        dos1.bidangKeahlian = "Front End";
        dos1.statusAktif = false;
        dos1.tahunGabung = 2006;
        dos1.tampikanInformasi();

        dos1.setStatusAktif(true);
        dos1.ubahKeahlian("BackEnd");
        dos1.hitungMasaKerja(2025);
        dos1.tampikanInformasi();


        dosen24 dos2 = new dosen24("CT23", "Fatimah Azza", true, 2005, "UI UX");
        dos2.tampikanInformasi();

        dos2.ubahKeahlian("Basis Data");
        dos2.tampikanInformasi();
    }
}
