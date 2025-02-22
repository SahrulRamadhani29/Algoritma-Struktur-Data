public class MataKuliahMain24 {

    public static void main(String[] args) {
        MataKuliah24 MK1 = new MataKuliah24();

        MK1.KodeMK = "MK001";
        MK1.nama="Algoritma Struktur Data";
        MK1.sks=3;
        MK1.jumlahJam=4;
        MK1.tampilkaninformasi();


        MK1.ubahSKS(2);
        MK1.tambahJam(2);
        MK1.kurangiJam(1);
        MK1.tampilkaninformasi();

        MataKuliah24 MK2 = new MataKuliah24 ("MK002", "Matematika", 3, 4);
        MK2.tambahJam(1);
        MK2.tampilkaninformasi();
        

    }
}