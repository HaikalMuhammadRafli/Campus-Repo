public class Tugas114 {

    // menggunakan fungsi rekursif
    static int DeretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            return (DeretDescendingRekursif(n - 1));
        } else {
            return 0;
        }
    }

    // menggunakan fungsi iteratif
    static void DeretDescending(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        DeretDescendingRekursif(5);
        System.out.println();
        DeretDescending(5);
    }
}
