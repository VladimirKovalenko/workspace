package devious.calculator;
 
import java.util.Observable;
 
public class CalcModel extends Observable
{
    public static final int OP_NONE = 0;
    public static final int OP_ADD  = 1;
    public static final int OP_SUB  = 2;
    public static final int OP_MUL  = 3;
    public static final int OP_DIV  = 4;
 
    private int pendingOp = 0;
    private int previousValue = 0;
    private int currentValue = 0;
 
    public String getValue()
    {
        return Integer.toString(currentValue);
    }
    public void addDigit(String s)
    {
        char c = s.charAt(0);
        String val = getValue() + c;
        setDisplay(Integer.parseInt(val));
    }
    public void addDigit(char c)
    {
      String val = getValue() + c;
      setDisplay(Integer.parseInt(val));
    }
    public void setOperation(int op)
    {
        if (pendingOp != OP_NONE)
            calculate();
        previousValue = currentValue;
        this.pendingOp = op;
        currentValue = 0;
    }
    public void setDisplay(int value)
    {
        currentValue = value;
        setChanged();
        notifyObservers();
    }
    public void clear()
    {
        this.pendingOp = OP_NONE;
        previousValue = 0;
        setDisplay(0);  
    }
    public void calculate()
    {
        switch (pendingOp)
        {
        case OP_ADD:
            setDisplay(previousValue + currentValue);
            break;
        case OP_SUB:
            setDisplay(previousValue - currentValue);
            break;
        case OP_MUL:
            setDisplay(previousValue * currentValue);
            break;
        case OP_DIV:
            setDisplay(previousValue / currentValue);
            break;
        } 
        pendingOp = OP_NONE;
        previousValue = 0;
    }
}