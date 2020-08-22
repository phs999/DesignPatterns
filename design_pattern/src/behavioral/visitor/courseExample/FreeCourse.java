package behavioral.visitor.courseExample;

/**
 * 免费课程
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
