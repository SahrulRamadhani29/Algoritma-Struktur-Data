public class node24 {
    mahasiswa24 data;
    node24 prev;
    node24 next;
    
    public node24(mahasiswa24 data){
        this.data = data;
        prev = null;
        next = null;
    }
    public node24(node24 prev, mahasiswa24 data, node24 next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}