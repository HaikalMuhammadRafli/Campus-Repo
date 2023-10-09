import java.util.Scanner;

public class PemilihanPercobaan2_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nilai uas : ");
        float uas = input.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi", nilaiHuruf = "null", kualifikasi = "null";
        double nilaiSetara = 0;

        if (80 < total && total <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat baik";

        } else if (73 < total && total <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari baik";

        } else if (65 < total && total <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";

        } else if (60 < total && total <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";

        } else if (50 < total && total <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";

        } else if (39 < total && total <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";

        } else if (total <= 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";

        }

        System.out.println();
        System.out.println("Laporan Nilai");
        System.out.printf("Nilai akhir = %f Sehingga %s\n", total, message);
        System.out.printf("Nilai huruf = %s\n", nilaiHuruf);
        System.out.printf("Nilai setara = %f\n", nilaiSetara);
        System.out.printf("Kualifikasi = %s\n", kualifikasi);

        input.close();
    }
}