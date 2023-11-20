import java.util.Scanner;

public class UcapanTerimaKasih_14 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void UcapanTerimaKasih() {
        Scanner sc = new Scanner(System.in);
        String nama = PenerimaUcapan();
        System.out.print("Masukkan ucapan tambahan : ");
        String ucapan = sc.nextLine();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like i could ask you anything.");
        UcapanTambahan(ucapan);
        sc.close();
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }

}
