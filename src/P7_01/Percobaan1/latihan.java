case 6:
    System.out.print("Masukkan Nama Mahasiswa: ");
    String namaCari = s.nextLine();

    System.out.print("Masukkan Judul Buku: ");
    String judulCari = s.nextLine();

    boolean ditemukan = false;

    for (int i = 0; i < pinjam.length; i++) {
        if (pinjam[i].mhs.nama.equalsIgnoreCase(namaCari) &&
            pinjam[i].buku.judul.equalsIgnoreCase(judulCari)) {

            System.out.println("Data ditemukan:");
            pinjam[i].tampilPeminjaman();

            System.out.print("Masukkan lama pinjam baru: ");
            int lamaBaru = s.nextInt();
            s.nextLine();

            // update lama pinjam
            pinjam[i].lamaPinjam = lamaBaru;

            // hitung ulang denda
            pinjam[i].hitungDenda();

            System.out.println("Data berhasil diupdate!");
            pinjam[i].tampilPeminjaman();

            ditemukan = true;
        }
    }

    if (!ditemukan) {
        System.out.println("Data tidak ditemukan!");
    }
    break;