package Tugas.Film;

import java.util.Scanner;

public class FilmDLLMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FilmDLL filmDLL = new FilmDLL();
        int pilihan = -1;
        int id, index;
        String judul;
        double rating;

        do {
            System.out.println("=====================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=====================================");
            System.out.println("[1] Tambah data awal");
            System.out.println("[2] Tambah data akhir");
            System.out.println("[3] Tambah data index tertentu");
            System.out.println("[4] Hapus data pertama");
            System.out.println("[5] Hapus data terakhir");
            System.out.println("[6] Hapus data tertentu");
            System.out.println("[7] Cetak");
            System.out.println("[8] Cari ID film");
            System.out.println("[9] Urut data rating film - Desc");
            System.out.println("[10] Keluar");
            System.out.println("=====================================");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Pada Posisi Awal");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film : ");
                    rating = sc.nextDouble();
                    sc.nextLine();
                    filmDLL.addFirst(id, judul, rating);
                    break;

                case 2:
                    System.out.println("Masukkan Data Film Pada Posisi Akhir");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film : ");
                    rating = sc.nextDouble();
                    sc.nextLine();
                    filmDLL.addLast(id, judul, rating);
                    break;

                case 3:
                    System.out.println("Masukkan Data Film Pada Posisi Tertentu");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film : ");
                    rating = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Data film ini akan masuk di urutan ke- : ");
                    index = sc.nextInt();
                    sc.nextLine();
                    try {
                        filmDLL.addAtIndex(id, judul, rating, index);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    System.out.println("Menghapus Data Film Pada Posisi Awal");
                    try {
                        filmDLL.removeFirst();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    System.out.println("Menghapus Data Film Pada Posisi Akhir");
                    try {
                        filmDLL.removeLast();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 6:
                    System.out.println("Menghapus Data Film Pada Posisi Tertentu");
                    System.out.print("Masukkan index data film untuk dihapus : ");
                    index = sc.nextInt();
                    sc.nextLine();
                    try {
                        filmDLL.removeAtIndex(index);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 7:
                    System.out.println("Cetak data :");
                    filmDLL.print();
                    break;

                case 8:
                    System.out.println("Cari data");
                    System.out.print("Masukkan ID film yang dicari : ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    Node found = filmDLL.getFilmById(key);
                    if (found != null) {
                        System.out.println(
                                "Data ID Film : " + found.id + " berada di node ke-" + filmDLL.getFilmIndexById(key));
                        System.out.println("IDENTITAS : ");
                        System.out.println("ID Film     : " + found.id);
                        System.out.println("Judul Film  : " + found.judul);
                        System.out.println("Rating Film : " + found.rating);
                    } else {
                        System.out.println("Data Film Tidak Ditemukan!");
                    }
                    break;

                case 9:
                    System.out.println("Sortir Film Berdasarkan Rating DESC");
                    try {
                        filmDLL.sortFilmDesc();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    filmDLL.print();
                    break;

                case 10:
                    System.out.println("Goodbye :)");
                    break;

                default:
                    System.out.println("Pilihan tidak ditemukan!");
                    break;
            }
        } while (pilihan != 10);

        sc.close();
    }
}
