import java.util.Scanner;

public class forVar314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bil, n;
        boolean berhenti = false;

        // pengulangan akan berjalan sampai berhenti bernilai true
        for (n = 0; !berhenti; n++) {
            System.out.print("Masukkan bilangan : ");
            bil = sc.nextInt();
            System.out.println("Bilangan yang anda masukkan : " + bil);
            // jika n lebih besar dari bil maka akan mengubah value berhenti menjadi true
            if (bil < n) {
                berhenti = true;
                sc.close();
            }
        }

    }
}
