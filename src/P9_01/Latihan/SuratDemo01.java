import java.util.Scanner;

public class SuratDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat01 stack = new StackSurat01(5);
        int pilih;

        do {
            System.out.println("\nMenu Admin Prodi");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    stack.push(new Surat01(id, nama, kls, jenis, durasi));
                    break;

                case 2:
                    Surat01 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat milik: " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat01 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat teratas adalah milik: " + terakhir.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Terimakasih sudah menggunakan program!");
                    break;

                default:
                    System.out.println("Input tidak valid!");
                    break;
            }
        } while (pilih != 5);
    }
}