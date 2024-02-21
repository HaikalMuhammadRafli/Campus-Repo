import java.util.Scanner;

public class suhu_14 {

    public static void main(String[] args) {

        Scanner input14 = new Scanner(System.in);

        int suhu;
        char hujan;

        System.out.print("Masukkan suhu hari ini : ");
        suhu = input14.nextInt();

        System.out.print("Apakah hujan hari ini? (y atau n) : ");
        hujan = input14.next().charAt(0);

        if (suhu > 27) {
            System.out.println("Memakai dress!");

            if (hujan == 'y') {
                System.out.println("Membawa payung!");
            } else {
                System.out.println("Memakai sunscreen!");
            }

        } else {
            System.out.println("Memakai celana panjang!");
        }

        input14.close();
    }
}