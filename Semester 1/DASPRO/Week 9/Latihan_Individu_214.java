public class Latihan_Individu_214 {

    public static void main(String[] args) {

        int[] bil = new int[10];

        for (int i = 0; i < bil.length; i++) {
            bil[i] = i + 1;
        }

        for (int i = bil.length; i > 0; i--) {
            System.out.println(bil[i - 1]);
        }
    }
}
