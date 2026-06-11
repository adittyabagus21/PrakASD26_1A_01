package P15_01.Percobaan3;

public class Mahasiswa1 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa1() {
    }

    public Mahasiswa1(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa1{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
