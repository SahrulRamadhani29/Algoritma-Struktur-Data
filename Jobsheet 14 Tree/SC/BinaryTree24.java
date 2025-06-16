public class BinaryTree24 {
    Node24 root;    

    public BinaryTree24() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }
    public void add(Mahasiswa24 mahasiswa) {
        Node24 newNode = new Node24(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node24 current = root;
            Node24 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node24 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node24 node) {
        if (node != null) {
            node.mahasiswa.tampilkanInfromasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traverseInOrder(Node24 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilkanInfromasi();
            traverseInOrder(node.right);
        }
    }
    void traversePostOrder(Node24 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilkanInfromasi();
        }
    }
    Node24 getSuccessor (Node24 del) {
        Node24 successor = del.right;
        Node24 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete (double ipk) {
        if(isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //
        Node24 parent = root;
        Node24 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
            //penghapusan
            if (current == null) {
                System.out.println("Data  tidak ditemukan");
                return;
            } else {
                //jika tidak ada anak(leaf), maka node dihapus
                if (current.left == null && current.right == null) {
                    if (current == root) {
                        root = null;
                    } else {
                        if (isLeftChild) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    }
                } else if (current.right == null) { //jika hanya punya 1 anak kanan
                    if (current == root) {
                        root = current.right;
                    } else {
                        if (isLeftChild) {
                            parent.left = current.right;
                        } else {
                            parent.right = current.right;
                        }
                    }
                } else if (current.left == null) { //jika hanya punya 1 anak kiri
                    if (current == root) {
                        root = current.right;
                    } else {
                        if (isLeftChild) {
                            parent.left = current.left;
                        } else {
                            parent.right = current.left;
                        }
                    }
                } else { //jika punya 2 anak
                    Node24 successor = getSuccessor(current);
                    System.out.println("jika 2 anak, current = ");
                    successor.mahasiswa.tampilkanInfromasi();
                    if (current == root) {
                        root = successor;
                    }else {
                        if (isLeftChild) {
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                    }
                    successor.left = current.left;
                }
            }
        }
    } 

    public void addRekursif(Mahasiswa24 mhs) {
        if (root == null) {
            root = new Node24(mhs);
            return;
        }

        Node24 current = root;
        while (true) {
            if (mhs.ipk < current.mahasiswa.ipk) {
                if (current.left == null) {
                    current.left = new Node24(mhs);
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new Node24(mhs);
                    return;
                }
                current = current.right;
            }
        }
    } 

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }

        Node24 current = root;
        while (current.left != null) {
            current = current.left;
        }

        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilkanInfromasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }

        Node24 current = root;
        while (current.right != null) {
            current = current.right;
        }

        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilkanInfromasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    // Method rekursif yang sebenarnya
    public void tampilMahasiswaIPKdiAtas(Node24 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilkanInfromasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }


}