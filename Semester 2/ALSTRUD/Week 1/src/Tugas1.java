import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char KODE[] = new char[10];
        char KOTA[][] = new char[10][12];

        KODE[0] = 'A';
        KODE[1] = 'B';
        KODE[2] = 'D';
        KODE[3] = 'E';
        KODE[4] = 'F';
        KODE[5] = 'G';
        KODE[6] = 'H';
        KODE[7] = 'L';
        KODE[8] = 'N';
        KODE[9] = 'T';

        KOTA[0][0] = 'B';
        KOTA[0][1] = 'A';
        KOTA[0][2] = 'N';
        KOTA[0][3] = 'T';
        KOTA[0][4] = 'E';
        KOTA[0][5] = 'N';

        KOTA[1][0] = 'J';
        KOTA[1][1] = 'A';
        KOTA[1][2] = 'K';
        KOTA[1][3] = 'A';
        KOTA[1][4] = 'R';
        KOTA[1][5] = 'T';
        KOTA[1][6] = 'A';

        KOTA[2][0] = 'B';
        KOTA[2][1] = 'A';
        KOTA[2][2] = 'N';
        KOTA[2][3] = 'D';
        KOTA[2][4] = 'U';
        KOTA[2][5] = 'N';
        KOTA[2][6] = 'G';

        KOTA[3][0] = 'C';
        KOTA[3][1] = 'I';
        KOTA[3][2] = 'R';
        KOTA[3][3] = 'E';
        KOTA[3][4] = 'B';
        KOTA[3][5] = 'O';
        KOTA[3][6] = 'N';

        KOTA[4][0] = 'B';
        KOTA[4][1] = 'O';
        KOTA[4][2] = 'G';
        KOTA[4][3] = 'O';
        KOTA[4][4] = 'R';

        KOTA[5][0] = 'P';
        KOTA[5][1] = 'E';
        KOTA[5][2] = 'K';
        KOTA[5][3] = 'A';
        KOTA[5][4] = 'L';
        KOTA[5][5] = 'O';
        KOTA[5][6] = 'N';
        KOTA[5][7] = 'G';
        KOTA[5][8] = 'A';
        KOTA[5][9] = 'N';

        KOTA[6][0] = 'S';
        KOTA[6][1] = 'E';
        KOTA[6][2] = 'M';
        KOTA[6][3] = 'A';
        KOTA[6][4] = 'R';
        KOTA[6][5] = 'A';
        KOTA[6][6] = 'N';
        KOTA[6][7] = 'G';

        KOTA[7][0] = 'S';
        KOTA[7][1] = 'U';
        KOTA[7][2] = 'R';
        KOTA[7][3] = 'A';
        KOTA[7][4] = 'B';
        KOTA[7][5] = 'A';
        KOTA[7][6] = 'Y';
        KOTA[7][7] = 'A';

        KOTA[8][0] = 'M';
        KOTA[8][1] = 'A';
        KOTA[8][2] = 'L';
        KOTA[8][3] = 'A';
        KOTA[8][4] = 'N';
        KOTA[8][5] = 'G';

        KOTA[9][0] = 'T';
        KOTA[9][1] = 'E';
        KOTA[9][2] = 'G';
        KOTA[9][3] = 'A';
        KOTA[9][4] = 'L';

        System.out.print("Masukkan Kode Plat Nomor : ");
        char kode_input = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < KODE.length; i++) {
            if (kode_input == KODE[i]) {
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
            }
        }

        sc.close();
    }
}
