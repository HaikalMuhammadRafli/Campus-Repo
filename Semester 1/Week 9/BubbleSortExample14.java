public class BubbleSortExample14 {

    public static void main(String[] args) {

        int[] intData = { 34, 18, 87, 72, 32, 54, 43 };
        int temp = 0;

        for (int i = 0; i < intData.length; i++) {
            // perulangan akan berjalan sampai perulangan diatas tidak berjalan
            for (int j = 1; j < intData.length - i; j++) {
                // untuk mengecek apakah bilangan sebelumnya lebih besar
                // descending
                if (intData[j - 1] < intData[j]) {

                    // swap elemen
                    temp = intData[j];
                    // bilangan j diubah nilainya menjadi bilangan sebelumnya
                    intData[j] = intData[j - 1];
                    // bilangan sebelumnya diubah dengan bilangan yang disimpan di dalam temp
                    intData[j - 1] = temp;
                }
            }
        }

        System.out.println("Hasil pengurutan : ");
        // perulangan untuk menampilkan isi array yang sudah di sortir
        for (int i = 0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }
    }
}
