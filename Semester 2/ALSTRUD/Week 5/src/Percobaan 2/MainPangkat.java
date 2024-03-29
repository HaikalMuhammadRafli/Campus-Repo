import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt();
        sc.nextLine();

        Pangkat png[] = new Pangkat[elemen];
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nilai pemangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("\nPilih Metode Perhitungan");
        System.out.println("------------------------");
        System.out.println("[1] BRUTE FORCE");
        System.out.println("[2] DIVIDE CONQUER");
        System.out.print("Pilihan anda : ");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBf(png[i].nilai, png[i].pangkat));
                }
                break;

            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDc(png[i].nilai, png[i].pangkat));
                }
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}
