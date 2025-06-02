import Temp.Node24;

public class SingleLinkedList24 {
    Node24 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node24 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa24 input) {
    Node24 tmp = head;
    while (tmp != null && !tmp.data.nama.equals(key)) {
        tmp = tmp.next;
    }
    if (tmp != null) {
        Node24 ndInput = new Node24(input, tmp.next);
        tmp.next = ndInput;
        if (ndInput.next == null) {
            tail = ndInput;
        }
    }
}

    

    public void insertAt(int index, Mahasiswa24 input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node24 tmp = head;
            for (int i = 0; i < index - 1 && tmp != null; i++) {
                tmp = tmp.next;
            }
            if (tmp != null) {
                Node24 ndInput = new Node24(input, tmp.next);
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            }
        }
    }

    public Mahasiswa24 getData(int index) {
    Node24 tmp = head;
    for (int i = 0; i < index && tmp != null; i++) {
        tmp = tmp.next;
    }
    return tmp != null ? tmp.data : null;
}

public int indexOf(String nama) {
    Node24 tmp = head;
    int index = 0;
    while (tmp != null) {
        if (tmp.data.nama.equalsIgnoreCase(nama)) {
            return index;
        }
        tmp = tmp.next;
        index++;
    }
    return -1;
}

public void removeFirst() {
    if (!isEmpty()) {
        head = head.next;
        if (head == null) {
            tail = null;
        }
    } else {
        System.out.println("Linked list kosong!");
    }
}

public void removeLast() {
    if (!isEmpty()) {
        if (head == tail) {
            head = tail = null;
        } else {
            Node24 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    } else {
        System.out.println("Linked list kosong!");
    }
}

public void remove(String nama) {
    if (isEmpty()) {
        System.out.println("Linked list kosong!");
        return;
    }

    if (head.data.nama.equalsIgnoreCase(nama)) {
        removeFirst();
        return;
    }

    Node24 prev = head;
    Node24 curr = head.next;

    while (curr != null) {
        if (curr.data.nama.equalsIgnoreCase(nama)) {
            prev.next = curr.next;
            if (curr == tail) {
                tail = prev;
            }
            break;
        }
        prev = curr;
        curr = curr.next;
    }
}

public void removeAt(int index) {
    if (index == 0) {
        removeFirst();
    } else {
        Node24 prev = head;
        for (int i = 0; i < index - 1 && prev != null; i++) {
            prev = prev.next;
        }
        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
            if (prev.next == null) {
                tail = prev;
            }
        }
    }
}


}
