import java.util.Scanner;

public class NestedLoop_14 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner scanner = new Scanner(System.in);

        // deklarasi array temps[][]
        double temps[][] = new double[5][7];

        // looping input suhu setiap hari di setiap kota dan dimasukkan ke dalam array
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // looping output suhu setiap hari di setiap kota
        int i = 0;
        for (double[] kota : temps) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            i++;
            for (double suhu : kota) {
                System.out.print(suhu + " ");
            }
            System.out.println();
        }

        System.out.println();
        // looping rata2 setiap kota
        int count = 0;
        for (double[] kota : temps) {
            double total = 0, rata2;
            for (double suhu : kota) {
                total += suhu;
            }
            rata2 = total / temps[0].length;
            count++;
            System.out.println("Rata-rata kota ke-" + count + " : " + rata2);
        }

        scanner.close();
    }
}
