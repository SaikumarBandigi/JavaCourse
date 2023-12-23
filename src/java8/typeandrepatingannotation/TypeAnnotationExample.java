package java8.typeandrepatingannotation;

public class TypeAnnotationExample {
    public static void main(String[] args) {

        @MyTypeAnnotation("custom")
        String value = "Hello, World!";

        System.out.println(value);

    }
}
