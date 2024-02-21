import java.util.Scanner;

public class TugasIndividu314 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // input nilai N
        System.out.print("Masukkan nilai N (minimal 3) : ");
        int N = sc.nextInt();

        if (N >= 3) {
            // outer looping baris
            for (int i = 1; i <= N; i++) {
                // inner looping kolom
                for (int j = 1; j <= N; j++) {
                    // jika i baris pertama atau terakhir atau jika j baris pertama atau terakhirs
                    if ((i == 1 || i == N) || (j == 1 || j == N)) {
                        // maka akan dijalankan
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("error: Nilai N minimal 3");
        }

        sc.close();
    }
}
