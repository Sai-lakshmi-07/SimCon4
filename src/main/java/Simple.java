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
    double display()
    {
        return (p*t*r)/100;
    }

}
