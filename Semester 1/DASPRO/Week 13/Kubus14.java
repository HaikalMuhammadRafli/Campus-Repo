import java.util.Scanner;

public class Kubus14 {

    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int hitungLuasPermukaan(int sisi) {
        int lp = 6 * sisi * sisi;
        return lp;
    }

    static int hitungVolumeBalok(int panjang, int lebar, int tinggi) {
        return (panjang * lebar * tinggi);
    }

    static int hitungLuasPermukaanBalok(int panjang, int lebar, int tinggi) {
        return (2 * (panjang * lebar + panjang * tinggi + lebar * tinggi));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sisi, vol, lp, p, l, t, volB, lpB;

        System.out.print("Masukkan sisi kubus : ");
        sisi = sc.nextInt();

        vol = hitungVolume(sisi);
        System.out.println("Volume kubusnya adalah : " + vol);

        lp = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubusnya adalah : " + lp);

        System.out.print("Masukkan panjang balok : ");
        p = sc.nextInt();

        System.out.print("Masukkan lebar balok : ");
        l = sc.nextInt();

        System.out.print("Masukkan tinggi balok : ");
        t = sc.nextInt();

        volB = hitungVolumeBalok(p, l, t);
        System.out.println("Volume baloknya adalah : " + volB);

        lpB = hitungLuasPermukaanBalok(p, l, t);
        System.out.println("Luas permukaan baloknya adalah : " + lpB);

        sc.close();
    }
}
