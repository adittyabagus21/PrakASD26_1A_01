public class Peminjaman1 {
    Mahasiswa1 mhs;
    Buku1 buku;
    int lamaPinjam;
    int denda;

    Peminjaman1(){

    }

    Peminjaman1(Mahasiswa1 mhs, Buku1 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }


    void hitungDenda() {
        int telat = lamaPinjam - 5;
        if (telat > 0) {
            denda = telat * 2000;
        } else {
            denda = 0;
        }
    }

    int hitungTerlambat() {
        if (lamaPinjam > 5) {
            return lamaPinjam - 5;
        } else {
            return 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println( mhs.nama + " | " + buku.judul + " | " + "Lama: " + lamaPinjam + " | " + "Terlambat: " + hitungTerlambat() + " | " + "Denda: " + denda );
    }


    void insertionSort(Peminjaman1[] listP) {
        for (int i = 1; i < listP.length; i++) {
            Peminjaman1 temp = listP[i];
            int j = i;
            while (j > 0 && listP[j - 1].denda < temp.denda) {
                listP[j] = listP[j - 1];
                j--;
            }
            listP[j] = temp;
        }
    }

    void sortNim(Peminjaman1[] p) {
        for (int i = 0; i < p.length; i++) {
            Peminjaman1 temp = p[i];
            int j = i;
            while (j> 0 && p[j-1].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                p[j] = p[j-1];
                j--;
            }
            p[j] = temp;
        }
    }

    int binarySearch(String key, Peminjaman1[] p){
        int l = 0;
        int r =  p.length -1;        
        while (l <= r) {
            int mid = (l + r) / 2;
            int compare = p[mid].mhs.nim.compareTo(key);
            if (compare == 0) {
                return mid;                
            } else if( compare < 0){
                l =  mid + 1;
            } else{
                r = mid -1;
            }
        }
        return -1;
    }
    
    
}
