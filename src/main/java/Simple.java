public class Simple {
    double p;
    double t;
    double r;
    Simple(double x,double y,double z)
    {
        p=x;
        t=y;
        r=z;
    }
    double simple_display()
    {
        return (p*t*r)/100;
    }
    double compound_display(int n)
    {
        return (p*Math.pow((1+(r/n)),(n*t)))-p;
    }

}
