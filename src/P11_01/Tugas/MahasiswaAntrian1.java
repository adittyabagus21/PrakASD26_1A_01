package P11_01.Tugas;

public class MahasiswaAntrian1 {
    String nim;
    String nama;
    String keperluan;

    public MahasiswaAntrian1(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void info() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Keperluan: " + keperluan);
    }
}
