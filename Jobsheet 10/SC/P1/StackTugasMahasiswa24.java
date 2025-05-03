public class StackTugasMahasiswa24 {
    Mahasiswa24 [] stack;
    int top;
    int size;

public StackTugasMahasiswa24(int size) {
    this.size = size;
    stack = new Mahasiswa24[size];
    top = -1;
}
public boolean isFull () {
    if (top == size - 1) {
        return true;
    } else {
        return false;
    }
}

public boolean isEmpty () {
    if (top == -1) {
        return true;
    } else {
        return false;
    }
}
    public void push (Mahasiswa24 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack sudah penuh!");
        }
    }

    public Mahasiswa24 pop () {
        if (!isEmpty()) {
            Mahasiswa24 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack sudah kosong!");
            return null;
        }
    }

    public Mahasiswa24 peek () {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack sudah kosong!");
            return null;
        }
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada tugas yang dikumpulkan.");
            return;
        }
        System.out.println("Nama\tNIM\tKelas\tNilai");
        for (int i = top; i >= 0; i--) {
            String nilaiStr = (stack[i].nilai == -1) ? "Belum Dinilai" : String.valueOf(stack[i].nilai);
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\t" + nilaiStr);
        }
        System.out.println();
    }
    
    public Mahasiswa24 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack masih kosong!");
            return null;
        }
    }
    
    public int jumlahTugas() {
        return top + 1;
    }
    
    public String konversiDesimalkeBiner (int nilai){
        StackKonversi24 stack = new StackKonversi24();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
    
}