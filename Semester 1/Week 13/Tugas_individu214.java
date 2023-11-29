import java.util.Scanner;

public class Tugas_individu214 {

    static void InputNilai(String[][] array) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    System.out.print("Masukkan nama mahasiswa : ");
                    array[i][j] = sc.nextLine();
                } else {
                    System.out.print("Masukkan nilai pada minggu ke-" + j + " : ");
                    array[i][j] = sc.nextLine();
                }
            }
        }
        sc.close();
    }

    static void TampilNilai(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    System.out.print(array[i][j] + " : ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static void MingguTertinggi(String[][] array) {

        for (int i = 0; i < array.length; i++) {
            int nilaiTertinggi = 0, minggu = 0;

            for (int j = 0; j < array[i].length; j++) {
                if (j != 0) {
                    if (Integer.parseInt(array[i][j]) > nilaiTertinggi) {
                        nilaiTertinggi = Integer.parseInt(array[i][j]);
                        minggu = j;
                    }
                }
            }

            System.out.print("Mahasiswa " + array[i][0] + " di minggu ke-" + minggu + " : " + array[i][minggu]);
            System.out.println();
        }
    }

    static void NilaiTerbesar(String[][] array) {

        int nilaiTerbesar = 0, mhs = 0, minggu = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j != 0) {
                    if (Integer.parseInt(array[i][j]) > nilaiTerbesar) {
                        nilaiTerbesar = Integer.parseInt(array[i][j]);
                        mhs = i;
                        minggu = j;
                    }
                }
            }
        }

        System.out.println("Nilai terbesar dimiliki oleh " + array[mhs][0] + " di minggu ke- " + minggu + " : "
                + array[mhs][minggu]);
    }

    static void NilaiTerendah(String[][] array) {

        int nilaiTerendah = 100, mhs = 0, minggu = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j != 0) {
                    if (Integer.parseInt(array[i][j]) < nilaiTerendah) {
                        nilaiTerendah = Integer.parseInt(array[i][j]);
                        mhs = i;
                        minggu = j;
                    }
                }
            }
        }

        System.out.println("Nilai terendah dimiliki oleh " + array[mhs][0] + " di minggu ke- " + minggu + " : "
                + array[mhs][minggu]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nilaiMhs[][];
        int jmlMhs, jmlTugas;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah tugas : ");
        jmlTugas = sc.nextInt() + 1;
        nilaiMhs = new String[jmlMhs][jmlTugas];

        System.out.println("----- Input nilai Mahasiswa -----");
        InputNilai(nilaiMhs);
        System.out.println();

        System.out.println("----- Nilai Mahasiswa -----");
        TampilNilai(nilaiMhs);
        System.out.println();

        System.out.println("----- Minggu Tertinggi -----");
        MingguTertinggi(nilaiMhs);
        System.out.println();

        System.out.println("----- Nilai Terbesar -----");
        NilaiTerbesar(nilaiMhs);
        System.out.println();

        System.out.println("----- Nilai Terendah -----");
        NilaiTerendah(nilaiMhs);
        System.out.println();

        sc.close();
    }
}
