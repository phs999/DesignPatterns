package creational.factorymethod.example2;

//在实际应用中，部分属性和方法是已知的，只有部分方法需要子类实现，所以用抽象类
public abstract class VideoFactory {
    public abstract Video getVideo();

}
