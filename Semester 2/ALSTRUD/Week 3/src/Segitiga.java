public class Segitiga {

    public int alas, tinggi;

    public Segitiga(int a, int t) {

        alas = a;
        tinggi = t;
    }

    public double HitungLuas() {
        return alas * tinggi / 2;
    }

    public double HitungKeliling() {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
}
