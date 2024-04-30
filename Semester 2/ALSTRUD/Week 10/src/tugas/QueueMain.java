package tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("[1] Antrian baru");
        System.out.println("[2] Antrian keluar");
        System.out.println("[3] Cek Antrian terdepan");
        System.out.println("[4] Cek semua Antrian");
        System.out.println("[5] Cek Antrian paling belakang");
        System.out.println("[6] Cek posisi Antrian");
        System.out.println("[7] Lihat daftar pembeli");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        Queue antri = new Queue(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP : ");
                    int noHP = sc.nextInt();
                    sc.nextLine();
                    Pembeli nb = new Pembeli(nama, noHP);
                    antri.enQueue(nb);
                    break;

                case 2:
                    Pembeli data = antri.deQueue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Atrian yang keluar : " + data.nama + " " + data.noHP);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();
                    break;

                case 6:
                    System.out.print("Lihat posisi dari nama : ");
                    antri.peekPosition(sc.nextLine());
                    break;

                case 7:
                    antri.daftarPembeli();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);

        sc.close();
    }
}
