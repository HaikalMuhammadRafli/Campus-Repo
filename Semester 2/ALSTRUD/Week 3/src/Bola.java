public class Bola {

    int jariJari;

    public double getLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double getVolume() {
        return 4 * Math.PI * Math.pow(jariJari, 3) / 3;
    }
}
