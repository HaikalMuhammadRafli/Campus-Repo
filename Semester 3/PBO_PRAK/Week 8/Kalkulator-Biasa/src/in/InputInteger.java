package in;

public class InputInteger extends Input {

    public InputInteger(String operator, String strBilangan1, String strBilangan2) {
        super(operator, strBilangan1, strBilangan2);
    }

    public Object getBilangan1() {
        Integer x = Integer.parseInt(this.strBilangan1);
        return x;
    }

    public Object getBilangan2() {
        Integer x = Integer.parseInt(this.strBilangan2);
        return x;
    }
}
