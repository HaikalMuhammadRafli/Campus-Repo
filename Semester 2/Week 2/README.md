# JOBSHEET II - OBJECT

## IDENTITAS MAHASISWA
**Nama :** Haikal Muhammad Rafli
**NIM :** 2341720008
**Kelas :** TI-1B
**Absen :** 14

## PRAKTIKUM

### Percobaan 1: Deklarasi Class, Atribut dan Method

#### Kode percobaan
```
public class Buku14 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
```
