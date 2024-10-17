import in.Input;
import in.InputFloat;
import in.InputInteger;

import java.util.Scanner;

public class Tampilan {

    private final Scanner scanner;
    private String tipeData;
    private Input input;

    public Tampilan() {
        this.scanner = new Scanner(System.in);
        this.tipeData = "int";
    }

    public void Tampilkan() {
        // Tipe data
        System.out.print("Masukkan Tipe Data : ");
        this.tipeData = this.scanner.nextLine();

        // Input B1
        System.out.print("Masukkan Bilangan ke-1 : ");
        String strB1 = this.scanner.nextLine();

        // Input B2
        System.out.print("Masukkan Bilangan ke-2 : ");
        String strB2 = this.scanner.nextLine();

        // Input Operator
        System.out.print("Masukkan Operator : ");
        String op = this.scanner.nextLine();

        // Buat Object input dari inputan oleh user
        if (this.tipeData.equals("int")) {
            this.input = new InputInteger(op, strB1, strB2);
        } else if (this.tipeData.equals("float")) {
            this.input = new InputFloat(op, strB1, strB2);
        } else {
            System.out.println("Input tidak valid!");
            new Exception("Input tidak valid!");
        }
    }

    public Input getInput() {
        return this.input;
    }

    public String getTipeData() {
        return tipeData;
    }
}
