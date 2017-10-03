package reflectionAnnotation.first;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> cls = MyClass.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods){
            if(m.isAnnotationPresent(Test.class)){
                try {
                    int res = (int) m.invoke(cls, 2, 5);
                    System.out.println(res);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}