import java.util.Scanner;

public class Tugas02_01 {
    static Scanner s = new Scanner(System.in);
    static String[][] jadwal = new String[20][4];
    static int jumlahData = 0;

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== Sistem Jadwal Kuliah Mahasiswa ===");
            System.out.println("1. Input Data Jadwal Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Cari Jadwal berdasarkan Hari");
            System.out.println("4. Cari Jadwal berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = s.nextInt();
            s.nextLine();

            switch (pilihan) {
                case 1 -> inputJadwal();
                case 2 -> tampilkanSemua();
                case 3 -> cariHari();
                case 4 -> cariMatkul();
                case 5 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);
    }

    static void inputJadwal() {
        if (jumlahData >= 20) {
            System.out.println("Kapasitas penyimpanan penuh!");
            return;
        }

        System.out.println("\nData jadwal ke-" + jumlahData);

        System.out.print("Nama Mata Kuliah: ");
        jadwal[jumlahData][0] = s.nextLine();

        System.out.print("Ruang: ");
        jadwal[jumlahData][1] = s.nextLine();

        System.out.print("Hari: ");
        jadwal[jumlahData][2] = s.nextLine();

        System.out.print("Jam: ");
        jadwal[jumlahData][3] = s.nextLine();

        jumlahData++;
        System.out.println("Data jadwal berhasil disimpan.");
    }

    static void tampilkanSemua() {
        if (jumlahData == 0) {
            System.out.println("Belum ada jadwal.");
            return;
        }

        System.out.println("\n=== Semua Jadwal Kuliah ===");

        for (int i = 0; i < jumlahData; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("jadwal[" + i + "][" + j + "] = " + jadwal[i][j]);
            }
            System.out.println();
        }
    }

    static void cariHari() {
        if (jumlahData == 0) {
            System.out.println("Belum ada jadwal.");
            return;
        }

        System.out.print("Masukkan hari yang dicari: ");
        String hari = s.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("jadwal[" + i + "][" + j + "] = " + jadwal[i][j]);
                }
                System.out.println();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    static void cariMatkul() {
        if (jumlahData == 0) {
            System.out.println("Belum ada jadwal.");
            return;
        }

        System.out.print("Masukkan nama mata kuliah: ");
        String matkul = s.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("jadwal[" + i + "][" + j + "] = " + jadwal[i][j]);
                }
                System.out.println();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}