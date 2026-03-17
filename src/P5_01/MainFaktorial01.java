import java.util.Scanner;

public class MainFaktorial01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial01 fk = new Faktorial01();

        System.out.println("Nilai Faktorial: " + nilai +
                " menggunakan BF: " + fk.FaktorialBF(nilai));

        System.out.println("Nilai Faktorial: " + nilai +
                " menggunakan DC: " + fk.FaktorialDC(nilai));
    }
}