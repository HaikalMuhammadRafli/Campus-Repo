import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nilaiHuruf, keterangan;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = sc.nextInt();

        System.out.print("Masukkan Nilai Kuis : ");
        double nilaiKuis = sc.nextInt();

        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = sc.nextInt();

        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = sc.nextInt();

        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai Tugas tidak valid!");

        } else if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai Kuis tidak valid!");

        } else if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai UTS tidak valid!");

        } else if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai UAS tidak valid!");

        } else {

            double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";

            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";

            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";

            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";

            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";

            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";

            } else {
                nilaiHuruf = "E";

            }

            if (nilaiAkhir > 50) {
                keterangan = "SELAMAT ANDA LULUS";
            } else {
                keterangan = "MOHON MAAF ANDA TIDAK LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);

            System.out.println("==============================");
            System.out.println("==============================");

            System.out.println(keterangan);

            sc.close();
        }
    }
}
