import java.util.Scanner;

public class KelompokLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin", password = "admin123", inputUsername, inputPassword;
        boolean token = false;

        while (token != true) {

            // input username
            System.out.print("Masukkan username : ");
            inputUsername = sc.nextLine();

            // input password
            System.out.print("Masukkan password : ");
            inputPassword = sc.nextLine();

            // validasi username dan password
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login sukses!");
                // jika berhasil, maka akan mengubah nilai token menjadi true dan loop akan
                // berakhir
                token = true;
            } else {
                // jika gagal, maka akan mengulang loop
                System.out.println("Username dan password salah!");
            }
        }

        sc.close();
    }
}
