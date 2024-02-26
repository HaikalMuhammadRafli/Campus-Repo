# <p align="center">LAPORAN JOBSHEET I - KONSEP DASAR PEMROGRAMAN</p>

### **IDENTITAS MAHASISWA**
**Nama :** Haikal Muhammad Rafli<br>
**NIM :** 2341720008<br>
**Kelas :** TI-1B<br>
**Absen :** 14

## PRAKTIKUM

### **1.0 Percobaan 1: Pemilihan**

### 1.1 Kode Percobaan :

```java
import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nilaiHuruf, keterangan;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = sc.nextInt();

        System.out.print("Masukkan Nilai Kuis : ");
        double nilaiKuis = sc.nextInt();

        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = sc.nextInt();

        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = sc.nextInt();

        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai Tugas tidak valid!");

        } else if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai Kuis tidak valid!");

        } else if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai UTS tidak valid!");

        } else if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai UAS tidak valid!");

        } else {

            double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";

            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";

            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";

            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";

            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";

            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";

            } else {
                nilaiHuruf = "E";

            }

            if (nilaiAkhir > 50) {
                keterangan = "SELAMAT ANDA LULUS";
            } else {
                keterangan = "MOHON MAAF ANDA TIDAK LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);

            System.out.println("==============================");
            System.out.println("==============================");

            System.out.println(keterangan);

            sc.close();
        }
    }
}
```

### 1.2 Hasil Kode Percobaan :

``HASIL LULUS`` <br>
![Hasil](./docs/SS%201.2.1.PNG)

``HASIL TIDAK LULUS`` <br>
![Hasil](./docs/SS%201.2.2.PNG)

``NILAI TIDAK SESUAI KETENTUAN`` <br>
![Hasil](./docs/SS%201.2.3.PNG)

<br><hr>

### **2.0 Percobaan 2: Perulangan**

### 2.1 Kode Percobaan :

```java
import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.println("==================================");

        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        sc.close();
    }
}
```

### 2.2 Hasil Kode Percobaan :

``N LEBIH DARI 10`` <br>
![Hasil](./docs/SS%202.2.1.PNG)

``N KURANG DARI 10`` <br>
![Hasil](./docs/SS%202.2.2.PNG)

<br><hr>

### **3.0 Percobaan 3: Array**

### 3.1 Kode Percobaan :

```java
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahSKS = 0;
        double ips = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jml_matkul = sc.nextInt();
        sc.nextLine();

        System.out.println("------------------------------");

        String mataKuliah[][] = new String[jml_matkul][3];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan Nama Mata Kuliah : ");
            mataKuliah[i][0] = sc.nextLine();

            System.out.print("Masukkan Nilai Huruf (A,B+,B,C+,C,D,E) : ");
            mataKuliah[i][1] = sc.nextLine();

            System.out.print("Masukkan Bobot SKS : ");
            mataKuliah[i][2] = sc.nextLine();

            System.out.println();
        }

        System.out.println("=================================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================================================");
        System.out.printf("%-40s %-12s %-12s\n", "Mata Kuliah", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mataKuliah.length; i++) {
            jumlahSKS += Integer.parseInt(mataKuliah[i][2]);
        }

        for (String[] matkul : mataKuliah) {
            double nilaiSetara = matkul[1].equalsIgnoreCase("A") ? 4.0
                    : matkul[1].equalsIgnoreCase("B+") ? 3.5
                            : matkul[1].equalsIgnoreCase("B") ? 3.0
                                    : matkul[1].equalsIgnoreCase("C+") ? 2.5
                                            : matkul[1].equalsIgnoreCase("C") ? 2.0
                                                    : matkul[1].equalsIgnoreCase("D") ? 1.0 : 0;

            System.out.printf("%-40s %-12s %-12s\n", matkul[0], matkul[1], nilaiSetara);

            ips += (nilaiSetara * Integer.parseInt(matkul[2])) / jumlahSKS;
        }

        System.out.println("=================================================================");
        System.out.printf("IPS : %.2f\n", ips);

        sc.close();
    }
}
```

### 3.2 Hasil Kode Percobaan :

![Hasil](./docs/SS%203.2.1.PNG) <br> ![Hasil](./docs/SS%203.2.2.PNG)

