import java.util.Scanner;

public class BilPositif14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlah = 0, counter = 0, angka;
        float rata = 0;

        do {
            System.out.print("Masukkan integer positif (-1 untuk berhenti) : ");
            angka = sc.nextInt();
            // jika angka lebih besar sama dengan 0 maka akan menjumlahkan angka tersebut
            if (angka >= 0) {
                jumlah += angka;
                ++counter;
            }

        } while (angka != -1); // jika angka bernilai selain -1 maka pengulangan akan dijalankan

        rata = jumlah / counter;
        System.out.printf("Jumlah dari %d angka adalah %d\n", counter, jumlah);
        System.out.printf("Rata-rata dari %d angka adalah %.3f\n", counter, rata);

        sc.close();
    }
}
