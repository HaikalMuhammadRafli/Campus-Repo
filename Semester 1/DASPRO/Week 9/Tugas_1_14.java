import java.util.Scanner;

public class Tugas_1_14 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // deklarasi variable
        int countNilai, temp, tertinggi = 0, terendah = 0, total = 0;
        double rata2 = 0;

        // input jumlah bilangan yang akan di masukkan
        System.out.print("Masukkan jumlah bilangan : ");
        countNilai = sc.nextInt();

        // deklarasi array
        int[] nilai = new int[countNilai];

        // perulangan input bilangan dan menghitung total
        for (int i = 0; i < nilai.length; i++) {

            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        // perulangan bubble sort
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 1; j < nilai.length - i; j++) {

                // swap nilai
                if (nilai[j - 1] < nilai[j]) {
                    temp = nilai[j];
                    // bilangan j diubah nilainya menjadi bilangan sebelumnya
                    nilai[j] = nilai[j - 1];
                    // bilangan sebelumnya diubah dengan bilangan yang disimpan di dalam temp
                    nilai[j - 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Hasil pengurutan : ");
        // perulangan untuk menampilkan isi array yang sudah di sortir
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        // memilih elemen pertama dari array yang sudah di sortir
        tertinggi = nilai[0];
        // memilih elemen terakhir dari array yang sudah di sortir
        terendah = nilai[nilai.length - 1];
        // menghitung rata-rata nilai bilangan
        rata2 = total / nilai.length;

        System.out.println();
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Rata-rata nilai : " + rata2);

        sc.close();
    }
}
