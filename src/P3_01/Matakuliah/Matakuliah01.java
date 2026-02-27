public class Matakuliah01 {
    public String kodeMK;
    public String namaMK;
    public String dosenPengampu;
    public int sks;

    void tambahData(String kode, String nama, String dosen, int jumlahSks) {
        kodeMK = kode;
        namaMK = nama;
        dosenPengampu = dosen;
        sks = jumlahSks;
    }

    void cetakInfo() {
        System.out.println("Kode MK        : " + kodeMK);
        System.out.println("Nama MK        : " + namaMK);
        System.out.println("Dosen Pengampu : " + dosenPengampu);
        System.out.println("SKS            : " + sks);
        System.out.println("---------------------------------------");
    }
}