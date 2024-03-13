import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        sc.nextLine();

        Sum sm = new Sum(elm);
        System.out.println("============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke- " + (i + 1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perubahan selama " + sm.elemen + " bulan adalah = "
                + sm.totalBF(sm.keuntungan));
        System.out.println("============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.printf("Total keuntungan perubahan selama %d bulan adalah = %.2f", sm.elemen,
                sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

        sc.close();
    }
}
