public class DataDosen01 {

    public void dataSemuaDosen(Dosen01[] arrayOfDosen) {
        for (Dosen01 d : arrayOfDosen) {
            d.tampilInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen01 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int pria = 0, wanita = 0;

        for (Dosen01 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                pria++;
            } else {
                totalWanita += d.usia;
                wanita++;
            }
        }

        if (pria > 0)
            System.out.println("Rata-rata usia Dosen Pria   : " + (totalPria / pria));
        if (wanita > 0)
            System.out.println("Rata-rata usia Dosen Wanita : " + (totalWanita / wanita));
    }

    public void infoDosenPalingTua(Dosen01[] arrayOfDosen) {
        Dosen01 tertua = arrayOfDosen[0];
        for (Dosen01 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.tampilInfo();
    }

    public void infoDosenPalingMuda(Dosen01[] arrayOfDosen) {
        Dosen01 termuda = arrayOfDosen[0];
        for (Dosen01 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.tampilInfo();
    }
}