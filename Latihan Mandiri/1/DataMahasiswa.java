

// Kelas DataMahasiswa
public class DataMahasiswa {
    public static void dataSemuaMahasiswa(Mahasiswa[] arrayOfMahasiswa) {
        for (Mahasiswa mhs : arrayOfMahasiswa) {
            mhs.cetakData();
        }
    }

    public static void jumlahMahasiswaPerProdi(Mahasiswa[] arrayOfMahasiswa) {
        int sib = 0, ti = 0, mi = 0;
        for (Mahasiswa mhs : arrayOfMahasiswa) {
            if (mhs.programStudi.equalsIgnoreCase("SIB")) sib++;
            else if (mhs.programStudi.equalsIgnoreCase("TI")) ti++;
            else if (mhs.programStudi.equalsIgnoreCase("MI")) mi++;
        }
        System.out.println("Jumlah Mahasiswa SIB: " + sib);
        System.out.println("Jumlah Mahasiswa TI: " + ti);
        System.out.println("Jumlah Mahasiswa MI: " + mi);
    }

    public static void cariMahasiswaByProdi(Mahasiswa[] arrayOfMahasiswa, String programStudi) {
        for (Mahasiswa mhs : arrayOfMahasiswa) {
            if (mhs.programStudi.equalsIgnoreCase(programStudi)) {
                mhs.cetakData();
            }
        }
    }

    public static void ipkTertinggiPerProdi(Mahasiswa[] arrayOfMahasiswa) {
        float maxSIB = 0, maxTI = 0, maxMI = 0;
        Mahasiswa topSIB = null, topTI = null, topMI = null;

        for (Mahasiswa mhs : arrayOfMahasiswa) {
            if (mhs.programStudi.equalsIgnoreCase("SIB") && mhs.ipk > maxSIB) {
                maxSIB = mhs.ipk;
                topSIB = mhs;
            } else if (mhs.programStudi.equalsIgnoreCase("TI") && mhs.ipk > maxTI) {
                maxTI = mhs.ipk;
                topTI = mhs;
            } else if (mhs.programStudi.equalsIgnoreCase("MI") && mhs.ipk > maxMI) {
                maxMI = mhs.ipk;
                topMI = mhs;
            }
        }

        System.out.println("Mahasiswa dengan IPK tertinggi di SIB:");
        if (topSIB != null) topSIB.cetakData();
        System.out.println("Mahasiswa dengan IPK tertinggi di TI:");
        if (topTI != null) topTI.cetakData();
        System.out.println("Mahasiswa dengan IPK tertinggi di MI:");
        if (topMI != null) topMI.cetakData();
    }
}
