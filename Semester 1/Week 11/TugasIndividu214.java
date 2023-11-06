import java.util.Scanner;

public class TugasIndividu214 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // input jumlah baris dan kolom
        System.out.print("Masukkan nilai N (minimal 5) : ");
        int N = sc.nextInt();

        if (N >= 5) {
            // outer loop baris
            for (int i = 1; i <= N; i++) {
                // inner loop kolom (invert)
                for (int j = N; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();
        } else {
            System.out.println("error: Nilai N minimal 5");
        }

        sc.close();
    }
}
