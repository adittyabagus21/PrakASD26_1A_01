import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Mahasiswa1[] mhs = new Mahasiswa1[3];
        mhs[0] = new Mahasiswa1("22001","Andi","Teknik Informatika");
        mhs[1] = new Mahasiswa1("22002","Budi","Teknik Informatika");
        mhs[2] = new Mahasiswa1("22003","Citra","Sistem Informasi Bisnis");
        Buku1[] bukus = new Buku1[4];
        bukus[0] = new Buku1("B001","Algoritma", "2020");
        bukus[1] = new Buku1("B002","Basis Data", "2019");
        bukus[2] = new Buku1("B003","Pemrograman", "2021");
        bukus[3] = new Buku1("B004","Fisika", "2024");
        Peminjaman1[] pinjam = new Peminjaman1[7];
        pinjam[0] = new Peminjaman1(mhs[0],bukus[0], 7);
        pinjam[1] = new Peminjaman1(mhs[1],bukus[1], 3);
        pinjam[2] = new Peminjaman1(mhs[2],bukus[2], 10);
        pinjam[3] = new Peminjaman1(mhs[2],bukus[3], 6);
        pinjam[4] = new Peminjaman1(mhs[0],bukus[1], 4);
        pinjam[5] = new Peminjaman1(mhs[0],bukus[0], 5);
        pinjam[6] = new Peminjaman1(mhs[1],bukus[1], 10);

        int pilih;
        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Cari berdasarkan nama");
            System.out.println("0. Keluar");
            System.out.println("Pilih: ");
            pilih = s.nextInt();
            s.nextLine();

            switch (pilih) {
                case 1 :
                    System.out.println("\nDaftar Mahasiswa: ");
                    for (int i = 0; i < mhs.length; i++) {
                    mhs[i].tampilMahasiswa();
                    }
                    break;
                case 2 :
                    System.out.println("\nDaftar Buku: ");
                    for (int i = 0; i < bukus.length; i++) {
                    bukus[i].tampilBuku1();
                    }
                    break;
                case 3 :
                    System.out.println("\nData Peminjaman :");
                    for (Peminjaman1 p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 4:
                    System.out.println("\nSetelah diurutkan (Denda Terbesar): ");
                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].hitungDenda();
                    }
                    Peminjaman1 p  = new Peminjaman1();
                    p.insertionSort(pinjam);
                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM: ");
                    String key = s.nextLine();
                    Peminjaman1 pm = new Peminjaman1();
                    pm.sortNim(pinjam);
                    int hasil = pm.binarySearch(key, pinjam);
                    if (hasil != -1) {
                        System.out.println("Data Ditemukan");
                        int i = hasil;
                        while (i >= 0 && pinjam[i].mhs.nim.equals(key)) {
                            pinjam[i].tampilPeminjaman();
                            i--;
                        }
                        i = hasil + 1;
                        while (i < pinjam.length && pinjam[i].mhs.nim.equals(key)) {
                            pinjam[i].tampilPeminjaman();
                            i++;
                        }
                    } else {
                        System.out.println("Tidak ditemukan");
                    }
                    break;
                case 6:
                    System.out.println("Masukkan Nama Mahasiswa");
                    String nama = s.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < pinjam.length; i++) {
                        if (pinjam[i].mhs.nama.equalsIgnoreCase(nama)) {
                            
                            System.out.println("Data ditemukan");
                            pinjam[i].tampilPeminjaman();

                            System.out.println("Masukkan Lama Pinjam baruu: ");
                            int lamaBaru = s.nextInt();
                            s.nextLine();

                            pinjam[i].lamaPinjam = lamaBaru;
                            pinjam[i].hitungDenda();
                            System.out.println("data berhasil diuodate");
                            pinjam[i].tampilPeminjaman();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("data tidak ditemukan!");
                    }
            }
        } while (pilih != 0);
    }
}