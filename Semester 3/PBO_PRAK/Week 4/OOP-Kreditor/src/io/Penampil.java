package io;

import core.Angsuran;

public class Penampil {

    private Angsuran[] daftarAngsuran;

    public Penampil(Angsuran[] daftarAngsuran) {
        this.daftarAngsuran = daftarAngsuran;
    }

    public void gambarHeaderTable() {
        System.out.println("+----------------------+----------------------+----------------------+");
        System.out.printf("| %20s | %20s | %20s |\n", "Angsuran Ke", "Jumlah Bayar", "Sisa Hutang");
        System.out.println("+----------------------+----------------------+----------------------+");
    }

    public void gambarBodyTable() {
        int space = 20;
        for (Angsuran a: this.daftarAngsuran) {
            System.out.println("| " + formatted(space, a.getAngsuranKe()) + " | " + formatted(space, a.getJumlahBayar()) + " | " + formatted(space, a.getSisaPinjaman()) + " |");
        }
    }

    public void gambarFooterTable() {
        System.out.println("+----------------------+----------------------+----------------------+");
    }

    private String formatted(int space, double num) {
        return String.format("%" + space + "s", num) ;
    }
}
