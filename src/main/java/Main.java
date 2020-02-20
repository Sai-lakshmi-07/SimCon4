public class Main {
    public static void main(String[] args)
    {
        double simple_interest,construction_cost,compound_interest;
        Simple s=new Simple(1234,72,50);
        simple_interest=s.simple_display();
        System.out.println("SimpleInterest : "+simple_interest+"/-");
        compound_interest=s.compound_display(3);
        System.out.println("CompoundInterest : "+compound_interest+"/-");
        Construction c = new Construction("Low",73,true);
        construction_cost=c.calculate();
        System.out.println("Total House Construction Cost : "+construction_cost+"/-");

    }
}
