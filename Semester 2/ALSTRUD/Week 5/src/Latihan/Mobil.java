
public class Mobil {

    String merk, tipe;
    int tahun, top_acceleration, top_power;

    Mobil(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    int getHighestAccel(Mobil arr[], int l, int r) {
        if (l == r) {
            return arr[l].top_acceleration;
        }

        int mid = (r + l) / 2;

        int lHighest = getHighestAccel(arr, l, mid);
        int rHighest = getHighestAccel(arr, mid + 1, r);

        return Math.max(lHighest, rHighest);
    }

    int getLowestAccel(Mobil arr[], int l, int r) {
        if (l == r) {
            return arr[l].top_acceleration;
        }

        int mid = (r + l) / 2;

        int lLowest = getLowestAccel(arr, l, mid);
        int rLowest = getLowestAccel(arr, mid + 1, r);

        return Math.min(lLowest, rLowest);
    }

    double getAvgTopPower(Mobil arr[]) {
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].top_power;
        }

        return total / arr.length;
    }
}
