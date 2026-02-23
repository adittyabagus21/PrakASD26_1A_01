package P2_01;

public class MataKuliahMain01 {
    public static void main(String[] args) {

        MataKuliah01 mk1 =
                new MataKuliah01 ("RTI252008", "Algoritma dan Struktur Data", 3, 4);

        MataKuliah01 mk2 =
                new MataKuliah01 ("RTI252006", "Basis Data", 2, 4);

        System.out.println("=== DATA MATA KULIAH ===");
        mk1.tampilInformasi();
        mk2.tampilInformasi();

        System.out.println("=== PERUBAHAN DATA MK1 ===");
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println("=== PERUBAHAN DATA MK2 ===");
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);

        System.out.println("=== DATA SETELAH PERUBAHAN ===");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}
