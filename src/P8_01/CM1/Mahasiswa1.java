public class Mahasiswa1 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa1 (String nim, String nama, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
    System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
