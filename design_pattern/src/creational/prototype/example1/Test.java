package creational.prototype.example1;

/**
 * String需要进一步深克隆吗？
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person)p1.clone();
        System.out.println(p1.loc);
        System.out.println(p2.loc);

        System.out.println(p1.loc.street == p2.loc.street);
        p1.loc.street.reverse();// = "sh";
        System.out.println(p1.loc.street == p2.loc.street);
        System.out.println(p1.loc.street);
        System.out.println(p2.loc.street);

        //p1.loc.street.replace("sh", "sz");
       // System.out.println(p2.loc.street);
    }
}
