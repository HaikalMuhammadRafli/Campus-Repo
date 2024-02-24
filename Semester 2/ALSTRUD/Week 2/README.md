# <p align="center">LAPORAN JOBSHEET II - OBJECT</p>

### **IDENTITAS MAHASISWA**
**Nama :** Haikal Muhammad Rafli<br>
**NIM :** 2341720008<br>
**Kelas :** TI-1B<br>
**Absen :** 14

## PRAKTIKUM

### **1.0 Percobaan 1: Deklarasi Class, Atribut dan Method**

### 1.1 Kode Percobaan :

```java
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
### 1.2 Hasil Percobaan :

![Hasil](./docs/SS%20hasil%20percobaan%201.png)

### 1.3 Pertanyaan dan Jawaban :

1) Sebutkan dua karakteristik class atau object! <br>
**Jawaban :** <br> ``Dua kerakteristik dari class atau object adalah "memiliki sesuatu" atau "atribut" dan "melakukan sesuatu" atau "method".``

2) Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya! <br>
**Jawaban :** <br> ``Terdapat 5 atribut pada class Buku. Yaitu judul buku, nama pengarang, jumlah pengarang, stok buku, dan harga buku.``

3) Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! <br>
**Jawaban :** <br> ``Terdapat 4 method pada class Buku. Yaitu tampilInformasi(), terjual(int jml), restock(int jml), dan gantiHarga(int hrg).``

4) Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)! <br>
**Jawaban :** <br>
``Hasil modifikasi :``
    ```java
    void terjual(int jml) {
            if (stok >= jml) {
                stok -= jml;
            } else {
                System.out.println("Stok tidak mencukupi!");
            }
        }
    ```

5) Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int? <br>
**Jawaban :** <br> ``Menurut saya, karena method restock() berguna untuk menambah stok yang ada di dalam objek. Sehingga parameter int tersebut berguna untuk menyimpan/menyalurkan nilai int yang nanti ditambahkan dengan stok yang tersedia di dalam objek.``

<br><hr>

### **2.0 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method**

### 2.1 Kode Percobaan :

```java
public class BukuMain14 {
    public static void main(String[] args) {

        Buku14 bk1 = new Buku14();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
    }
}
```

### 2.2 Hasil Percobaan :

![Hasil](./docs/SS%20hasil%20percobaan%202.PNG)

### 2.3 Pertanyaan dan Jawaban :

1) Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan? <br>
**Jawaban :** <br>
``Baris kode bagian instansiasi dan nama object yang dihasilkan adalah bk1 :``
    ```java
    Buku14 bk1 = new Buku14();
    ```

2) Bagaimana cara mengakses atribut dan method dari suatu objek? <br>
**Jawaban :** <br> ``Dengan cara "nama_object.nama_atribut/nama_method". Contohnya :``
    ```java
    //atribut
    System.out.println(bk1.judul);
    //method
    bk1.tampilInformasi();
    ```

3) Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda? <br>
**Jawaban :** <br>
``Karena harga object tersebut diganti di baris kode :``
    ```java
    bk1.gantiHarga(60000);
    ```

<br><hr>

### **3.0 Percobaan 3: Membuat Konstruktor**

### 3.1 Kode Percobaan :

```java
public class Buku14 {

    String judul, pengarang;
    int halaman, stok, harga;

    Buku14() {

    }

