public class BinaryTreeMain {
    public static void main(String[] args) {
        
        BinaryTree24 bst = new BinaryTree24();
        bst.add(new Mahasiswa24("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa24("244160221", "Budar", "B", 3.85));
        bst.add(new Mahasiswa24("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa24("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in-order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan IPK 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa24("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa24("244160224", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa24("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);
        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);

        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);


        bst.addRekursif(new Mahasiswa24("244160121", "Fatma", "A", 4.00));
        bst.addRekursif(new Mahasiswa24("244160221", "Azzahra", "B", 3.98));
        bst.addRekursif(new Mahasiswa24("244160185", "Sahrul", "C", 3.78));
        bst.addRekursif(new Mahasiswa24("244160220", "Rama", "B", 3.99));
        
        System.out.println("\nDaftar semua mahasiswa (in-order traversal):");
        bst.traverseInOrder(bst.root);

        // Menampilkan mahasiswa dengan IPK terkecil (soal 2)
        System.out.println("\nMahasiswa dengan IPK Terendah:");
        bst.cariMinIPK();

        // Menampilkan mahasiswa dengan IPK terbesar (soal 2)
        System.out.println("\nMahasiswa dengan IPK Tertinggi:");
        bst.cariMaxIPK();

        // Menampilkan mahasiswa dengan IPK di atas 3.50 (soal 3)
        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
    

}