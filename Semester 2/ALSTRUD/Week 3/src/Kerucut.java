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