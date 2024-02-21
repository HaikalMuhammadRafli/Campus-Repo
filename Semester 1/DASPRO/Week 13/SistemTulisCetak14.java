import java.util.Scanner;

public class SistemTulisCetak14 {

    static String Tulis() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan tulisan anda : ");
        String tulisan = sc.nextLine();
        sc.close();
        return tulisan;
    }

    static void Cetak(String tulisan) {
        System.out.println(tulisan);
    }

    public static void main(String[] args) {
        Cetak(Tulis());
    }
}
