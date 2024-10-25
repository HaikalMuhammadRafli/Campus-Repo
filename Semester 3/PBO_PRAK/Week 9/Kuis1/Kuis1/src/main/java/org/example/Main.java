package org.example;

import com.yunhasnawa.exam.Kuis1Exam;
import com.yunhasnawa.jeutest.ExamData;
import com.yunhasnawa.jeutest.ExamWork;
import org.example.in.Input;
import org.example.in.InputFloat;
import org.example.in.InputInteger;

public class Main extends Kuis1Exam implements ExamWork /* ⚠️ <-- JANGAN UBAH BARIS INI! ⚠️*/
{
    public static void main(String[] args)
    {
        // Tampilkan Tampilan, dan dapatkan Input
        Tampilan t = new Tampilan();
        t.tampilkan();
        Input i = t.getInput();

        // Perhitungan dengan Mesin
        Mesin m = new Mesin();

        // Cek dulu, Input itu yang Integer atau yang Float?
        if(i instanceof InputInteger inputInt)
            m.hitung(inputInt);
        else if (i instanceof InputFloat)
            m.hitung((InputFloat) i);

        System.out.println(m.getHasil());


        /* ----------------------------------------------------------------------- */
        /* Kode untuk memeriksa pekerjaan Anda. Jangan mengubah kode di bawah ini! */
        /* ----------------------------------------------------------------------- */
        Main mainClass = new Main();
        mainClass.check();
        /* ----------------------------------------------------------------------- */
    }

    @Override
    public ExamData getExamData()
    {
        return new ExamData(
            "Haikal Muhammad Rafli",         // <-- Ganti dengan Nama Anda!
            "2341720008",                            // <-- Ganti dengan NIM Anda!
            "TI-2H  ",                                // <-- Ganti dengan nama kelas Anda!
            "http://34.82.192.248/jeutest-server/"  // <-- JANGAN UBAH BARIS INI! ⚠️
        );
    }
}