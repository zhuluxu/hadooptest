package annotation;

import model.Student;

import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        Class<?> studentClass = Student.class;

        Method method = studentClass.getMethod("testMyAnnotation");
        //判断testMyAnnotation()方法上是否存在@MyAnnotation注解
        boolean isPresent = method.isAnnotationPresent(MyAnnotation.class);
        if (isPresent) {
            //如果存在，打印出注解中的属性值
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.name());
            System.out.println(annotation.age());
        }
    }
}
