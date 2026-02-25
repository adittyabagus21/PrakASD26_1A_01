import java.util.Scanner;

public class Pemilihan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        System.out.println("==============================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            return;
        }

        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;

        String huruf;

        if (nilaiAkhir > 80) {
            huruf = "A";
        } else if (nilaiAkhir > 73) {
            huruf = "B+";
        } else if (nilaiAkhir > 65) {
            huruf = "B";
        } else if (nilaiAkhir > 60) {
            huruf = "C+";
        } else if (nilaiAkhir > 50) {
            huruf = "C";
        } else if (nilaiAkhir > 39) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        System.out.println("nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf :" + huruf);

        System.out.println("==============================");

        if (huruf == "A" || huruf == "B+" ||
            huruf == "B" || huruf == "C+" ||
            huruf == "C") {

            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }

        System.out.println("==============================");
    }
}

