package _1stringclasses;

public class StringImpl {
    public String variable;

    public StringImpl(String variable) {
        this.variable = variable;
    }

    public String toLowerCase()
    {
        return this.variable.toLowerCase();
    }

    public String toUpperCase()
    {
        return this.variable.toUpperCase();
    }


    public int length()
    {
        return  this.variable.length();
    }

    public boolean startsWith(String value)
    {
        return this.variable.startsWith(value);
    }

    public boolean endsWith(String value)
    {
        return this.variable.endsWith(value);
    }

    public String[] split(String value)
    {
        return this.variable.split(value);
    }
}
