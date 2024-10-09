import core.Angsuran;
import core.Pinjaman;
import io.PembacaInput;
import io.Penampil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PembacaInput pi = new PembacaInput(args);
        pi.Baca();
        Pinjaman p = pi.getPinjaman();
        // System.out.println("Sampai sini dapat object pinjam!");
        p.hitung();
        Angsuran[] daftarAngsuran = p.getDaftarAngsuran();
        // System.out.println("Sampai sini dapat object angsuran!");
        Penampil penampil = new Penampil(daftarAngsuran);
        penampil.gambarHeaderTable();
        penampil.gambarBodyTable();
        penampil.gambarFooterTable();
    }
}