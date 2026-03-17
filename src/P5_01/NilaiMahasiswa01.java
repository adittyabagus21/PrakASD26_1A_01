public class NilaiMahasiswa01 {
    String nama;
    String nim;
    int tahunMasuk;
    int uts;
    int uas;

    public NilaiMahasiswa01(String nama, String nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    static int maxUTS(NilaiMahasiswa01[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].uts;
        }
        int mid = (l + r) / 2;
        int left = maxUTS(mhs, l, mid);
        int right = maxUTS(mhs, mid + 1, r);
        return Math.max(left, right);
    }

    static int minUTS(NilaiMahasiswa01[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].uts;
        }
        int mid = (l + r) / 2;
        int left = minUTS(mhs, l, mid);
        int right = minUTS(mhs, mid + 1, r);
        return Math.min(left, right);
    }

    static double rataUAS(NilaiMahasiswa01[] mhs) {
        int total = 0;
        for (NilaiMahasiswa01 m : mhs) {
            total += m.uas;
        }
        return (double) total / mhs.length;
    }
}