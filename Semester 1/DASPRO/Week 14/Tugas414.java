public class Tugas414 {

    static int Fibbonaci(int a, int b, int bulan) {

        if (bulan > 1) {
            return Fibbonaci(b, a + b, bulan - 1);
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibbonaci(0, 1, 12) + " pasangan marmut");
    }
}
