import java.util.Scanner;

public class TeoriMandiriA14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama;
        char jenisKelamin;

        for (int i = 1; i <= 30; i++) {

            System.out.println();
            System.out.println("Nomer " + i);
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();

            System.out.print("Masukkan jenis kelamin : ");
            jenisKelamin = sc.nextLine().charAt(0);

            if (jenisKelamin == 'p' || jenisKelamin == 'P') {
                System.out.println(nama);
            }
        }

        System.out.println("Program berhenti");

        sc.close();
    }
}
