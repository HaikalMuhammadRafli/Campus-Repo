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

        // perulangan untuk menghitung total nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            // jika rata-rata nilai mahasiswa lebih dari 70, maka mahasiswa dinyatakan lulus
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
                // jika sebaliknya, maka mahasiswa dinyatakan tidak lulus
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
            }
        }

        // menghitung rata-rata nilai mahasiswa
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);

        sc.close();
    }
}
