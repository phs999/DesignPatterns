package creational.prototype.example2.clone;

import creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday=new Date(0L);
        Pig pig1=new Pig("佩奇",birthday);
        Pig pig2= (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        pig1.getBirthday().setTime(5555555555L);
        System.out.println(pig1);
        System.out.println(pig2);

//        HungrySingleton hungrySingleton=HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton clonehungrySingleton= (HungrySingleton) method.invoke(hungrySingleton);
//        System.out.println(hungrySingleton);
//        System.out.println(clonehungrySingleton);
    }
}