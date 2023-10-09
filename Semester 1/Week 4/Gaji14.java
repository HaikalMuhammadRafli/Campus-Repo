import java.util.Scanner;

public class Gaji14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;

        System.out.println("Masukkan Gaji Anda :");
        gaji = sc.nextInt();

        System.out.println("Masukkan Potongan Gaji Anda :");
        potGaji = sc.nextInt();

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda :");
        jmlMasuk = sc.nextInt();

        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk = sc.nextInt();

        totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);

        System.out.println("Gaji yang anda terima adalah " + totGaji);

        sc.close();
    }
}