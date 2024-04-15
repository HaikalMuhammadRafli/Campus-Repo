import java.util.Scanner;

public class Utama14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.print("Masukkan kapasitas Gudang : ");
        Gudang14 gudang = new Gudang14(scanner.nextInt());

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("[1] Tambah barang");
            System.out.println("[2] Ambil barang");
            System.out.println("[3] Lihat barang teratas");
            System.out.println("[4] Lihat barang terbawah");
            System.out.println("[5] Cari barang");
            System.out.println("[6] Tampilkan tumpukan barang");
            System.out.println("[7] Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori barang : ");
                    String kategori = scanner.nextLine();
                    Barang14 barangBaru = new Barang14(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.lihatBarangTeratas();
                    break;

                case 4:
                    gudang.lihatBarangTerbawah();
                    break;

                case 5:
                    System.out.print("Masukkan kode atau nama barang : ");
                    gudang.cariBarang(scanner.nextLine());
                    break;

                case 6:
                    gudang.tampilkanBarang();
                    break;

                case 7:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                    break;
            }
        }
    }
}
