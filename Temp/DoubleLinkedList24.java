public class DoubleLinkedList24 {
    
    node24 head;
    node24 tail;

    public DoubleLinkedList24() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    } 

    public void addFirst(mahasiswa24 data) {
        node24 newNode = new node24(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(mahasiswa24 data) {
        node24 newNode = new node24(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, mahasiswa24 data) {
        node24 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        node24 newNode = new node24(data);

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
            node24 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }

}
