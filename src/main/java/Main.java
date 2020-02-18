public class Main {
    public static void main(String[] args)
    {
        double rs,rc;
        Simple s=new Simple(1234,72,50);
        rs=s.display();
        System.out.println("SimpleInterest : "+rs+"/-");
        Construction c = new Construction("Low",73,true);
        rc=c.calculate();
        System.out.println("Total House Construction Cost : "+rc+"/-");

    }
}
