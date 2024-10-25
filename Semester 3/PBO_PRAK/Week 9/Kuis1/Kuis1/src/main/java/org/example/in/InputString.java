package org.example.in;

public class InputString extends Input{

    public InputString(String strB1, String strB2, String operator) {
        super(strB1, strB2, operator);
    }

    @Override
    public Object getB1() {
        return strB1;
    }

    @Override
    public Object getB2() {
        return strB2;
    }
}
