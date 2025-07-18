package Java;

public class Rectangle {
    private double length;
    private double weidth;


    public void setlength(double l) {
        length = l;
    }
    public void setWeidth (double w )
    {
        weidth = w ;
    }
    public double getLength ()
    {
        return length ;
    }

    public double getWeidth() {
        return weidth;
    }
    public double getarea ()
    {
        return weidth*length ;
    }
}