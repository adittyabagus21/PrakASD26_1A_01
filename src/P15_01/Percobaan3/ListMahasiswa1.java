package P15_01.Percobaan3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa1 {
    List<Mahasiswa1> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa1... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa1 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public void sortAscending() {
        java.util.Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortDescending() {
        java.util.Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        Mahasiswa1 key = new Mahasiswa1(nim, "", "");
        return java.util.Collections.binarySearch(mahasiswas, key, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa1 lm = new ListMahasiswa1();
        Mahasiswa1 m = new Mahasiswa1("201234", "Noureen", "021xx1");
        Mahasiswa1 m1 = new Mahasiswa1("201235", "Akhleema", "021xx2");
        Mahasiswa1 m2 = new Mahasiswa1("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        System.out.println("");
        lm.update(lm.binarySearch("201235"), new Mahasiswa1("201235", "Akhleema Lela", "021xx2"));
        lm.tampil();
    }
}
