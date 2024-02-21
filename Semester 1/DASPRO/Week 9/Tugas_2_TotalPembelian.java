import java.util.Scanner;

public class Tugas_2_TotalPembelian {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input jumlah item
        System.out.println("Selamat datang di Cafe The Orange!");
        System.out.print("Masukkan jumlah item yang dibeli: ");
        int jumlahItem = scanner.nextInt();

        // deklarasi dan iniliasi variable dan array
        double totalPembelian = 0;
        int[] hargaItem = new int[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];

        // looping input harga dan jumlah
        for (int i = 0; i < jumlahItem; i++) {
            System.out.print("Masukkan harga item ke-" + (i + 1) + " : ");
            hargaItem[i] = scanner.nextInt();

            System.out.print("Masukkan jumlah item ke-" + (i + 1) + " yang dibeli: ");
            jumlahBeli[i] = scanner.nextInt();
        }

        // looping perhitungan total
        for (int i = 0; i < jumlahItem; i++) {
            totalPembelian += hargaItem[i] * jumlahBeli[i];
        }

        // output total
        System.out.print("\nTotal Pembelian Anda: Rp" + totalPembelian);

        scanner.close();
    }
}
