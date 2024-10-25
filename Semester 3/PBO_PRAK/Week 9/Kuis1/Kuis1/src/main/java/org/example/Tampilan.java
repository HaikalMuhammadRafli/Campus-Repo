package org.example;

import org.example.in.Input;
import org.example.in.InputFloat;
import org.example.in.InputInteger;
import org.example.in.InputString;

import java.util.Scanner;

public class Tampilan {
    // Jenis tipe data
    private String tipeData;
    private Input input;
    private Scanner scanner;

    public Tampilan() {
        // Buat objek scanner
        this.scanner = new Scanner(System.in);
        // Set tipe data awal
        this.tipeData = "int";
    }

    public void tampilkan() {
        System.out.print("Masukkan Tipe Data : ");
        this.tipeData = this.scanner.nextLine();

        String strB1 = "0";
        String strB2 = "0";
        String operator = "+";

        System.out.print("Masukkan Bilangan-1: ");
        strB1 = this.scanner.nextLine();

        System.out.print("Masukkan Bilangan-2: ");
        strB2 = this.scanner.nextLine();

        System.out.print("Masukkan Operator  : ");
        operator = this.scanner.nextLine();

        // Cek dulu objek Input yang mana yang akan dipakai berdasarkan tipe data
        switch (this.tipeData) {
            case "int":
                InputInteger in = new InputInteger(strB1, strB2, operator);
                this.input = (Input) in; // Up casting
                break;
            case "float":
                this.input = new InputFloat(strB1, strB2, operator);
                break;
            case "string":
                this.input = new InputString(strB1, strB2, operator);
                break;
            default:
                System.out.println("[ERROR] tipe data tidak valid!");
        }

        // Gambar garis
        System.out.println("-------------------------");
    }

    public Input getInput() {
        return input;
    }
}
