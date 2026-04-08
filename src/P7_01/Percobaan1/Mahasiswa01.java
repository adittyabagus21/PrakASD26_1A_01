public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa01() {
    }

    Mahasiswa01(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("nim\t: " + nim);
        System.out.println("nama\t: " + nama);
        System.out.println("kelas\t: " + kelas);
        System.out.println("ipk\t: " + ipk);
    }
}