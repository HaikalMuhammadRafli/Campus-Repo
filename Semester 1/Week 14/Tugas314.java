import java.util.Scanner;

public class Tugas314 {

    static boolean CekPrimaRekursif(int n, int m) {
        if (m == 1) {
            return true;
        } else {
            if (n % m == 0) {
                return false;
            } else {
                return CekPrimaRekursif(n, m - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil;

        System.out.print("Masukkan bilangan yang ingin dicek : ");
        bil = sc.nextInt();

        System.out.println(CekPrimaRekursif(bil, bil - 1) == true ? "Bilangan Prima" : "Bukan Bilangan Prima");
        sc.close();
    }
}
