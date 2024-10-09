package io;

import core.Pinjaman;
import extension.PinjamanEfektif;

public class PembacaInput {

    private String[] args;
    private Pinjaman pinjaman;

    public PembacaInput(String[] args) {
        this.args = args;
    }

    public void Baca() {
        // Mencoba input dari console
        // 3 parameter: hutang, bunga, jumlah cicilan
        double hutang = 0;
        float bunga = 0;
        int jumlahCicilan = 0;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-h":
                    try {
                        hutang = Double.parseDouble(args[++i]);
                    } catch (NumberFormatException e) {
                        System.out.println("-h parameter is NaN!");
                    }
                    break;

                case "-b":
                    try {
                        bunga = Float.parseFloat(args[++i]);
                    } catch (NumberFormatException e) {
                        System.out.println("-b parameter is NaN!");
                    }
                    break;

                case "-jc":
                    try {
                        jumlahCicilan = Integer.parseInt(args[++i]);
                    } catch (NumberFormatException e) {
                        System.out.println("-jc parameter is NaN!");
                    }
                    break;
                default:
                    break;
            }
        }

        if (hutang <= 0 || bunga <= 0) {
            System.out.println("Parameter kurang kids!");
            System.exit(0);
        }

        System.out.println("Hutang         : " + hutang);
        System.out.println("Bunga          : " + bunga);
        System.out.println("Jumlah Cicilan : " + jumlahCicilan);

        // masukkan ke properti
//        this.pinjaman = new Pinjaman(hutang, bunga, jumlahCicilan);
        this.pinjaman = new PinjamanEfektif(hutang, bunga, jumlahCicilan);
    }

    public Pinjaman getPinjaman() {
        return pinjaman;
    }
}
