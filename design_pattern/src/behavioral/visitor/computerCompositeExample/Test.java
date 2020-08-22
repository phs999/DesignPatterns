package behavioral.visitor.computerCompositeExample;

public class Test {
    public static void main(String[] args) {
        PersonelVisitor p1 = new PersonelVisitor();
        CorpVisitor p2=new CorpVisitor();
        new Computer().acccept(p1);
        System.out.println("PersonelVisitor buy a computer,price is:"+p1.totalPrice);
        new Computer().acccept(p2);
        System.out.println("CorpVisitor buy a computer,price is:"+p2.totalPrice);
    }
}
