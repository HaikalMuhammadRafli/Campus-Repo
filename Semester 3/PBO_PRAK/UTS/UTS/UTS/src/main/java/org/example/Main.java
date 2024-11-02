package org.example;

import com.yunhasnawa.exam.UTSExam;
import com.yunhasnawa.exam.Util;
import com.yunhasnawa.jeutest.ExamData;
import com.yunhasnawa.jeutest.ExamWork;

import java.text.SimpleDateFormat;

public class Main extends UTSExam implements ExamWork /* ⚠️ <-- JANGAN UBAH BARIS INI! ⚠️*/
{
    public static void main(String[] args)
    {
        ManajerKegiatan manajer = new ManajerKegiatan();

        // Menambahkan kegiatan
        manajer.tambahKegiatan(new Kegiatan("Nonton film di bioskop", 3));
        manajer.tambahKegiatan(new Kegiatan("Daftar seminar analisis data", 2));
        manajer.tambahKegiatan(new Kegiatan("Telepon ibuk minta tambahan uang saku", 1));

        manajer.tambahKegiatan(new KegiatanKerja("Buat Proposal", 2, "Pak Haikal"));
        manajer.tambahKegiatan(new TugasKuliah("UTS PBO Praktikum", 1,"31-10-2024", "PBO"));
        manajer.tambahKegiatan(new TugasKuliah("Modul Bahasa Inggris", 1, Util.formatDate("31-10-2024"), "BHS INGGRIS"));
        manajer.tambahKegiatan(new KegiatanMendesak("Beli telur"));

        // Menampilkan semua kegiatan
        manajer.tampilkanSemuaKegiatan();

        // Menandai kegiatan sebagai selesai
        manajer.selesaikanKegiatan("Daftar seminar analisis data");
        manajer.selesaikanKegiatan("Buat Proposal");
        manajer.selesaikanKegiatan("Beli Telur");

        // Menampilkan kegiatan yang selesai
        manajer.tampilkanKegiatanSelesai();

        // Menampilkan kegiatan yang belum selesai
        manajer.tampilkanKegiatanBelumSelesai();

        // Menampilkan jumlah kegiatan yang sudah selesai dan belum selesai
        System.out.println("Jumlah Kegiatan Yang Sudah Selesai = " + manajer.getJumlahKegiatanSelesai());
        System.out.println("Jumlah Kegiatan Yang Belum Selesai = " + manajer.getJumlahKegiatanBelumSelesai());

        System.out.println("TEST SELESAI");

        /* ----------------------------------------------------------------------- */
        /* Kode untuk memeriksa pekerjaan Anda. Jangan mengubah kode di bawah ini! */
        /* ----------------------------------------------------------------------- */
        Main mainClass = new Main();
        mainClass.check();
        /* ----------------------------------------------------------------------- */

        System.out.println("waduh");
    }

    @Override
    public ExamData getExamData()
    {
        return new ExamData(
                "Haikal Muhammad Rafli",          // <-- Ganti dengan Nama Anda!
                "2341720008",                             // <-- Ganti dengan NIM Anda!
                "TI-2H",                                 // <-- Ganti dengan nama kelas Anda!
                "http://34.82.192.248/jeutest-server/"  // <-- JANGAN UBAH BARIS INI! ⚠️
        );
    }
}