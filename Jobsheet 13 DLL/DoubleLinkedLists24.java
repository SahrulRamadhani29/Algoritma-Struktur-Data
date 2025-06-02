public class DoubleLinkedLists24 {
   node24 head, tail;
   
   public DoubleLinkedLists24(){
       head = null;
       tail = null;
   }

   public boolean isEmpty(){
       return head == null;
   }
    public void addFirst(mahasiswa24 data){
         node24 newNode = new node24(data);
         if (isEmpty()){
            head = tail = newNode;
         } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
         }
    }
    public void addLast(mahasiswa24 data){
         node24 newNode = new node24(data);
         if (isEmpty()){
            head = tail = newNode;
         } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
         }
    }

    public void insertAfter(String keyNim, mahasiswa24 data){
        node24 current = head;
        while (current != null && !current.data.nim.equalsIgnoreCase(keyNim)){
            current = current.next;
        }
        if (current == null){
            System.out.println("node dengan NIM  " + keyNim + " tidak ditemukan");
            return;
        }
        node24 newNode = new node24(data);
        if (current == tail){
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print() {
        if (head == null) {
            System.out.println("Warning: Data kosong, tidak ada mahasiswa yang tersimpan.");
            return;
        }

        node24 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    //percobaan 2

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        String nimTerhapus = head.data.nim;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah NIM: " + nimTerhapus);
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        String nimTerhapus = tail.data.nim;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah NIM: " + nimTerhapus);
    }



    //soal tugas 

    public void add(int index, mahasiswa24 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        node24 temp = head;
        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Indeks melebihi ukuran list"); 
            return;
        } else if (temp == tail) {
            addLast(data);
        } else {
            node24 newNode = new node24(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }
    public void removeAfter(String key) {
        node24 temp = head;

        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp.next == null) {
                    System.out.println("Tidak ada node setelah " + key);
                } else if (temp.next == tail) {
                    removeLast();
                } else {
                    node24 toDelete = temp.next;
                    temp.next = toDelete.next;
                    toDelete.next.prev = temp;
                }
                return;
            }
            temp = temp.next;
        }

        System.out.println("Data dengan NIM " + key + " tidak ditemukan");
    }

    public void remove(int index){
        if (isEmpty()) {
            System.out.println("Data tidak ada");
            return;
        }
        if (index < 0 || index >= getSize()) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            node24 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                System.out.println("Data di index " + index + " berhasil dihapus.");
            }
        }
    }
    public mahasiswa24 getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return null;
        }
        return head.data;
    }

    public mahasiswa24 getLast() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return null;
        }
        return tail.data;
    }

    public mahasiswa24 getIndex(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return null;
        }

        node24 temp = head;
        int i = 0;

        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Indeks melebihi panjang list");
            return null;
        }

        return temp.data;
    }   

    public int getSize() {
        int count = 0;
        node24 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    } 

}