
public class Bioskop14 {

    public static void main(String[] args) {

        String[][] penonton = new String[4][2];

        // memberikan nilai pada setiap indeks column dan row
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // mengoutputkan panjang indeks array penonton
        System.out.println(penonton.length);

        // looping untuk mengoutputkan panjang elemen di setiap row
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris : " + barisPenonton.length);
        }

        // looping untuk mengoutputkan penonton di setiap row
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + " : " + String.join(" ,", penonton[i]));
        }
    }
}