    Buku14(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

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

```java
public class BukuMain14 {
    public static void main(String[] args) {

        Buku14 bk1 = new Buku14();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku14 bk2 = new Buku14("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
```

### 3.2 Hasil Percobaan :

![Hasil](./docs/SS%20hasil%20percobaan%203.PNG)

### 3.3 Pertanyaan dan Jawaban :

1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter! <br>
**Jawaban :** <br>
``Baris kode yang mendeklarasikan konstruktor berparameter:``
    ```java
    Buku14(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
    ```

2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut? <br>
**Jawaban :** <br> ``Baris program tersebut melakukan instansiasi object Buku14 baru yang bernama bk2 dengan menggunakan konstruktor berparameter.``

3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian! <br>
**Jawaban :** <br> ``Hasilnya adalah baris kode yang mengintansiasi object Buku14 dengan nama bk1 dengan menggunakan konstruktor default / tanpa parameter menjadi error. Karena konstruktor yang ada hanya konstruktor yang menggunakan parameter, sehingga instansiasi yang tidak ada parameternya menjadi error dan membutuhkan parameter.``

4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya! <br>
**Jawaban :** <br> ``Tidak harus berurutan, karena method-method yang ada di dalam class Buku bersifat independen atau bisa dipanggil satu-persatu.``

5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku! <br>
**Jawaban :** <br>
``Baris kode : ``
    ```java
    Buku14 bukuHaikal = new Buku14("Wake Up", "Haikal Muhammad Rafli", 1, 1, 10000000);
    ```

<br><hr>

### **4.0 Latihan Praktikum**

### SOAL DAN JAWABAN

1) Pada class Buku yang telah dibuat, tambahkan tiga method yaitu hitungHargaTotal(), hitungDiskon(), dan hitungHargaBayar() dengan penjelasan sebagai berikut:
- Method hitungHargaTotal() digunakan untuk menghitung harga total yang merupakan perkalian antara harga dengan jumlah buku yang terjual
- Method hitungDiskon() digunakan untuk menghitung diskon dengan aturan berikut:
    - Jika harga total lebih dari 150000, maka harga didiskon sebesar 12%
    - Jika harga total antara 75000 sampai 150000, maka harga didiskon sebesar 5%
    - Jika harga total kurang dari 75000, maka harga tidak didiskon
- Method hitungHargaBayar() digunakan untuk menghitung harga total setelah dikurangi diskon

<br>

**Jawaban :** <br>
```java
int hitungHargaTotal() {
        return harga * qty;
    }

    int hitungDiskon() {
        int diskon = hitungHargaTotal();
        if (diskon > 150000) {
            return diskon * 12 / 100;
        } else if (diskon >= 75000 && diskon <= 150000) {
            return diskon * 5 / 100;
        } else {
            return diskon;
        }
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
```

**Hasil Kode Program :** <br>

![Hasil](./docs/SS%204.1.PNG)

2) Penjelasan dari atribut dan method pada class Dragon tersebut adalah sebagai berikut:

- Atribut x digunakan untuk menyimpan posisi koordinat x (mendatar) dari dragon, sedangkan atribut y untuk posisi koordinat y (vertikal)
- Atribut width digunakan untuk menyimpan lebar dari area permainan, sedangkan height untuk menyimpan panjang area
- Method moveLeft() digunakan untuk mengubah posisi dragon ke kiri (koordinat x akan berkurang 1), sedangkan moveRight() untuk bergerak ke kanan (koordinat x akan bertambah 1). Perlu diperhatikan bahwa koordinat x tidak boleh lebih kecil dari 0 atau lebih besar dari  nilai width. Jika koordinat x < 0 atau x > width maka panggil method detectCollision()
- Method moveUp() digunakan untuk mengubah posisi dragon ke atas (koordinat y akan berkurang 1), sedangkan moveDown() untuk bergerak ke bawah (koordinat y akan bertambah 1). Perlu diperhatikan bahwa koordinat y tidak boleh lebih kecil dari 0 atau lebih besar dari nilai height. Jika koordinat y < 0 atau y > height maka panggil method detectCollision()
- Method detectCollision() akan mencetak pesan “Game Over” apabila dragon menyentuh ujung area permainan

<br>

**Jawaban :** <br>
``Dragon.java``
```java
public class Dragon {

    int x, y, width, height;

    Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        x--;
        if (x >= 0) {
            printPosition();
        } else {
            detectCollision(x, y);
            x++;
        }
    }

    void moveRight() {
        x++;
        if (x <= width) {
            printPosition();
        } else {
            detectCollision(x, y);
            x--;
        }
    }

    void moveUp() {
        y--;
        if (y >= 0) {
            printPosition();
        } else {
            detectCollision(x, y);
            y++;
        }
    }

    void moveDown() {
        y++;
        if (y <= height) {
            printPosition();
        } else {
            detectCollision(x, y);
            y--;
        }
    }

    void printPosition() {
        System.out.println("Position : " + x + " | " + y);
    }

    void detectCollision(int x, int y) {
        System.out.println("Game over!");
        if (x < 0 || x > width) {
            System.out.println("x position is out of bounds");
        } else if (y < 0 || y > height) {
            System.out.println("y position is out of bounds");
        }

        // untuk mengakhiri game. dicomment saja jika untuk testing
        System.exit(0);
    }
}
```
<br>

``DragonMain.java``
```java
public class DragonMain {

    public static void main(String[] args) {

        Dragon play = new Dragon(5, 5, 10, 10);
        System.out.println("\nUp test");
        for (int i = 0; i < 6; i++) {
            play.moveUp();
        }
        System.out.println("\nDown test");
        for (int i = 0; i < 11; i++) {
            play.moveDown();
        }
        System.out.println("\nLeft test");
        for (int i = 0; i < 6; i++) {
            play.moveLeft();
        }
        System.out.println("\nRight test");
        for (int i = 0; i < 11; i++) {
            play.moveRight();
        }
    }
}
```

**Hasil Kode Program :** <br>

![Hasil](./docs/SS%204.2.PNG)