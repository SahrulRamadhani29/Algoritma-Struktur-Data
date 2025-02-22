public class MataKuliah24 {
    String KodeMK;
    String nama;
    int sks;
    int jumlahJam ;

    
    public MataKuliah24() {

    }
    public  MataKuliah24 (String kodeMk, String nama, int sks,int jumlahJam) {
        this.KodeMK = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }

    void tampilkaninformasi () {
        System.out.println("-------------------------------");
        System.out.println("kode MK : " +KodeMK);
        System.out.println("Nama MK : " +nama);
        System.out.println("SKS : " +sks);
        System.out.println("jumlah jam : " + jumlahJam);

    }

    void ubahSKS (int sksBaru) {
        this.sks = sksBaru;
        System.out.println("Sks telah diubah menjadi : " +sks);

    }

    void tambahJam (int jam) {
        this.jumlahJam = jumlahJam+jam;
        System.out.println("jumlah jam telah ditambah menjadi : " + jumlahJam + " jam");

    }
    void kurangiJam (int jam ) {
        if (jam > jumlahJam) {
            System.out.println("pengurangan tidak dapat dilakukan. jumlah jam tidak mencukupi!");
        } else {
            this.jumlahJam = jumlahJam-jam;
            System.out.println("jumlah jam telah dikurangi menjadi :" + jumlahJam + " jam");
        }

    } 
   
}