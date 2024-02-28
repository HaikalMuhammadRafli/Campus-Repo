# <p align="center">LAPORAN JOBSHEET III - ARRAY OF OBJECT</p>

### **IDENTITAS MAHASISWA**
**Nama :** Haikal Muhammad Rafli<br>
**NIM :** 2341720008<br>
**Kelas :** TI-1B<br>
**Absen :** 14

## PRAKTIKUM

### **1.0 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan**

### 1.1 Kode Percobaan :

``PersegiPanjang.java`` <br>
```java
public class PersegiPanjang {

    public int panjang, lebar;

}
```

``ArrayObjects.java`` <br>
```java
public class ArrayObjects {

    public static void main(String[] args) {

        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi panjang ke-0, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        System.out.println("Persegi panjang ke-1, panjang : " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        System.out.println("Persegi panjang ke-2, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);
    }
}
```

### 1.2 Hasil Kode Percobaan :

![Hasil](./docs/SS%201.2.1.PNG)

### 1.3 Pertanyaan dan Jawaban :

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan! <br>
**Jawaban :** <br> ``Tidak perlu, karena atribut dan method ditambahkan ketika object yang dibuat perlu menyimpan dan memproses data``

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut : ppArray[0] = new PersegiPanjang();  <br>
**Jawaban :** <br> ``Tidak ada, karena object yang ada di dalam array perlu diinstansiasi dan secara default jika class yang akan dibuat menjadi object tidak memiliki konstruktor akan sama saja seperti konstruktor kosong``

3. Apa yang dimaksud dengan kode berikut ini: PersegiPanjang[] ppArray = new PersegiPanjang[3]; <br>
**Jawaban :** <br> ``Kode tersebut bermaksud untuk menginstansiasi array ppArray dengan tipe variable class PersegiPanjang dengan jumlah 3 object``

4. Apa yang dimaksud dengan kode berikut ini: ppArray[0] = new PersegiPanjang(); ppArray[0].panjang = 110; ppArray[0].lebar = 30; <br>
**Jawaban :** <br> ``Kode tersebut bermaksud untuk menginstansiasi sebuah object di dalam array dan memberikan nilai-nilai kepada atribut yang ada di dalam object tersebut``

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2? <br>
**Jawaban :** <br> ``Untuk memisahkan class object dengan class alur/main supaya lebih fleksible dan mudah dalam penggunaan dan maintenance classnya``

<br><hr>

### **2.0 Percobaan 2: Menerima Input Isian Array Menggunakan Looping**

### 2.1 Kode Percobaan :

```java
import java.util.Scanner;

public class ArrayObjects {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }

        sc.close();
    }
}
```

### 2.2 Hasil Kode Percobaan :

![Hasil](./docs/SS%202.2.1.PNG)

### 2.3 Pertanyaan dan Jawaban :

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi? <br>
**Jawaban :** <br> ``Iya, array of object dapat diimplementasikan pada array 2D``

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan! <br>
**Jawaban :** <br>
``Segitiga.java`` <br>

    ```java
    PersegiPanjang[][] hhArray = new PersegiPanjang[3][3];
        
        hhArray[0][0] = new PersegiPanjang();
        hhArray[0][0].panjang = 10;
        System.out.println("Panjang : " + hhArray[0][0].panjang);
        hhArray[0][1] = new PersegiPanjang();
        hhArray[0][1].panjang = 20;
        System.out.println("Panjang : " + hhArray[0][1].panjang);
        hhArray[1][0] = new PersegiPanjang();
        hhArray[1][0].panjang = 30;
        System.out.println("Panjang : " + hhArray[1][0].panjang);
        hhArray[1][1] = new PersegiPanjang();
        hhArray[1][1].panjang = 40;
        System.out.println("Panjang : " + hhArray[1][1].panjang);
    ```
    ``Hasil`` <br>
    ![Hasil](./docs/SS%202.3.2.PNG)

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa? <br>
**Jawaban :** <br> ``Karena object pada array pgArray ke-5 belum diinstansiasi``

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner! <br>
**Jawaban :** <br> ``Kode`` <br>

    ```java
    import java.util.Scanner;

    public class ArrayObjects {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Masukan jumlah object persegi panjang : ");
            PersegiPanjang[] ppArray = new PersegiPanjang[sc.nextInt()];

            for (int i = 0; i < 3; i++) {
                ppArray[i] = new PersegiPanjang();
                System.out.println("Persegi panjang ke-" + i);
                System.out.print("Masukkan panjang : ");
                ppArray[i].panjang = sc.nextInt();
                System.out.print("Masukkan lebar : ");
                ppArray[i].lebar = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Persegi panjang ke-" + i);
                System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
            }

            sc.close();
        }
    }
    ```

    ``Hasil Kode`` <br>
    ![Hasil](./docs/SS%202.3.4.PNG)

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan ! <br>
**Jawaban :** <br> ``Boleh saja terjadi duplikasi instansiasi. Hal tersebut tidak menghasilkan error tetapi object yang pertama diinstansiasi akan tergantikan / overwritten dengan object yang baru saja diinstansiasi``

