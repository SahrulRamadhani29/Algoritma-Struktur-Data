public class DataDosen24 {

    public void dataSemuaDosen(Dosen24[] arrayDosen) {
        System.out.println("\n===== Data Semua Dosen =====");
        for (int i = 0; i < arrayDosen.length; i++) {
            arrayDosen[i].tampilData();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen24[] arrayDosen) {
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].jenkel) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n===== Jumlah Dosen Berdasarkan Jenis Kelamin =====");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayDosen) {
        int totalUsiaPria = 0, jumlahPria = 0;
        int totalUsiaWanita = 0, jumlahWanita = 0;

        for (int i = 0; i < arrayDosen.length; i++) {
            if (arrayDosen[i].jenkel) {
                totalUsiaPria += arrayDosen[i].usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += arrayDosen[i].usia;
                jumlahWanita++;
            }
        }

        System.out.println("\n===== Rata-rata Usia Dosen =====");
        System.out.println("Pria   : " + (jumlahPria > 0 ? (totalUsiaPria / jumlahPria) : 0));
        System.out.println("Wanita : " + (jumlahWanita > 0 ? (totalUsiaWanita / jumlahWanita) : 0));
    }

    public void infoDosenPalingTua(Dosen24[] arrayDosen) {
        if (arrayDosen.length == 0) return;

        Dosen24 tertua = arrayDosen[0];
        for (int i = 1; i < arrayDosen.length; i++) {
            if (arrayDosen[i].usia > tertua.usia) {
                tertua = arrayDosen[i];
            }
        }
        System.out.println("\n===== Dosen Paling Tua =====");
        tertua.tampilData();
    }

    public void infoDosenPalingMuda(Dosen24[] arrayDosen) {
        if (arrayDosen.length == 0) return;

        Dosen24 termuda = arrayDosen[0];
        for (int i = 1; i < arrayDosen.length; i++) {
            if (arrayDosen[i].usia < termuda.usia) {
                termuda = arrayDosen[i];
            }
        }
        System.out.println("\n===== Dosen Paling Muda =====");
        termuda.tampilData();
    }
}
