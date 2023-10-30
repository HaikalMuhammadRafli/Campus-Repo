import java.util.Arrays;

public class Numbers14 {

    public static void main(String[] args) {

        // deklarasi dan instansi array
        int[][] myNumbers = new int[3][];

        // instansi kolom baris ke 0 meiliki panjang elemen 5
        myNumbers[0] = new int[5];
        // instansi kolom baris ke 1 meiliki panjang elemen 3
        myNumbers[1] = new int[3];
        // instansi kolom baris ke 2 meiliki panjang elemen 1
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
    }
}
