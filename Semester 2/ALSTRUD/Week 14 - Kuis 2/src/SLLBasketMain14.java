import java.util.Random;
import java.util.Scanner;

public class SLLBasketMain14 {

    static String TimLigaBasketIndonesia[] = {
            "Amartha Hangtuah Jakarta",
            "Bali United Basketball",
            "Bima Perkasa Jogja",
            "Borneo Hornbills",
            "Dewa United Banten",
            "Kesatria Bengawan Solo",
            "Pacific Caesar Surabaya",
            "Pelita Jaya Jakarta",
            "Prawira Harum Bandung",
            "Rajawali Medan",
            "RANS Simba Bogor",
            "Satria Muda Pertamina Jakarta",
            "Satya Wacana Salatiga",
            "Tangerang Hawks Basketball Club"
    };

    static SLLBasket14 SLLBasket = new SLLBasket14();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        for (String tim : TimLigaBasketIndonesia) {
            SLLBasket.addNewTeam(tim);
        }

        while (!exit) {
            System.out.println();
            System.out.println("=================================");
            System.out.println("       Program Klasemen IBL      ");
            System.out.println("=================================");
            System.out.println("[1] Daftar Tim Baru");
            System.out.println("[2] Catat Hasil Pertandingan");
            System.out.println("[3] Lihat Daftar Klasemen");
            System.out.println("[4] Lihat Riwayat Pertandinga Tim");
            System.out.println("[5] Auto Fill Pertandingan");
            System.out.println("[6] Keluar");

            System.out.print("Pilih menu : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("        Daftarkan Tim Baru       ");
                    System.out.println("=================================");
                    System.out.print("Masukkan nama tim : ");
                    String namaTim = sc.nextLine();
                    SLLBasket.addNewTeam(namaTim);
                    break;

                case 2:
                    System.out.println("=================================");
                    System.out.println("     Catat Hasil Pertandingan    ");
                    System.out.println("=================================");
                    System.out.print("Masukkan nama tim home : ");
                    String timHome = sc.nextLine();
                    System.out.print("Masukkan skor tim home : ");
                    int skorHome = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama tim away : ");
                    String timAway = sc.nextLine();
                    System.out.print("Masukkan skor tim away : ");
                    int skorAway = sc.nextInt();
                    SLLBasket.recordMatchResult(timHome, skorHome, timAway, skorAway);
                    break;

                case 3:
                    System.out.println();
                    SLLBasket.printKlasemen();
                    break;

                case 4:
                    System.out.println("=================================");
                    System.out.println("       Lihat Riwayat Tim IBL     ");
                    System.out.println("=================================");
                    System.out.print("Masukkan nama tim : ");
                    String key = sc.nextLine();
                    SLLBasket.printRiwayat(key);
                    break;

                case 5:
                    System.out.println("=================================");
                    System.out.println("       Autofill Pertandingan     ");
                    System.out.println("=================================");
                    autoFill();
                    break;

                case 6:
                    System.out.println("Goodbye! ^-^");
                    exit = true;
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia!");
                    break;
            }
        }

        sc.close();
    }

    // Pengisian otomatis ini menggunakan function random
    static void autoFill() {
        Random random = new Random();
        int min = 60, max = 100;

        for (int k = 1; k <= 2; k++) {
            for (int i = 0; i < TimLigaBasketIndonesia.length; i++) {
                for (int j = i + 1; j < TimLigaBasketIndonesia.length; j++) {
                    SLLBasket.recordMatchResult(TimLigaBasketIndonesia[i],
                            random.nextInt(max - min + 1) + min, TimLigaBasketIndonesia[j],
                            random.nextInt(max - min + 1) + min);
                }
            }
        }

        System.out.print("Matchmaking in progress");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Matchmaking complete!");
    }
}
