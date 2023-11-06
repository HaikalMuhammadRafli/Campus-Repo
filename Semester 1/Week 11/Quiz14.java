import java.util.Random;
import java.util.Scanner;

public class Quiz14 {

    public static void main(String[] args) {

        // deklarasi random dan scanner
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // deklarasi dan inisialisasi variable menu
        char menu = 'y';

        // outer loop
        do {
            // deklarasi dan inisialisasi dengan menggunakan bilangan random + 1 agar tidak
            // mendapat bilangan 0 sebagai jawaban
            int number = random.nextInt(10) + 1;
            // deklarasi bool success
            boolean success = false;
            do {
                // input answer
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer < number) {
                    System.out.println("Tebakanmu lebih kecil daripada jawabannya!");
                } else if (answer > number) {
                    System.out.println("Tebakanmu lebih besar daripada jawabannya!");
                }

                // jika jawaban == number maka success akan bernilai true
                success = (answer == number);

                // jika belum true maka akan mengulang
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');

        input.close();
    }
}
