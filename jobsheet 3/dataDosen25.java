public class dataDosen25 {
    void dataSemuaDosen (dosen25[] arrayOfDosen25) {
        for (dosen25 d : arrayOfDosen25) {
            d.tampil();
            System.out.println("---------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin (dosen25[] arrayOfDosen25) {
        int pria = 0;
        int wanita = 0;

        for (dosen25 d : arrayOfDosen25) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah dosen pria : " + pria);
        System.out.println("jumlah dosen wanita : " + wanita);
    }

    void rataUsiaDosenPerJenisKelamin(dosen25[] arrayOfDosen) {

        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }
        if (jmlPria > 0)
            System.out.println("Rata-rata usia dosen pria   : " 
                + (totalPria / jmlPria));

        if (jmlWanita > 0)
            System.out.println("Rata-rata usia dosen wanita : " 
                + (totalWanita / jmlWanita));
    }

    void infoDosenPalingTua(dosen25[] arrayOfDosen) {

        dosen25 tertua = arrayOfDosen[0];

        for (dosen25 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\nData Dosen Paling Tua");
        tertua.tampil();
    }

     void infoDosenPalingMuda(dosen25[] arrayOfDosen) {

        dosen25 termuda = arrayOfDosen[0];

        for (dosen25 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\nData Dosen Paling Muda");
        termuda.tampil();
    }

}
