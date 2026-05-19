package P12_01.Percobaan1;

public class DoubleLinkedList1 {
    Node1 head;
    Node1 tail;

    public DoubleLinkedList1() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa1 data) {
        Node1 newNode = new Node1(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa1 data) {
        Node1 newNode = new Node1(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa1 data) {
        Node1 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node1 newNode = new Node1(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node1 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    
    public void removeFirst() {
        System.out.println("Belum diimplementasikan (lanjut di Percobaan 2)");
    }
    
    public void removeLast() {
        System.out.println("Belum diimplementasikan (lanjut di Percobaan 2)");
    }
}
