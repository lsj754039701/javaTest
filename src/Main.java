
import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public void test(Class<?> clazz) {
        try {
            Method method = clazz.getMethod("fun", String.class);
            annotation a = method.getAnnotation(annotation.class);
            method.invoke(clazz.newInstance(), "zll");
            System.out.println(a.name());
            System.out.println(a.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().test(test.class);

        System.out.println("Hello World!");

        user u = new user();

        user x = null;

        if (x == null){
            System.out.println("--null--");
        }


        people p = BeanUntil.convert(u, new people());

        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getNum());

        String str ="zll";
        System.out.println();

    }

}
