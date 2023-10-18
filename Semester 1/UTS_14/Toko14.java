import java.util.Scanner;

public class Toko14 {

    public static void main(String[] args) {

        Scanner input14 = new Scanner(System.in);

        boolean session = true;
        String nama, namaProduk, tipe = "Non-member";
        int jumlah, harga, diskon, totalJumlah = 0;
        char choice, member;
        double hargaAwal = 0, subtotal = 0, total = 0, totalDiskon = 0;

        System.out.println("Program Toko");
        System.out.print("Masukkan nama Anda : ");
        nama = input14.nextLine();

        while (session == true) {
            System.out.print("Masukkan produk yang dibeli : ");
            namaProduk = input14.nextLine();

            System.out.print("Banyaknya : ");
            jumlah = input14.nextInt();
            // total item pembelian
            totalJumlah += jumlah;

            System.out.print("Harga : ");
            harga = input14.nextInt();
            hargaAwal = harga * jumlah;
            // menghitung subtotal
            subtotal += hargaAwal;

            System.out.print("Diskon (%) : ");
            diskon = input14.nextInt();

            if (diskon > 0) {
                totalDiskon += hargaAwal * diskon / 100;
            }

            System.out.print("Apakah anda mau menambah barang (Y/N)? : ");
            choice = input14.next().charAt(0);
            input14.nextLine();

            // jika 'y' maka akan melanjutkan looping
            if (choice == 'Y' || choice == 'y') {

                continue;
                // jika tidak maka akan mengakhiri looping dan menghitung total
            } else if (choice == 'N' || choice == 'n') {

                System.out.print("Apakah anda punya kartu member? (Y/N)? : ");
                member = input14.next().charAt(0);

                if (member == 'Y' || member == 'y') {

                    if (subtotal >= 200000) {
                        totalDiskon += subtotal * 0.1;
                    } else {
                        totalDiskon += subtotal * 0.05;
                    }

                    tipe = "Member";
                }

                System.out.println(totalDiskon);

                total = subtotal - totalDiskon;

                session = false;
            }

            System.out.println("--------------- Total Pembelian ---------------");
            System.out.println("Nama pelanggan           : " + nama);
            System.out.printf("Tipe                     : %s\n", tipe);
            System.out.printf("Total item yang dibeli   : %d\n", totalJumlah);
            System.out.println("Subtotal                 = " + subtotal);
            System.out.println("Total diskon             = " + totalDiskon);
            System.out.println("Total                    = " + total);
            System.out.println("-------------------------------------------------");
            input14.close();

        }
    }
}