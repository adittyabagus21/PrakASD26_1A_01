public class MainNilaiMahasiswa01 {
    public static void main(String[] args) {

        NilaiMahasiswa01[] data = {
            new NilaiMahasiswa01("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMahasiswa01("Budi", "220101002", 2022, 85, 88),
            new NilaiMahasiswa01("Cindy", "220101003", 2021, 90, 87),
            new NilaiMahasiswa01("Dian", "220101004", 2021, 76, 79),
            new NilaiMahasiswa01("Eko", "220101005", 2023, 92, 95),
            new NilaiMahasiswa01("Fajar", "220101006", 2020, 88, 85),
            new NilaiMahasiswa01("Gina", "220101007", 2023, 80, 83),
            new NilaiMahasiswa01("Hadi", "220101008", 2020, 82, 84)
        };

        System.out.println("==============================================================");
        System.out.printf("| %-6s | %-10s | %-12s | %-10s | %-10s |\n",
                "Nama", "NIM", "Tahun Masuk", "UTS", "UAS");
        System.out.println("==============================================================");

        for (NilaiMahasiswa01 m : data) {
            System.out.printf("| %-6s | %-10s | %-12d | %-10d | %-10d |\n",
                    m.nama, m.nim, m.tahunMasuk, m.uts, m.uas);
        }
        System.out.println("==============================================================");
        int max = NilaiMahasiswa01.maxUTS(data, 0, data.length - 1);
        int min = NilaiMahasiswa01.minUTS(data, 0, data.length - 1);
        double rata = NilaiMahasiswa01.rataUAS(data);
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Nilai UTS Tertinggi (Divide & Conquer): " + max);
        System.out.println("Nilai UTS Terendah (Divide & Conquer): " + min);
        System.out.println("Rata-rata Nilai UAS (Brute Force): " + rata);
    }
}