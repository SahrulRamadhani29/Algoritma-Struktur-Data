public class SLLMain24 {
    public static void main(String[] args) {
        SingleLinkedList24 data = new SingleLinkedList24();

        Mahasiswa24 mhs1 = new Mahasiswa24("22001", "Dirga", "TI-1A", 3.5);
        Mahasiswa24 mhs2 = new Mahasiswa24("22002", "Cintia", "TI-1B", 3.7);
        Mahasiswa24 mhs3 = new Mahasiswa24("22003", "Bimon", "TI-1A", 3.8);
        Mahasiswa24 mhs4 = new Mahasiswa24("22004", "Alvaro", "TI-1C", 3.6);

        data.addLast(mhs1);
        data.addLast(mhs2);
        data.addLast(mhs3);
        data.addLast(mhs4);

        System.out.println("Data pada indeks ke-1:");
        Mahasiswa24 m = data.getData(1);
        if (m != null) m.tampilInformasi();

         System.out.println("Index dari Bimon ke-: " + data.indexOf("bimon"));
         System.out.println("----------------------------");

        data.removeFirst();
        data.removeLast();
        data.print();
        data.removeAt(0);
        data.print();
}
}