<br><hr>

### **3.0 Percobaan 3: Menerima Input Isian Array Menggunakan Looping**

### 3.1 Kode Percobaan :

``Balok.java`` <br>
```java
public class Balok {

    public int panjang, lebar, tinggi;

    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int HitungVolume() {
        return panjang * lebar * tinggi;
    }
}
```

``ArrayBalok.java`` <br>
```java
public class ArrayBalok {

    public static void main(String[] args) {

        Balok[] blArray = new Balok[3];

        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].HitungVolume());
        }
    }
}
```

### 3.2 Hasil Kode Percobaan :

![Hasil](./docs/SS.%203.2.1.PNG)

### 3.3 Pertanyaan dan Jawaban :

1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! <br>
**Jawaban :** <br> ``Bisa saja, tetapi harus memiliki parameter yang berbeda pada setiap konstruktornya. Contohnya :``
    ```java
    Buku14() {

    }

    Buku14(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    ```
    ``Contoh diatas akan menerima instansiasi dengan parameter maupun tidak menggunakan parameter. Jika diinstansiasi menggunakan parameter maka konstruktor yang dibawah yang akan digunakan. Dan jika tidak menggunakan parameter maka konstruktor yang atas yang akan digunakan``

2. Jika diketahui terdapat class Segitiga seperti berikut ini: Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. <br>
**Jawaban :** <br> ``Kode`` <br>

    ```java
    public class Segitiga {

        public int alas, tinggi;

        public Segitiga(int a, int t) {

            alas = a;
            tinggi = t;
        }
    }
    ```

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring) <br>
**Jawaban :** <br> 

    ```java
    public double HitungLuas() {
        return alas * tinggi / 2;
    }

    public double HitungKeliling() {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
    ```

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut: sgArray ke-0 alas: 10, tinggi: 4; sgArray ke-1 alas: 20, tinggi: 10; sgArray ke-2 alas: 15, tinggi: 6; sgArray ke-3 alas: 25, tinggi: 10 <br>
**Jawaban :** <br> 

    ```java
    public class ArraySegitiga {
        public static void main(String[] args) {

            Segitiga sgArray[] = new Segitiga[4];

            sgArray[0] = new Segitiga(10, 4);
            sgArray[1] = new Segitiga(20, 10);
            sgArray[2] = new Segitiga(15, 6);
            sgArray[3] = new Segitiga(25, 10);
        }
    }
    ```

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling() <br>
**Jawaban :** <br> 

    ``ArraySegitiga.java`` <br>

    ```java
    public class ArraySegitiga {
        public static void main(String[] args) {

            Segitiga sgArray[] = new Segitiga[4];

            sgArray[0] = new Segitiga(10, 4);
            sgArray[1] = new Segitiga(20, 10);
            sgArray[2] = new Segitiga(15, 6);
            sgArray[3] = new Segitiga(25, 10);

            for (int i = 0; i < sgArray.length; i++) {
                System.out.println("Segitiga ke : " + i);
                System.out.printf("Luas : %.2f\n", sgArray[i].HitungLuas());
                System.out.printf("Keliling : %.2f\n", sgArray[i].HitungKeliling());
            }
        }
    }
    ```

    ``Hasil Kode`` <br>
    ![Hasil](./docs/SS%203.3.5.PNG)

<br><hr>

### **4.0 Latihan Praktikum**

### 4.1 Latihan 1 :
1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atribut-atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan :

- Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut.
- Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
- Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan tinggi limas
- Pada bola, inpuntan untuk atribut hanya jari-jari

``Kerucut.java`` <br>
```java
public class Kerucut {

    public int jariJari, sisiMiring, tinggi;

    public double getTinggi() {
        return (Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2));
    }

    public double getLuasPermukaan() {
        return (Math.PI * Math.pow(jariJari, 2)) + (Math.PI * jariJari * sisiMiring);
    }

    public double getVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi / 3;
    }
}
```

``LimasSegiEmpat.java`` <br>
```java
public class LimasSegiEmpat {

    double panjangAlas, tinggi;

    public double getLuasPermukaan() {
        return Math.pow(panjangAlas, 2) + 4 * (panjangAlas * tinggi / 2);
    }

    public double getVolume() {
        return Math.pow(panjangAlas, 2) * tinggi / 3;
    }
}
```

``Bola.java`` <br>
```java
public class Bola {

    int jariJari;

    public double getLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double getVolume() {
        return 4 * Math.PI * Math.pow(jariJari, 3) / 3;
    }
}
```

