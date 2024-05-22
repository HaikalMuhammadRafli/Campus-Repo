public class Tim14 {
    String nama;
    int pertandingan;
    int menang;
    int kalah;
    int poin;
    int selisih;
    String riwayat[][] = new String[26][4];

    Tim14(String nama, int pertandingan, int menang, int kalah, int poin, int selisih) {
        this.nama = nama;
        this.pertandingan = pertandingan;
        this.menang = menang;
        this.kalah = kalah;
        this.poin = poin;
        this.selisih = selisih;
    }

    void recordStats(int skorHome, int skorAway) {
        pertandingan++;

        if (skorHome > skorAway) {
            menang++;
            poin += 2;
        } else {
            kalah++;
            poin += 1;
        }

        selisih += (skorHome - skorAway);
    }

    void recordRiwayat(int skorHome, String timAway, int skorAway) {
        for (int i = 0; i < riwayat.length; i++) {
            if (riwayat[i][0] == null) {
                riwayat[i][0] = Integer.toString(skorHome);
                riwayat[i][1] = timAway;
                riwayat[i][2] = Integer.toString(skorAway);
                riwayat[i][3] = skorHome > skorAway ? "W" : "L";
                break;
            }
        }
    }
}
