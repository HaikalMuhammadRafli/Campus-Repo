package org.example;

public class KegiatanKerja extends Kegiatan{

    private String namaPemberiTugas;

    public KegiatanKerja(String judul, Integer prioritas, String namaPemberiTugas) {
        super(judul, prioritas);
        this.namaPemberiTugas = namaPemberiTugas;
    }

    public String getNamaPemberiTugas() {
        return namaPemberiTugas;
    }

    public void setNamaPemberiTugas(String namaPemberiTugas) {
        this.namaPemberiTugas = namaPemberiTugas;
    }
}
