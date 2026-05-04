public class StackSurat01 {

    Surat01[] stack;
    int top;
    int size;

    StackSurat01(int size) {
        this.size = size;
        stack = new Surat01[size];
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

    public void push(Surat01 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat01 pop() {
        if (!isEmpty()) {
            Surat01 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;

        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada stack ke-" + (top - i));
                System.out.println("ID: " + stack[i].idSurat + ", Jenis: " + stack[i].jenisIzin + ", Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat dengan nama: " + nama + " tidak ditemukan!");
        }
    }
}