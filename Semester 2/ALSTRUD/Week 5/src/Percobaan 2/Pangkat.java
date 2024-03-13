
public class Pangkat {

    public int nilai, pangkat;

    int pangkatBf(int a, int n) {
        int hasil = 0;

        for (int i = 0; i < n; i++) {
            hasil *= a;
        }

        return hasil;
    }

    int pangkatDc(int a, int n) {
        if (n == 1) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDc(a, n / 2) * pangkatDc(a, n / 2) * a);
            } else {
                return (pangkatDc(a, n / 2) * pangkatDc(a, n / 2));
            }
        }
    }
}
