package Tugas.Vaksin;

import java.util.Scanner;

public class VaksinDLLMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VaksinDLL DLLVaksin = new VaksinDLL();
        int pilihan = -1;

        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("[1] Tambah ke antrian");
            System.out.println("[2] Layani pengantri vaksin");
            System.out.println("[3] Daftar penerima vaksin");
            System.out.println("[4] Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("> Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("> Nomor antrian : ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("> Nama penerima : ");
                    String nama = sc.nextLine();
                    DLLVaksin.enQueue(nomor, nama);
                    break;

                case 2:
                    try {

                        System.out.println("-----------------------------");
                        System.out.println(DLLVaksin.deQueue().nama + " telah selesai divaksinasi.");
                        System.out.println("-----------------------------");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++");
                    DLLVaksin.print();
                    break;

                case 4:
                    System.out.println("Goodbye :)");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }

        } while (pilihan != 4);

        sc.close();
    }
}
