import java.util.Scanner;

public class forVar214 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bil;
        boolean berhenti = false;
        for (; !berhenti;) {
            System.out.print("Masukkan bilangan : ");
            bil = sc.nextInt();
            System.out.println("Bilangan yang anda masukkan : " + bil);
            if (bil == 0) {
                berhenti = true;
                sc.close();
            }
        }
    }
}