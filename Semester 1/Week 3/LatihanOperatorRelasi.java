public class LatihanOperatorRelasi {

    public static void main(String[] args) {

        int x, y, z;
        x = 100;
        y = 99;
        z = 99;
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);

        // operator sama dengan
        if (y == z) {
            System.out.println("y sama dengan z");
        } else {
            System.out.println("y tidak sama dengan z");
        }

        if (x != y) {
            System.out.println("x tidak sama dengan y");
        } else {
            System.out.println("x sama dengan y");
        }

        if (x > y) {
            System.out.println("x lebih besar dari y");
        } else {
            System.out.println("x tidak lebih besar dari y");
        }

        if (x < y) {
            System.out.println("x lebih kecil dari y");
        } else {
            System.out.println("x tidak lebih kecil dari y");
        }

        if (x >= y) {
            System.out.println("x lebih besar atau sama dengan y");
        } else {
            System.out.println("x tidak lebih besar atau sama dengan y");
        }

        if (x <= y) {
            System.out.println("x lebih kecil atau sama dengan y");
        } else {
            System.out.println("x tidak lebih kecil atau sama dengan y");
        }
    }
}
