import java.util.Scanner;

public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dummy;

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah01[] arrayOfMatakuliah = new Matakuliah01[jumlah];

        for (int i = 0; i < jumlah; i++) {
            arrayOfMatakuliah[i] = new Matakuliah01();

            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode MK : ");
            String kode = sc.nextLine();
            System.out.print("Nama MK : ");
            String nama = sc.nextLine();
            System.out.print("Dosen Pengampu : ");
            String dosen = sc.nextLine();
            System.out.print("SKS : ");
            dummy = sc.nextLine();
            int sks = Integer.parseInt(dummy);

            arrayOfMatakuliah[i].tambahData(kode, nama, dosen, sks);
            System.out.println("---------------------------------------");
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}