package P11_01.Percobaan1;

public class SLLMain1 {
   public static void main(String[] args) {
        SingleLinkedList1 sll = new SingleLinkedList1();

        Mahasiswa1 mhs1 = new Mahasiswa1("21212203", "Dirga", "4D", 3.6);
        Mahasiswa1 mhs2 = new Mahasiswa1("22212202", "Cintia", "3C", 3.5);
        Mahasiswa1 mhs3 = new Mahasiswa1("23212201", "Bimon", "2B", 3.8);
        Mahasiswa1 mhs4 = new Mahasiswa1("24212200", "Alvaro", "1A", 4.0); 

        sll.print(); 
        sll.addFirst(mhs1); 
        sll.print();
        sll.addLast(mhs4); 
        sll.print();
        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(1, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        
        sll.removeAt(0);
        sll.print();
    }
    
}
