package jobsheet9;

public class StackTugasMahasiswa {
    Mahasiswa08[] stack;
    int top;
    int size;

    public StackTugasMahasiswa(int size) {
        this.size = size;
        stack = new Mahasiswa08[size];
        top = -1;

    }
    
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa08 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
          System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi. ");
        }
    }

    public Mahasiswa08 pop() {
        if (!isEmpty()) {
            Mahasiswa08 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa08 peek () {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa08 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }

    public void print() {
        for (int i = top; i >= 0; i--) { 
            System.out.printf("%-8s%-8s%-8s\n", stack[i].nama, stack[i].nim, stack[i].kelas);
        }
        System.out.println("");
    }

    public String konversiDesimalkeBiner(int nilai) {
        StackKonversi08 stack = new StackKonversi08();
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
   
    
    

    // public void print() {
    //     for (int i = 0; i <= top; i++) {
    //         System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    //     }
    //     System.out.println("");
    // }
}
