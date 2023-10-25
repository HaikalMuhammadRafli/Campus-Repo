import java.util.Scanner;

public class Latihan_Individu_414 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bil = new int[8];
        int total = 0, jumlah = 0;
        double rata2;

        for (int i = 0; i < 8; i++) {

            System.out.print("Masukkan bilangan ke-" + (i + 1) + "  : ");
            int inputBil = sc.nextInt();

            bil[i] = inputBil;
            total += bil[i];
            jumlah++;
        }

        rata2 = total / jumlah;
        System.out.println();
        System.out.println("Rata-rata bilangan : " + rata2);

        sc.close();
    }
}
