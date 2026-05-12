package P11_01.Percobaan1;

import java.util.Scanner;

public class SLLMain1 {
    public static void main(String[] args) {
        SingleLinkedList1 sll = new SingleLinkedList1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: "); String nim = sc.nextLine();
        System.out.print("Masukkan Nama: "); String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: "); String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: "); double ipk = sc.nextDouble();

        Mahasiswa1 mhsBaru = new Mahasiswa1(nim, nama, kelas, ipk);
        sll.addLast(mhsBaru);

        Mahasiswa1 mhs1 = new Mahasiswa1("111", "Dirga", "1A", 3.8);
        Mahasiswa1 mhs2 = new Mahasiswa1("112", "Budi", "1B", 3.6);
        Mahasiswa1 mhs3 = new Mahasiswa1("113", "Tono", "1A", 3.5);
        Mahasiswa1 mhs4 = new Mahasiswa1("114", "Rudi", "1C", 3.9);

        sll.print(); 
        sll.addFirst(mhs1); 
        sll.print();
        sll.addLast(mhs4); 
        sll.print();
        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(1, mhs2); 
        sll.print();
    }
    
}
