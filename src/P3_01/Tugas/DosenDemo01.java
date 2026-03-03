import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen01[] arrayOfDosen = new Dosen01[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            Boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen01(kode, nama, jenisKelamin, usia);
        }

        DataDosen01 data = new DataDosen01();

        System.out.println("\n=== DATA SEMUA DOSEN ===");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== RATA-RATA USIA DOSEN PER JENIS KELAMIN ===");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== DOSEN PALING TUA ===");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n=== DOSEN PALING MUDA ===");
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}