import in.InputFloat;
import in.InputInteger;

public class Mesin {

    public String hitung(InputInteger input) {
        Integer b1 = (Integer) input.getBilangan1();
        Integer b2 = (Integer) input.getBilangan2();

        Integer hasil = switch (input.getOperator()) {
            case "+" -> b1 + b2;
            case "-" -> b1 - b2;
            case "*" -> b1 * b2;
            case "/" -> b1 / b2;
            case "%" -> b1 % b2;
            default -> 0;
        };

        return hasil.toString();
    }

    public String hitung(InputFloat input) {
        Float b1 = (Float) input.getBilangan1();
        Float b2 = (Float) input.getBilangan2();

        Float hasil = switch (input.getOperator()) {
            case "+" -> b1 + b2;
            case "-" -> b1 - b2;
            case "*" -> b1 * b2;
            case "/" -> b1 / b2;
            case "%" -> b1 % b2;
            default -> 0.0f;
        };

        return hasil.toString();
    }
}

