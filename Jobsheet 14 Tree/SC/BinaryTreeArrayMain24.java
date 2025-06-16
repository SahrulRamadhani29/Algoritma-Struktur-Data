
public class BinaryTreeArrayMain24 {
    public static void main(String[] args) {
        BinaryTreeArray24 bta = new BinaryTreeArray24(); 

        Mahasiswa24 mhs1 = new Mahasiswa24("244160121", "Ali", "A", 3.57);
        Mahasiswa24 mhs2 = new Mahasiswa24("244160185", "Candra", "C", 3.41);
        Mahasiswa24 mhs3 = new Mahasiswa24("244160221", "Badr", "B", 3.75);
        Mahasiswa24 mhs4 = new Mahasiswa24("244160220", "Dewi", "A", 3.35);
        Mahasiswa24 mhs5 = new Mahasiswa24("244160131", "Dedi", "A", 3.48);
        Mahasiswa24 mhs6 = new Mahasiswa24("244160224", "Shan", "B", 3.66);
        Mahasiswa24 mhs7 = new Mahasiswa24("244160170", "Fizi", "B", 3.86);
        Mahasiswa24 mhs8 = new Mahasiswa24("244160200", "Gina", "C", 3.55);

        Mahasiswa24[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;

        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\nPre-order traversal:");
        bta.traversePreOrder(0);
    }
}