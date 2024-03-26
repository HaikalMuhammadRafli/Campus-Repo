import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] dummyHotel = {
                { "Hotel A", "Jakarta", "500000", "4" },
                { "Hotel B", "Bandung", "450000", "3" },
                { "Hotel C", "Surabaya", "600000", "5" },
                { "Hotel D", "Yogyakarta", "400000", "4" },
                { "Hotel E", "Bali", "700000", "5" }
        };

        HotelService list = new HotelService();

        Hotel listHotel[] = new Hotel[dummyHotel.length];

        for (int i = 0; i < listHotel.length; i++) {
            listHotel[i] = new Hotel(dummyHotel[i][0], dummyHotel[i][1], Integer.parseInt(dummyHotel[i][2]),
                    Byte.parseByte(
                            dummyHotel[i][3]));
        }

        for (Hotel h : listHotel) {
            list.tambah(h);
        }

        System.out.println("Daftar hotel sebelum diurutkan : ");
        list.tampilAll();
        System.out.println();

        System.out.println("Pilihan filter :");
        System.out.println("[1] Harga Ascending");
        System.out.println("[2] Bintang Descending");
        System.out.print("Pilihan anda : ");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Daftar hotel filter harga ascending :");
                System.out.println("-- BUBBLE SORT --");
                list.bubbleSortHarga();
                list.tampilAll();

                System.out.println("-- SELECTION SORT --");
                list.selectionSortHarga();
                list.tampilAll();
                break;

            case 2:
                System.out.println("Daftar hotel filter rating bintang descending :");
                System.out.println("-- BUBBLE SORT --");
                list.bubbleSortBintang();
                list.tampilAll();

                System.out.println("-- SELECTION SORT --");
                list.selectionSortBintang();
                list.tampilAll();
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}
