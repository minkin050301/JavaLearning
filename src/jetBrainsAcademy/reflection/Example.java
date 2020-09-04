package jetBrainsAcademy.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Example {

    public static void main(String[] args) {
        try {
            Class student = Class.forName("jetBrainsAcademy.reflection.Student");

            Constructor[] declaredConstructors = student.getDeclaredConstructors();
            Constructor[] constructors = student.getConstructors();
            Field[] declaredFields = student.getDeclaredFields();
            Field[] fields = student.getFields();
            Method[] declaredMethods = student.getDeclaredMethods();
            Method[] methods = student.getMethods();

            for(Constructor dc : declaredConstructors) {
                System.out.println("Declared Constructor " + dc.getName());
            }
            for (Constructor c : constructors) {
                System.out.println("Constructor " + c.getName());
            }
            for (Field df : declaredFields) {
                System.out.println("Declared Field " + df.getName());
            }
            for (Field f : fields) {
                System.out.println("Field " + f.getName());
            }
            for (Method dm : declaredMethods) {
                System.out.println("Declared Method " + dm.getName());
            }
            for (Method m : methods) {
                System.out.println("Method " + m.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}