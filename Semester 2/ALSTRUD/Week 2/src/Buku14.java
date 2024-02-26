
public class Buku14 {

    String judul, pengarang;
    int halaman, stok, harga, qty;

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
        qty = jml;
        if (stok >= qty) {
            stok -= qty;
            System.out.println("Total : Rp " + hitungHargaTotal());
            System.out.println("Total Diskon : Rp " + hitungDiskon());
            System.out.println("Bayar : Rp " + hitungHargaBayar());
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

    int hitungHargaTotal() {
        return harga * qty;
    }

    int hitungDiskon() {
        int diskon = hitungHargaTotal();
        if (diskon > 150000) {
            return diskon * 12 / 100;
        } else if (diskon >= 75000 && diskon <= 150000) {
            return diskon * 5 / 100;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}
