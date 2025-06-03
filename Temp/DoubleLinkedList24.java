public class DoubleLinkedList24 {
    
    Node24 head;
    Node24 tail;

    public DoubleLinkedList24() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    } 

    public void addFirst(Mahasiswa24 data) {
        Node24 newNode = new Node24(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa24 data) {
        Node24 newNode = new Node24(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa24 data) {
        Node24 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node24 newNode = new Node24(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode; 
        }

        System.out.println("Node Berhasil disisipkan setelah NIM " + keyNim + ".");

        
    }

    public void print (){

        if (isEmpty()) {
            System.out.println("Warning: Data kosong, tidak ada mahasiswa yang tersimpan.");
            return;
        }
            Node24 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }

    public void removeFirst() {
        String nimDihapus = head.data.nim;
        if (isEmpty()) {
            System.out.println("Warning: Data kosong, tidak ada mahasiswa yang bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Mahasiswa dengan NIM " + nimDihapus + " berhasil dihapus.");
    }

    void removeLast() {
        String nimDihapus = tail.data.nim;
        if (isEmpty()) {
            System.out.println("Warning: Data kosong, tidak ada mahasiswa yang bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Mahasiswa dengan NIM " + nimDihapus + " berhasil dihapus.");
    }
}
