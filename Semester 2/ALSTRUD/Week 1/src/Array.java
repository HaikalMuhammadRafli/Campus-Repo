import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahSKS = 0;
        double ips = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jml_matkul = sc.nextInt();
        sc.nextLine();

        System.out.println("------------------------------");

        String mataKuliah[][] = new String[jml_matkul][3];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan Nama Mata Kuliah : ");
            mataKuliah[i][0] = sc.nextLine();

            System.out.print("Masukkan Nilai Huruf (A,B+,B,C+,C,D,E) : ");
            mataKuliah[i][1] = sc.nextLine();

            System.out.print("Masukkan Bobot SKS : ");
            mataKuliah[i][2] = sc.nextLine();

            System.out.println();
        }

        System.out.println("=================================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================================================");
        System.out.printf("%-40s %-12s %-12s\n", "Mata Kuliah", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mataKuliah.length; i++) {
            jumlahSKS += Integer.parseInt(mataKuliah[i][2]);
        }

        for (String[] matkul : mataKuliah) {
            double nilaiSetara = matkul[1].equalsIgnoreCase("A") ? 4.0
                    : matkul[1].equalsIgnoreCase("B+") ? 3.5
                            : matkul[1].equalsIgnoreCase("B") ? 3.0
                                    : matkul[1].equalsIgnoreCase("C+") ? 2.5
                                            : matkul[1].equalsIgnoreCase("C") ? 2.0
                                                    : matkul[1].equalsIgnoreCase("D") ? 1.0 : 0;

            System.out.printf("%-40s %-12s %-12s\n", matkul[0], matkul[1], nilaiSetara);

            ips += (nilaiSetara * Integer.parseInt(matkul[2])) / jumlahSKS;
        }

        System.out.println("=================================================================");
        System.out.printf("IPS : %.2f\n", ips);

        sc.close();
    }
}
