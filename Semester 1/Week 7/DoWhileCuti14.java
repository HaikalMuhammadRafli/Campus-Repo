import java.util.Scanner;

public class DoWhileCuti14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t) : ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    // dengan mengganti break dengan continue, user dapat mengisi ulang input sampai
                    // benar tanpa menghentikan program
                    continue;
                }

            } else if (konfirmasi.equalsIgnoreCase("t")) {
                // konfirmasi jika ingin keluar
                System.out.print("Apakah anda yakin untuk keluar? (y/t) : ");
                konfirmasi = sc.next();

                if (konfirmasi.equalsIgnoreCase("y")) { // jika y maka akan break dan loop akan berhenti
                    System.out.println("Selamat tinggal!");
                    break;
                } else if (konfirmasi.equalsIgnoreCase("t")) { // jika t maka continue dan loop akan memulai ulang
                    continue;
                }
            }
        } while (jatahCuti > 0);

        sc.close();
    }
}
