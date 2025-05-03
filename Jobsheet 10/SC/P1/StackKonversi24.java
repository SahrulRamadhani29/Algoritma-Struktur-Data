public class StackKonversi24 {
    int [] tumpukanBiner;
    int size;
    int top;

    public StackKonversi24(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }
    public void push(int data){
        if(!isFull()){
            top++;
            tumpukanBiner[top] = data;
        }else{
            System.out.println("Tumpukan sudah penuh!");
        }
    }

    public int pop(){
        if(!isEmpty()){
            return tumpukanBiner[top--];
        }else{
            System.out.println("Tumpukan sudah kosong!");
            return -1;
        }
    }

}
