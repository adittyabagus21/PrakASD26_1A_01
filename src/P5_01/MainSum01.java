import java.util.Scanner;

public class MainSum01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen = input.nextInt();

        Sum01 sm = new Sum01(elemen);

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + i + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
    }
}