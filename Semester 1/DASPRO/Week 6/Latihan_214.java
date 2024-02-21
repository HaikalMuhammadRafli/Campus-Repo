import java.util.Scanner;

public class Latihan_214 {

    public static void main(String[] args) {

        double total, totalDiskon = 0, subtotal;
        int harga, jumlahBuku;
        String jenisBuku;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input.nextLine();

        System.out.print("Masukkan harga : ");
        harga = input.nextInt();

        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = input.nextInt();

        subtotal = harga * jumlahBuku;

        if (jenisBuku.equalsIgnoreCase("kamus")) {

            if (jumlahBuku > 2) { // pemilihan bersarang : jika jenis bukunya kamus dan jumlahnya lebih dari 2,
                                  // maka akan mendapatkan diskon lebih 2%
                totalDiskon = subtotal * 0.12; // 10% + 2%
            } else {
                totalDiskon = subtotal * 0.1; // 10%
            }

        } else if (jenisBuku.equalsIgnoreCase("novel")) {

            if (jumlahBuku > 3) { // pemilihan bersarang : jika jenis bukunya novel dan jumlahnya lebih dari 3,
                                  // maka akan mendapatkan bonus diskon 2%
                totalDiskon = subtotal * 0.09; // 7% + 2%
            } else { // jika tidak, maka akan hanya mendapatkan bonus diskon 1%
                totalDiskon = subtotal * 0.08; // 7% + 1%
            }

        } else {

            if (jumlahBuku > 3) { // pemilihan bersarang : jika jumlahnya lebih dari 3,
                                  // maka akan mendapatkan diskon 5%
                totalDiskon = subtotal * 0.05; // 5%
            }
        }

        total = subtotal - totalDiskon;

        System.out.println();
        System.out.println("Detail Pembayaran");
        System.out.println("Harga awal : " + subtotal);
        System.out.println("Total Diskon : " + totalDiskon);
        System.out.println("Total harga : " + total);

        input.close();
    }
}
