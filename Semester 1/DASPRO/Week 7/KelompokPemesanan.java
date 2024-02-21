import java.util.Scanner;

public class KelompokPemesanan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pesanan;
        char choice;
        int harga, total = 0;
        boolean session = true;

        do {
            // input nama masakan
            System.out.print("Input nama masakan : ");
            pesanan = sc.nextLine();

            // input harga masakan
            System.out.print("Input harga masakan : ");
            harga = sc.nextInt();
            sc.nextLine(); // untuk membersihkan newline di buffer

            // menambahkan total dengan harga
            total += harga;

            System.out.println();
            System.out.println("Pesanan 1");
            System.out.println(pesanan);
            System.out.println("Rp " + harga);

            // jika pesanan selesai bisa menghentikan program dengan choice 't'
            System.out.print("Tambah pesanan? (y/t) : ");
            choice = sc.nextLine().charAt(0);

            if (choice == 't' || choice == 'T') {
                // session akan diubah menjadi false dan program akan berakhir
                session = false;
            }

        } while (session != false);

        System.out.println();
        System.out.println("Total pesanan : Rp " + total);
        sc.close();
    }
}
