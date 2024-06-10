package percobaan_1;

import java.util.Scanner;

public class GraphMain14 {

    public static void main(String[] args) {

        Graph14 gedung = new Graph14(6);
        Scanner sc = new Scanner(System.in);
        int pilihan, asal, tujuan, jarak;

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        try {
            gedung.degree(0);
            gedung.printGraph();
            gedung.removeEdge(1, 3);
            gedung.printGraph();

        } catch (Exception e) {
            System.out.println(e);
        }

        // Latihan Praktikum

        do {
            System.out.println("==============================");
            System.out.println("[1] Add Edge");
            System.out.println("[2] Remove Edge");
            System.out.println("[3] Degree");
            System.out.println("[4] Print Graph");
            System.out.println("[5] Cek Edge");
            System.out.println("[6] Update Jarak");
            System.out.println("[7] Hitung Edge");
            System.out.println("[8] Keluar");
            System.out.println("==============================");
            System.out.print("> Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("> Masukkan asal : ");
                    asal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("> Masukkan tujuan : ");
                    tujuan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("> Masukkan jarak : ");
                    jarak = sc.nextInt();
                    sc.nextLine();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;

                case 2:
                    System.out.print("> Masukkan asal : ");
                    asal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("> Masukkan tujuan : ");
                    tujuan = sc.nextInt();
                    sc.nextLine();
                    gedung.removeEdge(asal, tujuan);
                    break;

                case 3:
                    System.out.print("> Masukkan asal : ");
                    asal = sc.nextInt();
                    sc.nextLine();
                    try {
                        gedung.degree(asal);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    try {
                        gedung.printGraph();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 5:
                    try {
                        System.out.print("> Masukkan asal : ");
                        asal = sc.nextInt();
                        sc.nextLine();
                        System.out.print("> Masukkan tujuan : ");
                        tujuan = sc.nextInt();
                        sc.nextLine();
                        gedung.checkEdge(asal, tujuan);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 6:
                    System.out.print("> Masukkan asal : ");
                    asal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("> Masukkan tujuan : ");
                    tujuan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("> Masukkan jarak : ");
                    jarak = sc.nextInt();
                    sc.nextLine();
                    try {
                        gedung.updateJarak(asal, tujuan, jarak);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 7:
                    try {
                        gedung.hitungEdge();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 8:
                    System.out.println("Goodbye ^-^");
                    break;

                default:
                    System.out.println("Pilihan tidak ditemukan!");
                    break;
            }
            System.out.println();
        } while (pilihan != 8);

        sc.close();
    }
}
