import java.util.Scanner;

public class Tugas_Login {

    public static void main(String[] args) {

        // deklarasi dan inisialisasi scanner, variable, dan array
        Scanner sc = new Scanner(System.in);

        String[][] users = { { "haikal", "123" }, { "irsyad", "456" }, { "esa", "789" } };
        String inputUS, inputPW;
        int id = 0;
        boolean access = false;

        // looping login
        do {

            // input user
            System.out.println("Silahkan Login!");
            System.out.print("Masukkan user : ");
            inputUS = sc.nextLine();

            // input password
            System.out.print("Masukkan password : ");
            inputPW = sc.nextLine();

            // looping search user dan password
            for (int i = 0; i < users.length; i++) {
                // jika true, maka id bernilai index dan access bernilai true
                if (inputUS.equals(users[i][0]) && inputPW.equals(users[i][1])) {
                    System.out.println();
                    System.out.println("Login berhasil!");
                    id = i;
                    access = true;
                    break;
                }
            }

            // jika belum berhasil login maka akan ditampilkan kode dibawah
            if (access != true) {
                System.out.println("Username dan Password salah!");
                System.out.println();
            }

            // jika access masuh bernilai not true, maka looping akan mengulang lagi
        } while (access != true);

        // output berhasil login
        System.out.println("Selamat datang " + users[id][0] + "!");
        sc.close();

    }
}
