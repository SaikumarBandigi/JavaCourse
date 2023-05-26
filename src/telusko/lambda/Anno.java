package telusko.lambda;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Cricketplayer {

    int age();

}

@Cricketplayer(age = 26)
class Virat {

    public int disc() {
        return 25;
    }


}


public class Anno {
    public static void main(String[] args) {


        Virat v = new Virat();
        Class c = v.getClass();
        Annotation annotation = c.getAnnotation(Cricketplayer.class);

        Cricketplayer cc = (Cricketplayer) annotation;

        System.out.println(cc.age());
        System.out.println(v.disc());

    }
}
