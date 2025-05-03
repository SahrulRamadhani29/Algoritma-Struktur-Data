public class Dosen {
    String nidn;
    String namaDosen;

    public Dosen(String nidn, String namaDosen) {
        this.nidn = nidn;
        this.namaDosen = namaDosen;
    }

    public void tampilData() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + namaDosen);
        System.out.println();
    }
}
