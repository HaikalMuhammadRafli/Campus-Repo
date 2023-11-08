public class Tugas_Individu3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 && (j == 1 || j == 4 || j == 7)) {
                    System.out.print("  ");
                } else if (i == 5 && (j == 1 || j == 7)) {
                    System.out.print("  ");

                } else if (i == 6 && (j == 1 || j == 2 || j == 6 || j == 7)) {
                    System.out.print("  ");

                } else if (i == 7 && (j == 1 || j == 2 || j == 3 || j == 5 || j == 6 || j == 7)) {
                    System.out.print("  ");

                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}
