import java.util.Scanner;

public class ArrayNilai14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // deklarasi array integer nilaiAkhir
        int[] nilaiAkhir = new int[10];

        // looping untuk menginput elemen array
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // looping untuk menampilkan elemen-elemen array
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }

        sc.close();
    }
}