<br><hr>

### **4.0 Percobaan 3: Fungsi**

### 4.1 Kode Percobaan :

```java
import java.util.Scanner;

public class Fungsi {

    static Scanner sc = new Scanner(System.in);

    static String toko_bunga[][] = { { "RoyalGarden 1", "10", "5", "15", "7" },
            { "RoyalGarden 2", "6", "11", "9", "12" },
            { "RoyalGarden 3", "2", "10", "10", "5" },
            { "RoyalGarden 4", "5", "7", "12", "9" } };

    static void Pendapatan() {
        System.out.println("============================================================");
        System.out.println("Pendapatan Setiap Cabang");
        System.out.println("============================================================");
        System.out.printf("%-14s %-9s %-7s %-9s %-6s %-20s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar",
                "Pendapatan");

        for (String[] toko : toko_bunga) {
            int totalPendapatan = (Integer.parseInt(toko[1]) * 75000)
                    + (Integer.parseInt(toko[2]) * 50000)
                    + (Integer.parseInt(toko[3]) * 60000)
                    + (Integer.parseInt(toko[4]) * 10000);

            System.out.printf("%-14s %-9s %-7s %-9s %-6s Rp %-20d\n", toko[0], toko[1], toko[2], toko[3], toko[4],
                    totalPendapatan);
        }
    }

    static void Stok(int cabang) {
        int index = cabang - 1;
        System.out.println("============================================================");
        System.out.println("Stok " + toko_bunga[index][0]);
        System.out.println("============================================================");

        System.out.printf("%-14s %-9s %-7s %-9s %-6s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        System.out.printf("%-14s %-9s %-7s %-9s %-6s\n", toko_bunga[index][0],
                toko_bunga[index][1],
                toko_bunga[index][2],
                toko_bunga[index][3],
                toko_bunga[index][4]);

        System.out.println("--------------------------------------");
        System.out.print("Apakah ada bunga yang mati? (y/n) : ");
        char choice = sc.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            System.out.println();
            System.out.print("Bunga Aglonema : ");
            toko_bunga[index][1] = Integer.toString(Integer.parseInt(toko_bunga[index][1]) - sc.nextInt());
            System.out.print("Bunga Keladi : ");
            toko_bunga[index][2] = Integer.toString(Integer.parseInt(toko_bunga[index][2]) - sc.nextInt());
            System.out.print("Bunga Alocasia : ");
            toko_bunga[index][3] = Integer.toString(Integer.parseInt(toko_bunga[index][3]) - sc.nextInt());
            System.out.print("Bunga Mawar : ");
            toko_bunga[index][4] = Integer.toString(Integer.parseInt(toko_bunga[index][4]) - sc.nextInt());
        }
    }

    public static void main(String[] args) {
        Pendapatan();
        Stok(4);
        Stok(4);
        sc.close();
    }
}
```

### 4.2 Hasil Kode Percobaan :

![Hasil](./docs/SS%204.2.1.PNG)

<br><hr>


### **5.0 Tugas**

### 5.1 Kode Tugas 1 :

