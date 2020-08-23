package structural.Adapter.objectadapter;

import structural.Adapter.classadapter.Target;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
