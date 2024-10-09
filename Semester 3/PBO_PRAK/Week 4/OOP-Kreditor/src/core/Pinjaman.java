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
        // Hitung total bayar
        double totalBayar = this.hutang + (this.hutang * this.bunga / 100);

        // Hitung jumlah uang tiap angsuran
        double angsuran = totalBayar / this.jumlahCicilan;

        for (int i = 0; i < jumlahCicilan; i++) {
            int angsuranKe = i + 1;
            double jumlahBayar = angsuran;
            double sisaPinjaman = totalBayar - (jumlahBayar * angsuranKe);

            // Buat object angsuran
            Angsuran a = new Angsuran(angsuranKe, jumlahBayar, sisaPinjaman);

            // Masukkan object ke dalam array
            this.daftarAngsuran[i] = a;
        }
    }

    public Angsuran[] getDaftarAngsuran() {
        return this.daftarAngsuran;
    }
}
