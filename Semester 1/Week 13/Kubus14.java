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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sisi, vol, lp;

        System.out.print("Masukkan sisi kubus : ");
        sisi = sc.nextInt();

        vol = hitungVolume(sisi);
        System.out.println("Volume kubusnya adalah : " + vol);

        lp = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubusnya adalah : " + lp);

        sc.close();
    }
}
