public class Tugas214 {

    static int PenjumlahanRekursif(int e, int f) {
        if (f > 0) {
            System.out.print(e);
            if (f > 1) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
            return (f + PenjumlahanRekursif(e + 1, f - 1));
        } else {
            return 0;
        }
    }

    static int PenjumlahanIteratif(int f) {
        int total = 0;
        for (int i = 1; f > 0; i++) {
            System.out.print(i);
            if (f > 1) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
            total += f;
            f--;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(PenjumlahanRekursif(1, 8));
        System.out.println(PenjumlahanIteratif(8));
    }
}
