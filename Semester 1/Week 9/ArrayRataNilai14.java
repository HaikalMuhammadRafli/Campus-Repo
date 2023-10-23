import java.util.Scanner;

public class ArrayRataNilai14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // deklarasi array dan variable
        int[] nilaiMhs = new int[10];
        double total = 0, rata2;

        // perulangan untuk input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // perulangan untuk menghitung total nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        // menghitung rata-rata nilai mahasiswa
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);

        sc.close();
    }
}
