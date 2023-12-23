package java8.typeandrepatingannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
public @interface MyTypeAnnotation {
    String value() default "default";
}

