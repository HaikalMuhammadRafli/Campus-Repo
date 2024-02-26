import java.util.Scanner;

public class Fungsi {

    static Scanner sc = new Scanner(System.in);

    static String toko_bunga[][] = { { "RoyalGarden 1", "10", "5", "15", "7" },
            { "RoyalGarden 2", "6", "11", "9", "12" },
            { "RoyalGarden 3", "2", "10", "10", "5" },
            { "RoyalGarden 4", "5", "7", "12", "9" } };

    static void Pendapatan() {
        System.out.println("============================================================");
        System.out.println("Pendapatan Setiap Cabang");
        System.out.println("============================================================");
        System.out.printf("%-14s %-9s %-7s %-9s %-6s %-20s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar",
                "Pendapatan");

        for (String[] toko : toko_bunga) {
            int totalPendapatan = (Integer.parseInt(toko[1]) * 75000)
                    + (Integer.parseInt(toko[2]) * 50000)
                    + (Integer.parseInt(toko[3]) * 60000)
                    + (Integer.parseInt(toko[4]) * 10000);

            System.out.printf("%-14s %-9s %-7s %-9s %-6s Rp %-20d\n", toko[0], toko[1], toko[2], toko[3], toko[4],
                    totalPendapatan);
        }
    }

    static void Stok(int cabang) {
        int index = cabang - 1;
        System.out.println("============================================================");
        System.out.println("Stok " + toko_bunga[index][0]);
        System.out.println("============================================================");

        System.out.printf("%-14s %-9s %-7s %-9s %-6s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        System.out.printf("%-14s %-9s %-7s %-9s %-6s\n", toko_bunga[index][0],
                toko_bunga[index][1],
                toko_bunga[index][2],
                toko_bunga[index][3],
                toko_bunga[index][4]);

        System.out.println("--------------------------------------");
        System.out.print("Apakah ada bunga yang mati? (y/n) : ");
        char choice = sc.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            System.out.println();
            System.out.print("Bunga Aglonema : ");
            toko_bunga[index][1] = Integer.toString(Integer.parseInt(toko_bunga[index][1]) - sc.nextInt());
            System.out.print("Bunga Keladi : ");
            toko_bunga[index][2] = Integer.toString(Integer.parseInt(toko_bunga[index][2]) - sc.nextInt());
            System.out.print("Bunga Alocasia : ");
            toko_bunga[index][3] = Integer.toString(Integer.parseInt(toko_bunga[index][3]) - sc.nextInt());
            System.out.print("Bunga Mawar : ");
            toko_bunga[index][4] = Integer.toString(Integer.parseInt(toko_bunga[index][4]) - sc.nextInt());
        }
    }

    public static void main(String[] args) {
        Pendapatan();
        Stok(4);
        Stok(4);
        sc.close();
    }
}
