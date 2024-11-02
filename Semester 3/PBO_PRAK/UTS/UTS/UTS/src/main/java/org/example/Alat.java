package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alat
{
    public static Date konversiKeTanggal(String strDdMmYyyy)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            return sdf.parse(strDdMmYyyy);
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
