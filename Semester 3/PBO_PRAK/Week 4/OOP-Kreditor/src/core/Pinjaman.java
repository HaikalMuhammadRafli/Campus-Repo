package core;

public class Pinjaman {

    private double hutang;
    private float bunga;
    private int jumlahCicilan;
    private Angsuran[] daftarAngsuran;

    public Pinjaman(double hutang, float bunga, int jumlahCicilan) {
        this.hutang = hutang;
        this.bunga = bunga;
        this.jumlahCicilan = jumlahCicilan;

        this.daftarAngsuran = new Angsuran[(this.jumlahCicilan)];
    }

    public void hitung() {

    }

    public Angsuran[] getDaftarAngsuran() {
        return this.daftarAngsuran;
    }
}
