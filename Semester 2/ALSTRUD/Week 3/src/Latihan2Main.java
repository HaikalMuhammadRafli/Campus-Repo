import java.util.Scanner;

public class Latihan2Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa mahasiswa[] = new Mahasiswa[3];

        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new Mahasiswa();
            System.out.println("Mahasiswa ke " + i);
            System.out.print("Masukkan nama : ");
            mahasiswa[i].nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            mahasiswa[i].nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            mahasiswa[i].jenis_kelamin = sc.nextLine().toUpperCase().charAt(0);
            System.out.print("Masukkan IPK : ");
            mahasiswa[i].ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke " + i);
            System.out.println("Nama : " + mahasiswa[i].nama);
            System.out.println("NIM : " + mahasiswa[i].nim);
            System.out.println("Jenis kelamin : " + mahasiswa[i].jenis_kelamin);
            System.out.println("IPK : " + mahasiswa[i].ipk);
            System.out.println();
        }

        sc.close();
    }
}
