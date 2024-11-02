package org.example;

import java.util.Date;

import static org.example.Alat.konversiKeTanggal;

public class TugasKuliah extends Kegiatan {

    private String namaMataKuliah;
    private Date deadlinePengumpulan;

    public TugasKuliah(String judul, Integer prioritas, String deadlinePengumpulan, String namaMataKuliah) {
        super(judul, prioritas);
        this.namaMataKuliah = namaMataKuliah;
        this.deadlinePengumpulan = konversiKeTanggal(deadlinePengumpulan);
    }

    public TugasKuliah(String judul, Integer prioritas, Date deadlinePengumpulan, String namaMataKuliah) {
        super(judul, prioritas);
        this.namaMataKuliah = namaMataKuliah;
        this.deadlinePengumpulan = deadlinePengumpulan;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public Date getDeadlinePengumpulan() {
        return deadlinePengumpulan;
    }

    public void setDeadlinePengumpulan(Date deadlinePengumpulan) {
        this.deadlinePengumpulan = deadlinePengumpulan;
    }

    @Override
    public void tampilkanKegiatan() {
        System.out.println((isSelesai() ? "[✓]" : "[ ]") + " "+ namaMataKuliah + ": " + getJudul() + " (Prioritas: " + getPrioritas() + ")" + " (Deadline: " + deadlinePengumpulan + ")");
    }
}
