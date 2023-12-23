package _12_series;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethodReflectionAPI {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {


        Class c = Class.forName("_12_series.Latha");
        Latha latha = (Latha) c.newInstance();

        Method method = c.getDeclaredMethod("show", null);
        method.setAccessible(true);
        method.invoke(latha, null);
    }
}
