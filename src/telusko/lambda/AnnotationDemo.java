package telusko.lambda;


import java.lang.annotation.*;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name() default " Reddy";
}


public class AnnotationDemo {
    @Author
    public void myMethod() {

    }

    public static void main(String[] args) {

        AnnotationDemo demo = new AnnotationDemo();
        try {

            Class c =demo.getClass();

            Method m = c.getMethod("myMethod");
            Author an = m.getAnnotation(Author.class);
            System.out.println(an.name());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}
