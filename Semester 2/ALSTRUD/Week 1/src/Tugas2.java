import java.util.Scanner;

public class Tugas2 {

    static Scanner sc = new Scanner(System.in);
    static double s, t, v;

    static void Menu() {
        System.out.println("[1] Hitung Kecepatan");
        System.out.println("[2] Hitung Jarak");
        System.out.println("[3] Hitung Waktu");
        System.out.print("Pilihan anda : ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.print("Masukkan jarak : ");
                s = sc.nextDouble();
                System.out.print("Masukkan waktu : ");
                t = sc.nextDouble();
                System.out.println("Kecepatan : " + HitungKecepatan(s, t));
                break;

            case 2:
                System.out.print("Masukkan kecepatan : ");
                v = sc.nextDouble();
                System.out.print("Masukkan waktu : ");
                t = sc.nextDouble();
                System.out.println("Jarak : " + HitungJarak(v, t));
                break;

            case 3:
                System.out.print("Masukkan jarak : ");
                s = sc.nextDouble();
                System.out.print("Masukkan kecepatan : ");
                v = sc.nextDouble();
                System.out.println("Waktu : " + HitungWaktu(s, v));
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    static double HitungKecepatan(double s, double t) {
        return v = s / t;
    }

    static double HitungJarak(double v, double t) {
        return s = v * t;
    }

    static double HitungWaktu(double s, double v) {
        return t = s / v;
    }

    public static void main(String[] args) {
        Menu();
    }
}
