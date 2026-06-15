public class Buku1 {
    String kodeBuku;
    String judul;
    String tahunTerbit;

    Buku1 (String kodeBuku, String judul, String tahunTerbit ){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku1() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}