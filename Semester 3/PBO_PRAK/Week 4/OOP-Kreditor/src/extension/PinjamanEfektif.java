package extension;

import core.Angsuran;
import core.Pinjaman;

public class PinjamanEfektif extends Pinjaman {

    public PinjamanEfektif(double hutang, float bunga, int jumlahCicilan) {
        super(hutang, bunga, jumlahCicilan);
    }

    @Override
    public void hitung() {
        double totalBayar = getHutang();
        double angsuranPokok = totalBayar / getJumlahCicilan();
        double sp = totalBayar;

        for (int i = 0; i < getJumlahCicilan(); i++) {
            // Angsuran Bunga
            double angsuranBunga = sp * (getBunga() / 100) * ((double) 30 / 360);

            // Total angsuran saat ini
            double jumlahBayar = angsuranPokok + angsuranBunga;

            // SP = Sisa Pinjaman periode sebelumnya
            if (i > 0)
                sp -= jumlahBayar;

            // Masukkan ke array daftarAngsuran
            Angsuran a = new Angsuran((i + 1), jumlahBayar, sp);

            // Masukkan ke array daftarAngsuran
            getDaftarAngsuran()[i] = a;
        }
    }
}
