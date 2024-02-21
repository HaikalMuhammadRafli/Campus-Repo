import java.util.Scanner;

public class Latihan_114 {

    public static void main(String[] args) {

        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1 : ");
        int bil1 = input14.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        int bil2 = input14.nextInt();
        System.out.print("Masukkan bilangan 3 : ");
        int bil3 = input14.nextInt();

        if (bil1 > bil2) {

            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar : " + bil1);
            } else {
                System.out.println("Bilangan terbesar : " + bil3);
            }

        } else {

            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar : " + bil2);
            } else {
                System.out.println("Bilangan terbesar : " + bil3);
            }
        }

        input14.close();
    }
}