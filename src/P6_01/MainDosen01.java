import java.util.Scanner;

public class MainDosen01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen01 list = new DataDosen01();

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble)");
            System.out.println("4. Sorting DSC (Selection)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); // bersihkan enter

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();

                    System.out.print("Nama: ");
                    String nm = sc.nextLine();

                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();

                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen01 d = new Dosen01(kd, nm, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Berhasil sorting ASC (muda → tua)");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Berhasil sorting DSC (tua → muda)");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}