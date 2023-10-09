import java.util.Scanner;

public class kasir_14 {

    public static void main(String[] args) {

        int total, diskon, bayar;
        String kartu;

        Scanner input14 = new Scanner(System.in);

        System.out.print("Apakah pelanggan mempunyai kartu anggota (y atau n)? : ");
        kartu = input14.nextLine();

        System.out.print("Berapa total harga barang belanjaan? Rp : ");
        total = input14.nextInt();

        if (kartu.equals("y")) {
            if (total > 500000) {
                diskon = 50000;
            } else {
                diskon = 25000;
            }
        } else {
            if (total > 200000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }

        bayar = total - diskon;
        System.out.println("Total yang harus dibayar : Rp " + bayar);

        input14.close();
    }
}
