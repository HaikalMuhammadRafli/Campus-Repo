//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // variable
        int x = 0;
        int y = 1;
        float a = 1.f;
        double b = 2.f;

        // String
        String nama1 = "Haikal"; // Synthetic Sugar
        String nama2 = new String("Haikals");

        // Pass By Value Variable
        int z = x;
        x = 10;
        System.out.println("nilai z : " + z);
        System.out.println("nilai x : " + x);

        // Pass By Value String
        String nama3 = nama1;
        nama1 = "Bambang";
        System.out.println(nama3);
        System.out.println(nama1);

        // Coba Function
        System.out.println(add(100, 1));
        System.out.println(isOdd(15));
        System.out.println(addFor(2, 2, 2, 2, 2));

        // Arguments
        System.out.println("Random args : " + args[0]);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isOdd(int x) {
        return (x % 2 == 1);
    }

    static int addFor(int... input) {
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total += input[i];
        }

        return total;
    }
}