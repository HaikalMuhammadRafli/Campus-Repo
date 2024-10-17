package in;

public abstract class Input {

    protected String operator;
    protected String strBilangan1;
    protected String strBilangan2;

    public Input(String operator, String strBilangan1, String strBilangan2) {
        this.operator = operator;
        this.strBilangan1 = strBilangan1;
        this.strBilangan2 = strBilangan2;
    }

    public abstract Object getBilangan1();

    public abstract Object getBilangan2();

    public String getOperator() {
        return this.operator;
    }
}
