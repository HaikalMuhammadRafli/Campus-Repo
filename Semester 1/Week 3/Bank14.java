import java.util.*;

public class Bank14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, bunga, presentase_bunga = 0.02;

        System.out.print("Masukkan jumlah tabungan awal anda : ");
        jml_tabungan_awal = sc.nextInt();
        System.out.print("Masukkan lama menabung anda : ");
        lama_menabung = sc.nextInt();

        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);

        sc.close();
    }
}
