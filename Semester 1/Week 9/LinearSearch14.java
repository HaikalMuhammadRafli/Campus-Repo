import java.util.Scanner;

public class LinearSearch14 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner sc14 = new Scanner(System.in);

        // deklarasi variable dan array
        int key, hasil = 0, jmlElemen, input;
        int[] arrayInt;

        // input jumlah elemen yang di dalam array
        System.out.print("Masukkan jumlah elemen array : ");
        jmlElemen = sc14.nextInt();

        // inisialisasi array
        arrayInt = new int[jmlElemen];

        // looping input array
        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            input = sc14.nextInt();
            arrayInt[i] = input;
        }

        System.out.println();

        // input key untuk dicari
        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc14.nextInt();

        // looping search berdasarkan key
        for (int i = 0; i < arrayInt.length; i++) {

            // jika sama maka akan menyimpan variable i yang elemennya sama
            if (arrayInt[i] == key) {
                hasil = i;

                // kemudian looping di break
                break;
            }
        }

        // menampilkan hasil
        System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);

        sc14.close();
    }
}