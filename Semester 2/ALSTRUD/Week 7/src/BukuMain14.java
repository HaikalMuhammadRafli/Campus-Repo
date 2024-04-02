import java.util.Scanner;

public class BukuMain14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PencarianBuku14 data = new PencarianBuku14();
        int jumBuku = 5;

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=======================================================");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = sc.nextLine();

            System.out.print("Judul Buku \t : ");
            String judulBuku = sc.nextLine();

            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = sc.nextInt();
            sc.nextLine();

            System.out.print("Pengarang \t : ");
            String pengarang = sc.nextLine();

            System.out.print("Stock \t \t : ");
            int stock = sc.nextInt();
            sc.nextLine();

            Buku14 b = new Buku14(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(b);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari : ");
        System.out.print("Kode Buku : ");
        int cari = sc.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        // Buku14 dataBuku = data.findBuku(cari);
        // dataBuku.tampilDataBuku();

        // Percobaan 2
        System.out.println("=========================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.findBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        // System.out.println("-------------------------------------------------------");
        // System.out.println("-------------------------------------------------------");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Judul Buku yang dicari : ");
        // System.out.print("Judul Buku : ");
        // String cari = sc.nextLine();
        // System.out.println("Menggunakan Sequential Search");
        // int posisi = data.findJudulSeqSearch(cari);
        // data.tampilPosisi(posisi);
        // data.tampilData(posisi);

        // System.out.println("=========================");
        // System.out.println("Menggunakan Binary Search");
        // posisi = data.findJudulBinarySearch(cari, 0, jumBuku - 1);
        // data.tampilPosisi(posisi);
        // data.tampilData(posisi);
        // data.tampil();

        sc.close();
    }
}
