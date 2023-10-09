
/**
 * PemilihanPercobaan1_14
 */

import java.util.Scanner;

public class PemilihanPercobaan1_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        String hasil = angka % 2 == 0 ? "genap" : "ganjil";

        System.out.printf("Angka %d adalah bilangan %s !\n", angka, hasil);

        input.close();
    }
}