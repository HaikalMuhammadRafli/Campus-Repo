import java.util.Scanner;

public class IfKondisi14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu : ");
        int suhu = input.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket!");
        }

        if (suhu < 20) {
            System.out.println("Silahkan pakai baju tebal!");
        } else {
            System.out.println("Silahkan pakai topi!");
        }

        input.close();
    }
}