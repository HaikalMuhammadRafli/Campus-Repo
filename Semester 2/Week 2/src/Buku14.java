
public class Buku14 {

    String judul, pengarang;
    int halaman, stok, harga;

    Buku14() {

    }

    Buku14(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual(int jml) {
        if (stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int jml) {
        int total = hitungHargaTotal(jml);
        if (total > 150000) {
            return total * 12 / 100;
        } else if (total >= 75000 && total <= 150000) {
            return total * 5 / 100;
        } else {
            return total;
        }
    }

    int hitungHargaBayar(int jml) {
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }
}
