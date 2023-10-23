import java.util.Scanner;

public class ArrayRataNilai14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // deklarasi dan variable
        int countMhs, jumlahMhsLulus = 0, jumlahMhsGagal = 0;
        double totalLulus = 0, totalGagal = 0, rata2Lulus, rata2Gagal;

        System.out.print("Masukkan jumlah mahasiswa : ");
        countMhs = sc.nextInt();

        // deklarasi array dengan panjang sesuai dengan inputan
        int[] nilaiMhs = new int[countMhs];

        // perulangan untuk input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // perulangan untuk menghitung total nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            // jika rata-rata nilai mahasiswa lebih dari 70, maka mahasiswa dinyatakan lulus
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
                totalLulus += nilaiMhs[i];
                jumlahMhsLulus++;
                // jika sebaliknya, maka mahasiswa dinyatakan tidak lulus
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
                totalGagal += nilaiMhs[i];
                jumlahMhsGagal++;
            }
        }

        // menghitung rata-rata nilai mahasiswa lulus
        rata2Lulus = totalLulus / jumlahMhsLulus;
        // menghitung rata-rata nilai mahasiswa lulus
        rata2Gagal = totalGagal / jumlahMhsGagal;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2Gagal);

        sc.close();
    }
}
