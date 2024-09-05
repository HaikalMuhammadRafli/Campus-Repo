//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Mencoba input dari console
        // 3 parameter: hutang, bunga, jumlah cicilan
        double hutang = 0;
        float bunga = 0;
        int jml_cicilan = 0;

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
                        jml_cicilan = Integer.parseInt(args[++i]);
                    } catch (NumberFormatException e) {
                        System.out.println("-jc parameter is NaN!");
                    }
                    break;

                default:
                    break;
            }
        }

        if (hutang <= 0 || bunga <= 0 || jml_cicilan <= 0) {
            System.out.println("Parameter kurang kids!");
            System.exit(0);
        }

        System.out.println("Hutang         : " + hutang);
        System.out.println("Bunga          : " + bunga);
        System.out.println("Jumlah Cicilan : " + jml_cicilan);

        // Hitung jumlah total hutang yang harus dibayar
        double totalBayar = hutang + (hutang * bunga / 100);
        System.out.println("--------------------------");
        System.out.println("Total Bayar    : " + totalBayar);

        // Nominal yang dibayarkan tiap kali angsuran
        double angsuran = totalBayar / jml_cicilan;

        // Cetak tabel angsuran
//        // Header
//        System.out.println("+----------------------+----------------------+----------------------+");
//        System.out.printf("| %20s | %20s | %20s |\n", "Angsuran Ke", "Jumlah Bayar", "Sisa Hutang");
//        System.out.println("+----------------------+----------------------+----------------------+");
//
//        // Body
//        for (int i = 1; i <= jml_cicilan ; i++) {
//            totalBayar -= angsuran;
//            System.out.printf("| %20s | %20s | %20s |\n", i, angsuran, totalBayar);
//        }
//
//        // Footer
//        System.out.println("+----------------------+----------------------+----------------------+");

        // Metode yang lebih menantang
        // Header
        System.out.println("+----------------------+----------------------+----------------------+");
        System.out.printf("| %20s | %20s | %20s |\n", "Angsuran Ke", "Jumlah Bayar", "Sisa Hutang");
        System.out.println("+----------------------+----------------------+----------------------+");

        // Body
        for (int i = 1; i <= jml_cicilan; i++) {
            totalBayar -= angsuran;
            System.out.println("| " + autoSpace(20, i) + " | " + autoSpace(20, angsuran) + " | " + autoSpace(20, totalBayar) + " |");
        }

        // Footer
        System.out.println("+----------------------+----------------------+----------------------+");
    }

    static String autoSpace(int space, double num) {
        String converted = "";
        for (int i = 1; i <= (space - Double.toString(num).length()); i++) {
            converted += " ";
        }
        converted += Double.toString(num);
        return converted;
    }
}