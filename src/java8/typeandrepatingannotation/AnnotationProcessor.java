package java8.typeandrepatingannotation;

import java.lang.reflect.Method;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "default";
}


public class AnnotationProcessor {
    public static void main(String[] args) {

        Class<Sonu> clazz = Sonu.class;
        MyAnnotation classAnnotation = clazz.getAnnotation(MyAnnotation.class);

        if (classAnnotation != null) {
            System.out.println("Class Annotation Value: " + classAnnotation.value());
        }

        Method method = null;
        try {
            method = clazz.getMethod("add");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);

        if (methodAnnotation != null) {
            System.out.println("Method Annotation Value: " + methodAnnotation.value());
        }

    }
}

@MyAnnotation(value = "Sai Kumar")
class Sonu {
    @MyAnnotation(value = "Raju")
   public void add() {

    }

}