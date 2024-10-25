package org.example;

import org.example.in.InputFloat;
import org.example.in.InputInteger;
import org.example.in.InputString;

public class Mesin {
    private String hasil;

    public Mesin() {
        this.hasil = "";
    }

    public void hitung(InputInteger input) {
        int b1 = (int) input.getB1();
        int b2 = (int) input.getB2();
        String op = input.getOperator();

        int hasil = 0;

        switch (op) {
            case "+":
                hasil = b1 + b2;
                break;
            case "-":
                hasil = b1 - b2;
                break;
            case "*":
                hasil = b1 * b2;
                break;
            case "/":
                hasil = b1 / b2;
                break;
            case "%":
                hasil = b1 % b2;
                break;
            default:
                this.hasil = "[ERROR] Operator tidak valid!";
                return;
        }

        // Menampilkan seperti ini: 7 + 3 = 10
        this.hasil = b1 + " " + op + " " + b2 + " = " + hasil;
    }

    public void hitung(InputFloat input) {
        float b1 = (float) input.getB1();
        float b2 = (float) input.getB2();
        String op = input.getOperator();

        float hasil = 0;

        switch (op) {
            case "+":
                hasil = b1 + b2;
                break;
            case "-":
                hasil = b1 - b2;
                break;
            case "*":
                hasil = b1 * b2;
                break;
            case "/":
                hasil = b1 / b2;
                break;
            case "%":
                this.hasil = "[ERROR] Operator tidak valid!";
                return;
        }

        this.hasil = b1 + " " + op + " " + b2 + " = " + hasil;
    }

    public void hitung(InputString input) {
        String b1 = (String) input.getB1();
        String b2 = (String) input.getB2();
        String op = input.getOperator();

        String hasil;

        if (op.equals("+")) {
            hasil = b1 + b2;
        } else {
            this.hasil = "[ERROR] Operator tidak valid!";
            return;
        }
        this.hasil = b1 + " " + op + " " + b2 + " = " + hasil;
    }

    public String getHasil() {
        return this.hasil;
    }
}
