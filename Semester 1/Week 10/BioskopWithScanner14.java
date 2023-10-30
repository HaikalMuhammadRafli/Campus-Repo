import java.util.Scanner;

public class BioskopWithScanner14 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // deklarasi variable dan array
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom, choice;
        boolean exit = false;

        do {
            // menu
            System.out.println("\nSelamat datang di bioskop HKL");
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilihan anda: ");
            // input choice
            choice = sc.nextInt();
            sc.nextLine();

            // switch case berdasarkan choice
            switch (choice) {
                case 1:
                    // selama true maka akan mengulang
                    while (true) {

                        System.out.println("\nInput penonton!");
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
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                        } else {
                            System.out.println("Kursi tidak tersedia!");
                            continue;
                        }

                        // opsi untuk lanjut atau tidak
                        System.out.print("Input penonton lainnya? (y/t) : ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("t")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    // looping untuk mengoutputkan penonton di setiap row
                    System.out.println("\nDaftar penonton!");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out
                                .println("Penonton pada baris ke-" + (i + 1) + " : " + String.join(" ,", penonton[i]));
                    }
                    break;
                case 3:

                    // exit app
                    System.out.println("Goodbye user! ^-^");
                    exit = true;
                    sc.close();
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
        } while (exit != true);
    }
}
