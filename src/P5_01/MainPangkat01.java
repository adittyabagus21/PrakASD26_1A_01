import java.util.Scanner;

public class MainPangkat01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat01[] png = new Pangkat01[elemen];

        for(int i = 0; i < elemen; i++){
            System.out.print("Masukan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat01(basis, pangkat);
        }


        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat01 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " 
                + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat01 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " 
                + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}