package structural.Adapter.objectadapter;

public class Test {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.request();
    }
}
