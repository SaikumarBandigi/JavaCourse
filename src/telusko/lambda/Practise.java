package telusko.lambda;

import java.lang.annotation.*;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MyAnnotation {
    String value();

    int count();
}

class MyClass {
    @MyAnnotation(value = "sai", count = 88)
    private String myField;

    public void displayAnnotationValue() {
        // MyAnnotation annotation = null;

        try {
            //  annotation = MyClass.class.getDeclaredField("myField").getAnnotation(MyAnnotation.class);
            Field field = new MyClass().getClass().getDeclaredField("myField");
            Annotation annotation = field.getAnnotation(MyAnnotation.class);

            MyAnnotation myAnnotation=(MyAnnotation) annotation;

            System.out.println(myAnnotation.count());
            System.out.println(myAnnotation.value());


        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        //  System.out.println(annotation.value());
        //System.out.println(annotation.count());

    }
}

public class Practise {
    public static void main(String[] args) throws NoSuchFieldException {
        MyClass obj = new MyClass();
        obj.displayAnnotationValue();
    }
}