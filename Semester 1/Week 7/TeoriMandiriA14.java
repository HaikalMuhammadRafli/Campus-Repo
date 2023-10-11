import java.util.Scanner;

public class TeoriMandiriA14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama;
        char jenisKelamin;

        // pengulangan akan diulang sampai variable i mencapai 30
        for (int i = 1; i <= 30; i++) {

            // kode yang akan diulang sebanyak 30 kali
            System.out.println();
            System.out.println("Nomer " + i);

            // input nama
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();

            // input jenis kelamin
            System.out.print("Masukkan jenis kelamin : ");
            jenisKelamin = sc.nextLine().charAt(0);

            // jika jenis kelaminnya p maka namanya akan di print out
            if (jenisKelamin == 'p' || jenisKelamin == 'P') {
                System.out.println(nama);
            }
        }

        System.out.println("Program berhenti");

        sc.close();
    }
}
