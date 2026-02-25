public class DosenMain01 {
    public static void main(String[] args) {

        Dosen01 d1 = new Dosen01 ();
        d1.idDosen = "D001";
        d1.nama = "Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2018;
        d1.bidangKeahlian = "Algoritma";

        Dosen01 d2 = new Dosen01 ("D002", "Budi", false, 2015, "Basis Data");
        
        System.out.println("Data Dosen 1");
        d1.tampilInformasi();
        System.out.println("masaKerja      : " + d1.hitungMasaKerja(2026));
        System.out.println();

        System.out.println("Data Dosen 2");
        d2.tampilInformasi();
        System.out.println("masaKerja      : " + d2.hitungMasaKerja(2026));
        System.out.println();

        d2.setStatusAktif(true);
        d2.ubahKeahlian("Pemrograman");

        System.out.println("Data Dosen 2 Setelah Perubahan");
        d2.tampilInformasi();
    }
}
