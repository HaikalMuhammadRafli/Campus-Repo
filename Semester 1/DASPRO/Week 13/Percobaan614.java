import java.util.Scanner;

public class Percobaan614 {

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);

        sc.close();
    }
}
