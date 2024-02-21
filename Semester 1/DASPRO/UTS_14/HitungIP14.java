import java.util.Scanner;

public class HitungIP14 {

    public static void main(String[] args) {

        Scanner input14 = new Scanner(System.in);

        boolean session = true;
        String nama, namaMatkul, nilaiHuruf;
        float ip1 = 0.0F, ip2 = 0.0F, ip = 0.0F, nilaiKonversi;
        int jumlahMatkul = 0, sks, jumlahSKS = 0, jumlahRemidi = 0;
        char choice;

        System.out.println("Program Hitung IP");
        System.out.print("Masukkan nama mahasiswa : ");
        nama = input14.nextLine();

        while (session == true) {

            System.out.print("Masukkan nama mata kuliah : ");
            namaMatkul = input14.nextLine();
            jumlahMatkul++;

            System.out.print("Nilai (A, B+, B, C+, C, D, E) : ");
            nilaiHuruf = input14.nextLine();

            if (nilaiHuruf.equalsIgnoreCase("A")) {

                // memberi nilai yang terkonversi
                nilaiKonversi = 4.0F;
            } else if (nilaiHuruf.equalsIgnoreCase("B+")) {

                // memberi nilai yang terkonversi
                nilaiKonversi = 3.5F;
            } else if (nilaiHuruf.equalsIgnoreCase("B")) {

                // memberi nilai yang terkonversi
                nilaiKonversi = 3.0F;
            } else if (nilaiHuruf.equalsIgnoreCase("C+")) {

                // memberi nilai yang terkonversi
                nilaiKonversi = 2.5F;
            } else if (nilaiHuruf.equalsIgnoreCase("C")) {

                // memberi nilai yang terkonversi
                nilaiKonversi = 2.0F;
            } else if (nilaiHuruf.equalsIgnoreCase("D")) {

                // memberi nilai yang terkonversi
                nilaiKonversi = 1.0F;
                jumlahRemidi++;
            } else if (nilaiHuruf.equalsIgnoreCase("E")) {

                // memberi nilai yang terkonversi
                nilaiKonversi = 0.0F;
                jumlahRemidi++;
            } else {

                System.out.println("Input nilai salah!");
                System.out.println("Silahkan coba lagi!");
                continue;
            }

            System.out.print("Masukkan jumlah SKS : ");
            sks = input14.nextInt();
            // total sks
            jumlahSKS += sks;

            ip1 += (nilaiKonversi * sks);
            ip2 += sks;

            System.out.print("Apakah lanjut input nilai? (Y/N)? : ");
            choice = input14.next().charAt(0);
            input14.nextLine();

            if (choice == 'y' || choice == 'Y') {
                System.out.println();
                continue;
            } else if (choice == 'n' || choice == 'N') {
                session = false;
            } else {
                System.out.println("Input salah coba lagi!");
            }
        }

        // menghitung total IP
        ip = ip1 / ip2;

        System.out.println();
        System.out.println("----------- Jumlah Perhitungan IP -----------");
        System.out.printf("Nama mahasiswa           : %s\n", nama);
        System.out.printf("Indeks Prestasi (IP)     : %f\n", ip);
        System.out.printf("Jumlah mata kuliah       : %d\n", jumlahMatkul);
        System.out.printf("Jumlah SKS               : %s\n", jumlahSKS);
        System.out.printf("Jumlah MK yang harus perbaikan/remidi : %d\n", jumlahRemidi);
        System.out.println("---------------------------------------------");

        input14.close();
    }
}
