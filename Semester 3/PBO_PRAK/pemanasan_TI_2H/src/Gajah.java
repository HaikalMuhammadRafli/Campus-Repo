public class Gajah {

    // Macam-macam Descriptor

    // Properti
    private String nama;
    private int umur;

    // Constructor
    public Gajah(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method
    public void makan() {
        System.out.println("Gajah bernama " + this.nama + " Sedang makan, nyam nyam nyam. Umurnya " + this.umur + " tahun. yey");
    }

    public void berlari() {

    }
}
