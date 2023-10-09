import java.util.*;

public class TugasJobsheet3 {

    public static void main(String[] args) {

        double total = 0;
        double subTotal = 0;
        int hargaAyamBakar = 13000;
        int hargaAyamGoreng = 12000;
        int hargaEsTeh = 3000;
        int hargaKopi = 4000;
        int stokAyamBakar = 40;
        int stokAyamGoreng = 45;
        int stokEsTeh = 50;
        int stokKopi = 55;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Cafe The Orange Menu!");
            System.out.println("Pilih 1 untuk pesan Ayam Bakar (" + stokAyamBakar + ")");
            System.out.println("Pilih 2 untuk pesan Ayam Goreng (" + stokAyamGoreng + ")");
            System.out.println("Pilih 3 untuk pesan Es Teh (" + stokEsTeh + ")");
            System.out.println("Pilih 4 untuk pesan Kopi (" + stokKopi + ")");
            System.out.println("Pilih 5 untuk selesai");
            System.out.println("");
            System.out.println("Total : Rp " + total);
            System.out.println("");
            System.out.print("Pilihan : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Beli Berapa PCS (Ayam Bakar)?");
                    int jumlahAyamBakar = sc.nextInt();
                    subTotal = hargaAyamBakar * jumlahAyamBakar;
                    total = total + subTotal;
                    subTotal = 0;
                    stokAyamBakar = stokAyamBakar - jumlahAyamBakar;
                    break;

                case 2:
                    System.out.println("Beli Berapa PCS (Ayam Goreng)?");
                    int jumlahAyamGoreng = sc.nextInt();
                    subTotal = hargaAyamGoreng * jumlahAyamGoreng;
                    total = total + subTotal;
                    subTotal = 0;
                    stokAyamGoreng = stokAyamGoreng - jumlahAyamGoreng;
                    break;

                case 3:
                    System.out.println("Beli Berapa PCS (Es Teh)?");
                    int jumlahEsTeh = sc.nextInt();
                    subTotal = hargaEsTeh * jumlahEsTeh;
                    total = total + subTotal;
                    subTotal = 0;
                    stokEsTeh = stokEsTeh - jumlahEsTeh;
                    break;

                case 4:
                    System.out.println("Beli Berapa PCS (Kopi)?");
                    int jumlahKopi = sc.nextInt();
                    subTotal = hargaKopi * jumlahKopi;
                    total = total + subTotal;
                    subTotal = 0;
                    stokKopi = stokKopi - jumlahKopi;
                    break;

                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
                    sc.close();
            }
        }
    }
}