```java
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char KODE[] = new char[10];
        char KOTA[][] = new char[10][12];

        KODE[0] = 'A';
        KODE[1] = 'B';
        KODE[2] = 'D';
        KODE[3] = 'E';
        KODE[4] = 'F';
        KODE[5] = 'G';
        KODE[6] = 'H';
        KODE[7] = 'L';
        KODE[8] = 'N';
        KODE[9] = 'T';

        KOTA[0][0] = 'B';
        KOTA[0][1] = 'A';
        KOTA[0][2] = 'N';
        KOTA[0][3] = 'T';
        KOTA[0][4] = 'E';
        KOTA[0][5] = 'N';

        KOTA[1][0] = 'J';
        KOTA[1][1] = 'A';
        KOTA[1][2] = 'K';
        KOTA[1][3] = 'A';
        KOTA[1][4] = 'R';
        KOTA[1][5] = 'T';
        KOTA[1][6] = 'A';

        KOTA[2][0] = 'B';
        KOTA[2][1] = 'A';
        KOTA[2][2] = 'N';
        KOTA[2][3] = 'D';
        KOTA[2][4] = 'U';
        KOTA[2][5] = 'N';
        KOTA[2][6] = 'G';

        KOTA[3][0] = 'C';
        KOTA[3][1] = 'I';
        KOTA[3][2] = 'R';
        KOTA[3][3] = 'E';
        KOTA[3][4] = 'B';
        KOTA[3][5] = 'O';
        KOTA[3][6] = 'N';

        KOTA[4][0] = 'B';
        KOTA[4][1] = 'O';
        KOTA[4][2] = 'G';
        KOTA[4][3] = 'O';
        KOTA[4][4] = 'R';

        KOTA[5][0] = 'P';
        KOTA[5][1] = 'E';
        KOTA[5][2] = 'K';
        KOTA[5][3] = 'A';
        KOTA[5][4] = 'L';
        KOTA[5][5] = 'O';
        KOTA[5][6] = 'N';
        KOTA[5][7] = 'G';
        KOTA[5][8] = 'A';
        KOTA[5][9] = 'N';

        KOTA[6][0] = 'S';
        KOTA[6][1] = 'E';
        KOTA[6][2] = 'M';
        KOTA[6][3] = 'A';
        KOTA[6][4] = 'R';
        KOTA[6][5] = 'A';
        KOTA[6][6] = 'N';
        KOTA[6][7] = 'G';

        KOTA[7][0] = 'S';
        KOTA[7][1] = 'U';
        KOTA[7][2] = 'R';
        KOTA[7][3] = 'A';
        KOTA[7][4] = 'B';
        KOTA[7][5] = 'A';
        KOTA[7][6] = 'Y';
        KOTA[7][7] = 'A';

        KOTA[8][0] = 'M';
        KOTA[8][1] = 'A';
        KOTA[8][2] = 'L';
        KOTA[8][3] = 'A';
        KOTA[8][4] = 'N';
        KOTA[8][5] = 'G';

        KOTA[9][0] = 'T';
        KOTA[9][1] = 'E';
        KOTA[9][2] = 'G';
        KOTA[9][3] = 'A';
        KOTA[9][4] = 'L';

        System.out.print("Masukkan Kode Plat Nomor : ");
        char kode_input = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < KODE.length; i++) {
            if (kode_input == KODE[i]) {
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
            }
        }

        sc.close();
    }
}
```

### 5.1 Hasil Kode Tugas 1 :

![Hasil](./docs/SS%205.2.1.PNG)

<br><hr>

### 5.2 Kode Tugas 2 :

```java
import java.util.Scanner;

public class Tugas2 {

    static Scanner sc = new Scanner(System.in);
    static double s, t, v;

    static void Menu() {
        System.out.println("[1] Hitung Kecepatan");
        System.out.println("[2] Hitung Jarak");
        System.out.println("[3] Hitung Waktu");
        System.out.print("Pilihan anda : ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.print("Masukkan jarak : ");
                s = sc.nextDouble();
                System.out.print("Masukkan waktu : ");
                t = sc.nextDouble();
                System.out.println("Kecepatan : " + HitungKecepatan(s, t));
                break;

            case 2:
                System.out.print("Masukkan kecepatan : ");
                v = sc.nextDouble();
                System.out.print("Masukkan waktu : ");
                t = sc.nextDouble();
                System.out.println("Jarak : " + HitungJarak(v, t));
                break;

            case 3:
                System.out.print("Masukkan jarak : ");
                s = sc.nextDouble();
                System.out.print("Masukkan kecepatan : ");
                v = sc.nextDouble();
                System.out.println("Waktu : " + HitungWaktu(s, v));
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    static double HitungKecepatan(double s, double t) {
        return v = s / t;
    }

    static double HitungJarak(double v, double t) {
        return s = v * t;
    }

    static double HitungWaktu(double s, double v) {
        return t = s / v;
    }

    public static void main(String[] args) {
        Menu();
    }
}
```

### 5.2 Hasil Kode Tugas 2 :

``Hitung Kecepatan`` <br>
![Hasil](./docs/SS%205.2.2.PNG)

``Hitung Jarak`` <br>
![Hasil](./docs/SS%205.2.3.PNG)

``Hitung Waktu`` <br>
![Hasil](./docs/SS%205.2.4.PNG)