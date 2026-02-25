public class MataKuliah01 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah01 () {
    }

    public MataKuliah01 (String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK   : " + kodeMK);
        System.out.println("Nama MK   : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
        System.out.println();
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam ditambahkan.");
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
        System.out.println();
    }

    void kurangiJam(int jam) {
        if (jam < jumlahJam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi.");
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan.");
        }
        System.out.println();
    }
}
