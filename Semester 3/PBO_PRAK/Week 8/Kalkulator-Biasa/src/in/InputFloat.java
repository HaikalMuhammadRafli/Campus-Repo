package in;

public class InputFloat extends Input {

    public InputFloat(String operator, String strBilangan1, String strBilangan2) {
        super(operator, strBilangan1, strBilangan2);
    }

    public Object getBilangan1() {
        Float x = Float.parseFloat(strBilangan1);
        return x;
    }

    public Object getBilangan2() {
        Float x = Float.parseFloat(strBilangan2);
        return null;
    }
}
