package P14_01.Percobaan1;

public class BinaryTreeArrayMain1 {
    public static void main(String[] args) {

        BinaryTreeArray1 bta = new BinaryTreeArray1();

        Mahasiswa1 mhs1 = new Mahasiswa1("244160121", "Ali",    "A", 3.57);
        Mahasiswa1 mhs2 = new Mahasiswa1("244160185", "Candra", "C", 3.41);
        Mahasiswa1 mhs3 = new Mahasiswa1("244160221", "Badar",  "B", 3.75);
        Mahasiswa1 mhs4 = new Mahasiswa1("244160220", "Dewi",   "B", 3.35);
        Mahasiswa1 mhs5 = new Mahasiswa1("244160131", "Devi",   "A", 3.48);
        Mahasiswa1 mhs6 = new Mahasiswa1("244160205", "Ehsan",  "D", 3.61);
        Mahasiswa1 mhs7 = new Mahasiswa1("244160170", "Fizi",   "B", 3.86);

        Mahasiswa1[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;

        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\n=== TUGAS 4: add() + traversePreOrder() ===");
        BinaryTreeArray1 btaAdd = new BinaryTreeArray1();

        btaAdd.add(new Mahasiswa1("244160121", "Ali",    "A", 3.57));
        btaAdd.add(new Mahasiswa1("244160221", "Badar",  "B", 3.85));
        btaAdd.add(new Mahasiswa1("244160185", "Candra", "C", 3.21));
        btaAdd.add(new Mahasiswa1("244160220", "Dewi",   "B", 3.54));
        btaAdd.add(new Mahasiswa1("244160131", "Devi",   "A", 3.72));
        btaAdd.add(new Mahasiswa1("244160205", "Ehsan",  "D", 3.37));
        btaAdd.add(new Mahasiswa1("244160170", "Fizi",   "B", 3.46));

        System.out.println("InOrder Traversal (setelah add):");
        btaAdd.traverseInOrder(0);

        System.out.println("\nPreOrder Traversal (setelah add):");
        btaAdd.traversePreOrder(0);
    }
}
