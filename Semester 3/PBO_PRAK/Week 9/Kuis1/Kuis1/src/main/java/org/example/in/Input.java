package org.example.in;

public abstract class Input
{
    protected String strB1; // Bilangan 1
    protected String strB2; // Bilangan 2
    private final String operator; // +, -, *, /

    public Input(String strB1, String strB2, String operator)
    {
        this.strB1 = strB1;
        this.strB2 = strB2;
        this.operator = operator;
    }

    public abstract Object getB1();
    public abstract Object getB2();

    public String getOperator()
    {
        return this.operator;
    }
}
