package P1_01;

public class Fungsi01 {

    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;

    public static int hitungPendapatan(int agl, int kel, int alo, int maw) {
        return (agl * hargaAglonema) +
               (kel * hargaKeladi) +
               (alo * hargaAlocasia) +
               (maw * hargaMawar);
    }

    public static void main(String[] args) {

        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},   
            {5, 7, 12, 9}   
        };

        for (int i = 0; i < stock.length; i++) {

            int pendapatan = hitungPendapatan(
                    stock[i][0],
                    stock[i][1],
                    stock[i][2],
                    stock[i][3]
            );

            String status;
            if (pendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan: Rp" + pendapatan);
            System.out.println("Status: " + status);
            System.out.println();
        }
    }
}
