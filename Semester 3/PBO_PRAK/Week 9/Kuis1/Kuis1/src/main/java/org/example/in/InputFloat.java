package org.example.in;

public class InputFloat extends Input
{
    public InputFloat(String strB1, String strB2, String operator) {
        super(strB1, strB2, operator);
    }

    @Override
    public Object getB1()
    {
        float b1 = Float.parseFloat(this.strB1);
        Object ob1 = (Object) b1;
        return ob1;
    }

    @Override
    public Object getB2()
    {
        float b2 = Float.parseFloat(this.strB2);
        Object ob2 = (Object) b2;
        return ob2;
    }
}
