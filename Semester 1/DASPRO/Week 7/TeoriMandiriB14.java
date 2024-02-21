public class TeoriMandiriB14 {

    public static void main(String[] args) {

        int total = 0;

        // pengulangan akan mengulang sampai varible i mencapai 1
        for (int i = 25; i >= 1; i--) {
            // total akan ditambah dengan i setiap kali diulang
            // i akan di decrement setiap kali pengulangan
            total += i;
        }

        // menampilkan total penambahan
        System.out.println("Total : " + total);
    }
}
