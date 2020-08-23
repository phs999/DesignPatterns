package structural.Adapter.objectadapter;

public class Adapter implements Target {
    Adaptee adaptee=new Adaptee();
    @Override
    public void request() {
        adaptee.adapteerequest();
    }
}
