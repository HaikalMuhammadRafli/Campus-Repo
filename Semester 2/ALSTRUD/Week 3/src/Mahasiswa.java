public class Mahasiswa {

    String nama, nim;
    char jenis_kelamin;
    double ipk;

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
}