``Latihan1Main.java`` <br>
```java
import java.util.Scanner;

public class Latihan1Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Kerucut : ");
        Kerucut kcArray[] = new Kerucut[sc.nextInt()];

        System.out.print("Masukkan jumlah Limas Segi Empat Sama Sisi : ");
        LimasSegiEmpat lseArray[] = new LimasSegiEmpat[sc.nextInt()];

        System.out.print("Masukkan jumlah kerucut : ");
        Bola blArray[] = new Bola[sc.nextInt()];

        if (kcArray.length <= 0 && lseArray.length <= 0 && blArray.length <= 0) {
            System.out.println("No shapes found!");
        }

        if (kcArray.length > 0) {
            for (int i = 0; i < kcArray.length; i++) {
                kcArray[i] = new Kerucut();
                System.out.println("\nKerucut ke " + i);
                System.out.print("Masukkan jari-jari : ");
                kcArray[i].jariJari = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan sisi miring : ");
                kcArray[i].sisiMiring = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tinggi : ");
                kcArray[i].tinggi = sc.nextInt();

                System.out.printf("Luas permukaan : %.2f\n", kcArray[i].getLuasPermukaan());
                System.out.printf("Volume : %.2f\n", kcArray[i].getVolume());
            }

        }

        if (lseArray.length > 0) {
            for (int i = 0; i < lseArray.length; i++) {
                lseArray[i] = new LimasSegiEmpat();
                System.out.println("\nLimas Segi Empat ke " + i);
                System.out.print("Masukkan panjang alas : ");
                lseArray[i].panjangAlas = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tinggi : ");
                lseArray[i].tinggi = sc.nextInt();
                sc.nextLine();

                System.out.printf("Luas permukaan : %.2f\n", lseArray[i].getLuasPermukaan());
                System.out.printf("Volume : %.2f\n", lseArray[i].getVolume());
            }
        }

        if (blArray.length > 0) {
            for (int i = 0; i < blArray.length; i++) {
                blArray[i] = new Bola();
                System.out.println("\nBola ke " + i);
                System.out.print("Masukkan jari-jari : ");
                blArray[i].jariJari = sc.nextInt();
                sc.nextLine();

                System.out.printf("Luas permukaan : %.2f\n", blArray[i].getLuasPermukaan());
                System.out.printf("Volume : %.2f\n", blArray[i].getVolume());
            }
        }

        sc.close();
    }
}
```

``Hasil Program`` <br>
![Hasil](./docs/SS%204.1.PNG)

### 4.2 Latihan 2 :
2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika dimisalkan terdapat 3 data mahasiswa yang tersedia. 

``Mahasiswa.java`` <br>
```java
public class Mahasiswa {

    String nama, nim;
    char jenis_kelamin;
    double ipk;
}
```

``Latihan2Main.java`` <br>
```java
import java.util.Scanner;

public class Latihan2Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa mahasiswa[] = new Mahasiswa[3];

        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new Mahasiswa();
            System.out.println("Mahasiswa ke " + i);
            System.out.print("Masukkan nama : ");
            mahasiswa[i].nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            mahasiswa[i].nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            mahasiswa[i].jenis_kelamin = sc.nextLine().toUpperCase().charAt(0);
            System.out.print("Masukkan IPK : ");
            mahasiswa[i].ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke " + i);
            System.out.println("Nama : " + mahasiswa[i].nama);
            System.out.println("NIM : " + mahasiswa[i].nim);
            System.out.println("Jenis kelamin : " + mahasiswa[i].jenis_kelamin);
            System.out.println("IPK : " + mahasiswa[i].ipk);
            System.out.println();
        }

        sc.close();
    }
}
```

``Hasil Kode`` <br>
![Hasil](./docs/SS%204.2.PNG)

### 4.3 Latihan 3 :
3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing proses tersebut)

``Tambahan Method di Mahasiswa.java`` <br>
```java
public double calcIPKAverage(Mahasiswa[] mhs) {
        double totalIPK = 0;

        for (Mahasiswa mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }

        return totalIPK / mhs.length;
    }

    public void showHighestIPK(Mahasiswa[] mhs) {

        double highestIPK = 0;
        Mahasiswa selectedMhs = null;

        for (Mahasiswa mahasiswa : mhs) {
            if (mahasiswa.ipk > highestIPK) {
                highestIPK = mahasiswa.ipk;
                selectedMhs = mahasiswa;
            }
        }

        System.out.println("Mahasiswa dengan IPK tertinggi");
        System.out.println("Nama : " + selectedMhs.nama);
        System.out.println("NIM : " + selectedMhs.nim);
        System.out.println("Jenis kelamin : " + selectedMhs.jenis_kelamin);
        System.out.println("IPK : " + selectedMhs.ipk);
    }
```

``Tambahan Kode di Latihan2Main.java`` <br>
```java
Mahasiswa mhs = new Mahasiswa();
System.out.printf("Rata-rata IPK : %.2f\n", mhs.calcIPKAverage(mahasiswa));
mhs.showHighestIPK(mahasiswa);
```

``Hasil Kode Program`` <br>
![Hasil](./docs/SS%204.3.PNG)