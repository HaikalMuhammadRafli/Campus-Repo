public class TugasIndividu414 {

    public static void main(String[] args) {

        // deklarasi dan inisialisasi array atlet
        String atlet[][] = {
                { "Dimas", "Abdi", "Rio", "Hanif", "Vanessa" },
                { "Nabila", "Cynara", "Rosyada", "Rendi", "Jamal" },
                { "Vincent", "Zaki", "Faris", "Reza", "Cahyadi" },
                { "Jojo", "Yudi", "Saka", "Pasha", "Dio" },
        };

        // deklarasi dan inisialisasi array cabang olahraga
        String cabangOlahraga[] = { "Badminton", "Tenis Meja", "Basket", "Bola Voli" };

        // deklarasi variable temp
        String temp;

        // outer loop cabang olahraga
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabang Olahraga " + cabangOlahraga[i] + " :");

            // inner loop level 1 sorting nama
            for (int j = 0; j < atlet[i].length; j++) {
                // inner loop level 2 sorting nama
                for (int k = 1; k < atlet[i].length - j; k++) {
                    if ((atlet[i][k - 1]).compareTo(atlet[i][k]) < 0) {
                        temp = atlet[i][k];
                        atlet[i][k] = atlet[i][k - 1];
                        atlet[i][k - 1] = temp;
                    }
                }
            }

            // reset nomer
            int numbering = 0;
            // looping untuk menampilkan nama-nama atlet sesuai dengan cabang olahraga
            for (int j = 0; j < atlet[i].length; j++) {
                numbering++;
                System.out.println(numbering + "> " + atlet[i][j]);
            }

            System.out.println();
        }
    }
}
