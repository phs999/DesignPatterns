package behavioral.visitor.courseExample;

/**
 * 通过方法的重载实现了对不同角色对象区别处理
 */
public class Visitor implements IVisitor {

    //访问免费课程，打印所有免费课程名称
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程:"+freeCourse.getName());
    }

    //访问收费课程，打印所有收费课程名称及价格
    @Override
    public void visit(TollCourse tollCourse) {
        System.out.println("收费课程:"+tollCourse.getName()+" 价格:"+tollCourse.getPrice()+"元");
    }

}
