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
            if (Integer.parseInt(listBk[i].kodeBuku) == cari) {
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

    // judul only variant (Latihan Praktikum)
    public void tampilPosisi(int pos) {
        if (pos != -1) {
            System.out.println("Data ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data tidak ditemukan!");
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

    // judul only variant (Latihan Praktikum)
    public void tampilData(int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + listBk[pos].kodeBuku);
            System.out.println("Judul Buku\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t \t : " + listBk[pos].stock);
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    public Buku14 findBuku(int x) {
        int posisi = -1;

        for (int i = 0; i < listBk.length; i++) {
            if (Integer.parseInt(listBk[i].kodeBuku) == x) {
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

            if (cari == Integer.parseInt(listBk[mid].kodeBuku)) {
                return (mid);
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }

        return -1;
    }

    // Latihan Praktikum 2
    public int findJudulSeqSearch(String cari) {
        int posisi = -1;
        int dupe_count = 0;

        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equals(cari)) {
                posisi = i;
                dupe_count++;
            }
        }

        if (dupe_count > 1) {
            System.out.println("PERHATIAN!");
            System.out.println("Buku yang judulnya sama ada " + dupe_count);
        }

        return posisi;
    }

    public void selectionSortBuku() {
        for (int i = 0; i < listBk.length - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < listBk.length; j++) {
                if (listBk[j].judulBuku.length() == listBk[idxMin].judulBuku.length()) {
                    if (listBk[j].judulBuku.compareTo(listBk[idxMin].judulBuku) < 0) {
                        idxMin = j;
                    }
                } else if (listBk[j].judulBuku.length() < listBk[idxMin].judulBuku.length()) {
                    idxMin = j;
                }
            }

            Buku14 temp = listBk[idxMin];
            listBk[idxMin] = listBk[i];
            listBk[i] = temp;
        }
    }

    public int findJudulBinarySearch(String cari, int left, int right) {

        selectionSortBuku();

        int mid;

        if (right >= left) {
            mid = (left + right) / 2;

            if (cari.compareTo(listBk[mid].judulBuku) == 0) {
                return (mid);
            } else if (cari.length() <= listBk[mid].judulBuku.length() && cari.compareTo(listBk[mid].judulBuku) < 0) {
                return findJudulBinarySearch(cari, left, mid - 1);
            } else {
                return findJudulBinarySearch(cari, mid + 1, right);
            }
        }

        return -1;
    }
}
