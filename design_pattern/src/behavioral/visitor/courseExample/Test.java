package behavioral.visitor.courseExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");

        TollCourse tollCourse = new TollCourse();
        tollCourse.setName("Java设计模式精讲 -- By Geely");
        tollCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(tollCourse);

        for(Course course : courseList){
            course.accept(new Visitor());
        }

    }
}
