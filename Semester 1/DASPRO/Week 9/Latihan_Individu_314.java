import java.util.Scanner;

public class Latihan_Individu_314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember"
        };

        System.out.print("Masukkan angka untuk input bulan (1-12) : ");
        int choice = sc.nextInt();

        if (choice <= 12 && choice > 0) {
            System.out.println("Bulan" + bulan[choice - 1]);
        } else {
            System.out.println("Inputan salah!");
        }

        sc.close();
    }
}
