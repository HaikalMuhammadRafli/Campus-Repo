import java.util.Scanner;

public class HargaBayar14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int harga, jumlah, jumlahHal;
        double dis, total, bayar, jmlDis;
        String merk;

        System.out.println("Masukkan merk buku :");
        merk = sc.nextLine();
        System.out.println("Masukkan jumlah halaman buku :");
        jumlahHal = sc.nextInt();
        System.out.println("Masukkan harga barang yang dibeli :");
        harga = sc.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli :");
        jumlah = sc.nextInt();

        total = harga * jumlah;

        System.out.println("Masukkan diskon pembelian :");
        dis = sc.nextDouble();
        jmlDis = total * dis;

        bayar = total - jmlDis;

        System.out.println("Merk buku yang dibeli " + merk);
        System.out.println("Jumlah halaman buku " + jumlahHal);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

        sc.close();
    }
}