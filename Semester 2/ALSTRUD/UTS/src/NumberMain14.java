public class NumberMain14 {

    public static void main(String[] args) {

        int[] kasus_numbers = { 5, 35, 39, 15, 24, 39, 25, 1, 42, 34, 7, 43, 27, 31, 45, 31, 13 };

        Number14 kasus = new Number14(kasus_numbers);

        System.out.println("\nBinary searching sebelum selection sorting!");
        kasus.showAll();
        kasus.search(24);

        System.out.println("\nBinary searching setelah selection sorting ASC!");
        kasus.selectionSortASC();
        kasus.showAll();
        kasus.search(24);

        System.out.println("\nBinary searching setelah selection sorting DESC!");
        kasus.selectionSortDESC();
        kasus.showAll();
        kasus.search(24);

        System.out.println("\nSearching nilai yang tidak ada!");
        kasus.search(57);
    }
}