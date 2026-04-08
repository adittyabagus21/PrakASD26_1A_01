import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01();

        System.out.println("Masukkan Jumlah Data Mahasiswa");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        list.listMhs = new Mahasiswa01[jumMhs];

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);

            Mahasiswa01 m = new Mahasiswa01(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println("---------------------");
        }

        list.tampil();

        System.out.println("--------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------");
        System.out.print("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        String cr = sc.nextLine();
        double cari = Double.parseDouble(cr);

        System.out.println("menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        // melakukan pencarian data Binary
        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        String p =  sc.nextLine();
        double cari2 = Double.parseDouble(p);

        System.out.println("--------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------------------------");

        double posisi2  = list.findBinarySearch(cari2, 0, jumMhs -1);
        int pss2 = (int) posisi2;

        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);
    }
}