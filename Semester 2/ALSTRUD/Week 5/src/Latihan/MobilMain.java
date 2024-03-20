
public class MobilMain {

    static String[][] data = {
            { "BMW", "M2 Coupe", "2016", "6816", "728" },
            { "Ford", "Fiesta ST", "2014", "3921", "575" },
            { "Nissan", "370Z", "2009", "4360", "657" },
            { "Subaru", "BRZ", "2014", "4058", "609" },
            { "Subaru", "Impreza WRX STI", "2013", "6255", "703" },
            { "Toyota", "AE86 Trueno", "1986", "3700", "553" },
            { "Toyota", "86/GT86", "2014", "4180", "609" },
            { "Volkswagen", "Golf GTI", "2014", "4180", "631" }
    };

    static void showData() {
        System.out.printf("| %-4s | %-12s | %-17s | %-7s | %-18s | %-11s |\n", "NO", "MERK", "TIPE", "TAHUN",
                "TOP ACCELERATION",
                "TOP POWER");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("| %-4s | %-12s | %-17s | %-7s | %-18s | %-11s |\n",
                    i + 1,
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    data[i][3],
                    data[i][4]);
        }
    }

    public static void main(String[] args) {

        Mobil mobil[] = new Mobil[8];

        for (int i = 0; i < mobil.length; i++) {
            mobil[i] = new Mobil(data[i][0], data[i][1], Integer.parseInt(data[i][2]), Integer.parseInt(data[i][3]),
                    Integer.parseInt(data[i][4]));
        }

        showData();

        System.out.println("Akselerasi Tertinggi : " + mobil[0].getHighestAccel(mobil, 0, mobil.length - 1));
        System.out.println("Akselerasi Terendah : " + mobil[0].getLowestAccel(mobil, 0, mobil.length - 1));
        System.out.println("Rata-rata Power : " + mobil[0].getAvgTopPower(mobil));
    }
}
