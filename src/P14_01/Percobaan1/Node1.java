package P14_01.Percobaan1;

public class Node1 {
    Mahasiswa1 mahasiswa;
    Node1 left, right;

    public Node1() {
    }

    public Node1(Mahasiswa1 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left  = right  = null;
    }
}
