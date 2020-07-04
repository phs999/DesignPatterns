package creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourceFactory();
        Video video = courseFactory.getVideo();
        video.produce();
    }

}
