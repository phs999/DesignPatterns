package behavioral.visitor.courseExample;

/**
 * 定义了对不同角色的处理逻辑，通过多态区分（不用多态也可以，方法名不同也一样，核心原理没有变）
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(TollCourse tollCourse);


}
