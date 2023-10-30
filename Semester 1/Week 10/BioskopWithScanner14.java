import java.util.Scanner;

public class BioskopWithScanner14 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // deklarasi variable dan array
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        // selama true maka akan mengulang
        while (true) {

            // input nama
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();

            // input baris
            System.out.print("Masukkan baris : ");
            baris = sc.nextInt();

            // input kolom
            System.out.print("Masukkan kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();

            // menyimpan nama di indeks baris dan kolom yang sudah ditentukan
            penonton[baris - 1][kolom - 1] = nama;

            // opsi untuk lanjut atau tidak
            System.out.print("Input penonton lainnya? (y/t) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("t")) {
                break;
            }
        }
        sc.close();
    }
}
