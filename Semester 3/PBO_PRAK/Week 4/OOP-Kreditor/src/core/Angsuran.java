package core;

public class Angsuran {

    private int angsuranKe;
    private double jumlahBayar;
    private double sisaPinjaman;

    public Angsuran(int angsuranKe, double jumlahBayar, double sisaPinjaman) {
        this.angsuranKe = angsuranKe;
        this.jumlahBayar = jumlahBayar;
        this.sisaPinjaman = sisaPinjaman;
    }

    public int getAngsuranKe() {
        return angsuranKe;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public double getSisaPinjaman() {
        return sisaPinjaman;
    }
}
