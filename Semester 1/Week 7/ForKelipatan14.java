import java.util.Scanner;

/**
 * ForKelipatan14
 */
public class ForKelipatan14 {

    public static void main(String[] args) {

        Scanner input14 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1 - 9) : ");
        kelipatan = input14.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.printf("Banyakkan bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);

        input14.close();
    }
}