package structural.Adapter.classadapter;

public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.adapteerequest();
    }
}
