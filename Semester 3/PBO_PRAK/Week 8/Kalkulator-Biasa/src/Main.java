import in.Input;
import in.InputInteger;

public class Main {
    public static void main(String[] args) {
        Tampilan t = new Tampilan();
        t.Tampilkan();
        Input i = t.getInput();

        Mesin m = new Mesin();
        String hasil = switch (t.getTipeData()) {
            case "int" -> m.hitung((InputInteger) i);
            default -> throw new IllegalStateException("Unexpected value: " + t.getTipeData());
        };
        System.out.println("--------------------");
        System.out.println(
                i.getBilangan1().toString() + " " +
                        i.getOperator() + " " +
                        i.getBilangan2().toString() + " " +
                        " = " + hasil
        );
    }
}
