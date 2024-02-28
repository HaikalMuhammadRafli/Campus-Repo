import java.util.Scanner;

public class Latihan1Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Kerucut : ");
        Kerucut kcArray[] = new Kerucut[sc.nextInt()];

        System.out.print("Masukkan jumlah Limas Segi Empat Sama Sisi : ");
        LimasSegiEmpat lseArray[] = new LimasSegiEmpat[sc.nextInt()];

        System.out.print("Masukkan jumlah kerucut : ");
        Bola blArray[] = new Bola[sc.nextInt()];

        if (kcArray.length <= 0 && lseArray.length <= 0 && blArray.length <= 0) {
            System.out.println("No shapes found!");
        }

        if (kcArray.length > 0) {
            for (int i = 0; i < kcArray.length; i++) {
                kcArray[i] = new Kerucut();
                System.out.println("\nKerucut ke " + i);
                System.out.print("Masukkan jari-jari : ");
                kcArray[i].jariJari = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan sisi miring : ");
                kcArray[i].sisiMiring = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tinggi : ");
                kcArray[i].tinggi = sc.nextInt();

                System.out.printf("Luas permukaan : %.2f\n", kcArray[i].getLuasPermukaan());
                System.out.printf("Volume : %.2f\n", kcArray[i].getVolume());
            }

        }

        if (lseArray.length > 0) {
            for (int i = 0; i < lseArray.length; i++) {
                lseArray[i] = new LimasSegiEmpat();
                System.out.println("\nLimas Segi Empat ke " + i);
                System.out.print("Masukkan panjang alas : ");
                lseArray[i].panjangAlas = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tinggi : ");
                lseArray[i].tinggi = sc.nextInt();
                sc.nextLine();

                System.out.printf("Luas permukaan : %.2f\n", lseArray[i].getLuasPermukaan());
                System.out.printf("Volume : %.2f\n", lseArray[i].getVolume());
            }
        }

        if (blArray.length > 0) {
            for (int i = 0; i < blArray.length; i++) {
                blArray[i] = new Bola();
                System.out.println("\nBola ke " + i);
                System.out.print("Masukkan jari-jari : ");
                blArray[i].jariJari = sc.nextInt();
                sc.nextLine();

                System.out.printf("Luas permukaan : %.2f\n", blArray[i].getLuasPermukaan());
                System.out.printf("Volume : %.2f\n", blArray[i].getVolume());
            }
        }

        sc.close();
    }
}
