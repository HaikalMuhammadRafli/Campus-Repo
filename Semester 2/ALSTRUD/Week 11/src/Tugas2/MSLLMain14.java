import java.util.Scanner;

public class MSLLMain14 {

    static void menu() {
        System.out.println("==========================");
        System.out.println("Layanan Unit Kemahasiswaan");
        System.out.println("==========================");
        System.out.println("[1] Tambahkan ke antrian");
        System.out.println("[2] Layani mahasiswa");
        System.out.println("[3] Tampilkan antrian");
        System.out.println("[4] Keluar");
    }

    public static void main(String[] args) {
        MahasiswaLinkedList14 mhsSLL = new MahasiswaLinkedList14();

        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            menu();
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("--------------");
                    System.out.println("Mahasiswa Baru");
                    System.out.println("--------------");
                    System.out.print("Masukkan NIM  : ");
                    int nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.println();
                    mhsSLL.enQueue(nim, nama);
                    break;

                case 2:
                    Mahasiswa14 temp = mhsSLL.deQueue();
                    if (temp != null) {
                        System.out.println("------------------");
                        System.out.println("Melayani Mahasiswa");
                        System.out.println("------------------");
                        System.out.println("NIM     : " + temp.nim);
                        System.out.println("Nama    : " + temp.nama);
                        System.out.println();
                    }
                    break;

                case 3:
                    mhsSLL.print();
                    break;

                default:
                    System.out.println("Pilihan tidak ada!");
                    break;
            }
        } while (pilihan != 4);

        sc.close();
    }
}
