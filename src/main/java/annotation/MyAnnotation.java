package annotation;

import java.lang.annotation.*;

/**
 * @author didi
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String name() default "zhuluxu";
    int age() default -1;
}
