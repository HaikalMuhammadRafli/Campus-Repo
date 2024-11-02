package org.example;

import java.util.ArrayList;
import java.util.List;

public class ManajerKegiatan
{
    private List<Kegiatan> daftarKegiatan;

    public ManajerKegiatan()
    {
        daftarKegiatan = new ArrayList<>();
    }

    // Menambahkan kegiatan ke dalam daftar
    public void tambahKegiatan(Kegiatan kegiatan)
    {
        daftarKegiatan.add(kegiatan);
    }

    // Menampilkan semua kegiatan
    public void tampilkanSemuaKegiatan()
    {
        System.out.println("Semua Kegiatan:");
        for (Kegiatan kegiatan : daftarKegiatan)
        {
            kegiatan.tampilkanKegiatan();
        }
    }

    public int getJumlahKegiatanSelesai()
    {
        int jumlah = 0;
        for (Kegiatan kegiatan : daftarKegiatan)
        {
            if (kegiatan.isSelesai())
            {
                jumlah++;
            }
        }
        return jumlah;
    }

    public int getJumlahKegiatanBelumSelesai()
    {
        int jumlah = 0;
        for (Kegiatan kegiatan : daftarKegiatan)
        {
            if (!kegiatan.isSelesai())
            {
                jumlah++;
            }
        }
        return jumlah;
    }

    // Menampilkan hanya kegiatan yang selesai
    public void tampilkanKegiatanSelesai()
    {
        System.out.println("Kegiatan yang Selesai:");
        for (Kegiatan kegiatan : daftarKegiatan)
        {
            if (kegiatan.isSelesai())
            {
                kegiatan.tampilkanKegiatan();
            }
        }
    }

    // Menampilkan hanya kegiatan yang belum selesai
    public void tampilkanKegiatanBelumSelesai()
    {
        System.out.println("Kegiatan yang Belum Selesai:");
        for (Kegiatan kegiatan : daftarKegiatan)
        {
            if (!kegiatan.isSelesai())
            {
                kegiatan.tampilkanKegiatan();
            }
        }
    }

    // Menandai kegiatan sebagai selesai berdasarkan judul
    public void selesaikanKegiatan(String judul)
    {
        for (Kegiatan kegiatan : daftarKegiatan)
        {
            if (kegiatan.getJudul().equalsIgnoreCase(judul) && !kegiatan.isSelesai())
            {
                kegiatan.tandaiSelesai();
                System.out.println("Kegiatan \"" + judul + "\" telah ditandai sebagai selesai.");
                return;
            }
        }
        System.out.println("Kegiatan \"" + judul + "\" tidak ditemukan atau sudah selesai.");
    }
}