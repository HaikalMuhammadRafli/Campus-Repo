public class Gudang14 {

    Barang14 tumpukan[];
    int size;
    int top;

    public Gudang14(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang14[kapasitas];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang14 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang14 ambilBarang() {
        if (!cekKosong()) {
            Barang14 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            // Percobaan 2
            System.out.println("Kode unik dalam biner : " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang14 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang14 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang :");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    // Percobaan 2
    public String konversiDesimalKeBiner(int kode) {
        StackKonversi14 stack = new StackKonversi14();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);

            kode = kode / 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    // Latihan Praktikum
    public Barang14 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang14 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah : " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void cariBarang(String key) {
        Barang14 barangSesuai[] = new Barang14[size];
        int count = 0;

        // Bagian searching
        for (int i = 0; i < size; i++) {
            if (key.matches("-?\\d+(\\.\\d+)?") && tumpukan[i] != null && tumpukan[i].kode == Integer.parseInt(key)) {
                barangSesuai[count] = tumpukan[i];
                count++;
            } else if (tumpukan[i] != null && tumpukan[i].nama.equalsIgnoreCase(key)) {
                barangSesuai[count] = tumpukan[i];
                count++;
            }
        }

        // Bagian menampilkan
        if (count > 0) {
            System.out.println("--------------------------------");
            System.out.println(count + " barang ditemukan!");

            for (int i = 0; i < barangSesuai.length; i++) {
                if (barangSesuai[i] != null) {
                    System.out.println("Kode barang : " + barangSesuai[i].kode);
                    System.out.println("Nama barang : " + barangSesuai[i].nama);
                    System.out.println("Kategori barang : " + barangSesuai[i].kategori);
                    System.out.println("================================");
                }
            }

        } else {
            System.out.println("Tidak ada barang yang ditemukan!");
        }
    }
}
