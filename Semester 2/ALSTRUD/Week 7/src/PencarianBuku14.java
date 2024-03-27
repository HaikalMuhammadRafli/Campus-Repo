public class PencarianBuku14 {

    Buku14 listBk[] = new Buku14[5];
    int idx;

    void tambah(Buku14 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku14 b : listBk) {
            b.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = -1;

        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }

        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan!");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul Buku\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t \t : " + listBk[pos].stock);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan!");
        }
    }

    public Buku14 findBuku(int x) {
        int posisi = -1;

        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == x) {
                posisi = i;
                break;
            }
        }

        return listBk[posisi];
    }

    // Percobaan 2
    public int findBinarySearch(int cari, int left, int right) {
        int mid;

        if (right >= left) {
            mid = (left + right) / 2;

            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }

        return -1;
    }
}
