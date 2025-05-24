
public class QueueLinkedList24 {
    Node24 front, rear;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        // Queue berbasis linked list tidak memiliki batasan ukuran
        return false;
    }

    public void enqueue(Mahasiswa24 data) {
        Node24 baru = new Node24(data);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        Node24 tmp = front;
        while (tmp != null) {
            tmp.data.tampil();
            tmp = tmp.next;
        }
    }
}
